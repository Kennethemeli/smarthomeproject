package SecurityService;



import com.ken.security.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class SecurityClient {
    private final ManagedChannel channel;
    private final SecurityServiceGrpc.SecurityServiceBlockingStub blockingStub;
    private final SecurityServiceGrpc.SecurityServiceStub asyncStub;

    public SecurityClient(String host, int port) {
        this.channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        blockingStub = SecurityServiceGrpc.newBlockingStub(channel);
        asyncStub = SecurityServiceGrpc.newStub(channel);
    }

    public void toggleLock(boolean lock) {
        LockRequest request = LockRequest.newBuilder().setLock(lock).build();
        LockResponse response = blockingStub.toggleLock(request);
        if (response.getSuccess()) {
            System.out.println("Lock operation was successful: " + (lock ? "Locked" : "Unlocked"));
        } else {
            System.out.println("Lock operation failed.");
        }
    }

    public void setSecuritySettings() throws InterruptedException {
        // Create an array of SecurityData
        SecurityData[] securitySettingsArray = {
                new SecurityData(true, true),
                new SecurityData(false, true),
                new SecurityData(true, false),
                new SecurityData(false, false),
                new SecurityData(true, true),
                new SecurityData(true, false),
                new SecurityData(false, true),
                new SecurityData(false, false),
                new SecurityData(true, true),
                new SecurityData(false, false)
        };

        CountDownLatch finishLatch = new CountDownLatch(1);
        StreamObserver<SecuritySettingsRequest> requestObserver = asyncStub.setSecuritySettings(new StreamObserver<SecuritySettingsResponse>() {
            @Override
            public void onNext(SecuritySettingsResponse response) {
                System.out.println("Security settings updated successfully: " + response.getSuccess());
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error: " + t);
                finishLatch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Finished updating security settings.");
                finishLatch.countDown();
            }
        });

        try {
            // Stream each SecurityData object to the server
            for (SecurityData data : securitySettingsArray) {
                SecuritySettingsRequest request = SecuritySettingsRequest.newBuilder()
                        .setAlarmOn(data.isAlarmOn())
                        .setLock(data.isLock())
                        .build();
                requestObserver.onNext(request);
            }
            // Mark the end of requests
            requestObserver.onCompleted();

            // Receiving happens asynchronously
            if (!finishLatch.await(1, TimeUnit.MINUTES)) {
                System.err.println("Security settings update cannot finish within 1 minute");
            }
        } catch (RuntimeException e) {
            // Cancel RPC
            requestObserver.onError(e);
            throw e;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SecurityClient client = new SecurityClient("localhost", 3002);
        client.toggleLock(true); // Unary call
        client.setSecuritySettings(); // Client-side streaming call
    }
}

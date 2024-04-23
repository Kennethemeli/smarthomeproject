package TemperatureService;

import com.ken.temperature.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class TemperatureClient {
    private final ManagedChannel channel;
    private final TemperatureControlServiceGrpc.TemperatureControlServiceBlockingStub blockingStub;
    private final TemperatureControlServiceGrpc.TemperatureControlServiceStub asyncStub;

    public TemperatureClient(String host, int port) {
        this.channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        blockingStub = TemperatureControlServiceGrpc.newBlockingStub(channel);
        asyncStub = TemperatureControlServiceGrpc.newStub(channel);
    }

    public void setTemperature(int temperature) {
        TemperatureRequest request = TemperatureRequest.newBuilder()
                .setDesiredTemperature(temperature)
                .build();
        TemperatureResponse response = blockingStub.setTemperature(request);
        if (response.getSuccess()) {
            System.out.println("Temperature set successfully!");
        } else {
            System.out.println("Failed to set temperature");
        }
    }

    public void streamTemperature() {
        TemperatureStreamRequest request = TemperatureStreamRequest.newBuilder().build();
        asyncStub.streamTemperature(request, new StreamObserver<TemperatureResponse>() {
            @Override
            public void onNext(TemperatureResponse response) {
                System.out.println("Current temperature: " + response.getCurrentTemperature());
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Streaming temperatures completed.");
            }
        });
    }

    public static void main(String[] args) throws InterruptedException {
        TemperatureClient client = new TemperatureClient("localhost", 3001);
        client.setTemperature(23); // Unary call
        client.streamTemperature(); // Server streaming call
        Thread.sleep(5000); // Wait to see server streaming output
    }
}

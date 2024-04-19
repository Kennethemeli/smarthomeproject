package SecurityService;

import com.ken.security.*;
import io.grpc.stub.StreamObserver;

public class SecurityServerImpl extends SecurityServiceGrpc.SecurityServiceImplBase {
    public void toggleLock(LockRequest req, StreamObserver<LockResponse> responseObserver) {
        LockResponse response = LockResponse.newBuilder()
                .setSuccess(true)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<SecuritySettingsRequest> setSecuritySettings(StreamObserver<SecuritySettingsResponse> responseObserver) {
        return new StreamObserver<SecuritySettingsRequest>() {
            @Override
            public void onNext(SecuritySettingsRequest req) {
                // Process each request received from the client
                boolean alarmStatus = req.getAlarmOn();
                boolean lockStatus = req.getLock();
                System.out.println("Received settings to update - Alarm: " + (alarmStatus ? "On" : "Off") + ", Lock: " + (lockStatus ? "Lock" : "Unlock"));

                // You might process these settings and apply them to the actual system here
                // For simulation, we simply log the received settings
            }

            @Override
            public void onError(Throwable t) {
                System.out.printf(t.getMessage());
            }

            @Override
            public void onCompleted() {
                // Send a final response back to the client
                SecuritySettingsResponse response = SecuritySettingsResponse.newBuilder()
                        .setSuccess(true)
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        };
    }
}

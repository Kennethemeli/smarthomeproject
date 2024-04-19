package TemperatureService;
import com.ken.temperature.*;
import io.grpc.stub.StreamObserver;

public class TemperatureServerImpl extends TemperatureControlServiceGrpc.TemperatureControlServiceImplBase {
    @Override
    public void setTemperature(TemperatureRequest req, StreamObserver<TemperatureResponse> responseObserver) {
        TemperatureResponse response = TemperatureResponse.newBuilder()
                .setSuccess(true)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void streamTemperature(TemperatureStreamRequest req, StreamObserver<TemperatureResponse> responseObserver) {
        for (int temp = 20; temp <= 25; temp++) {
            TemperatureResponse response = TemperatureResponse.newBuilder()
                    .setCurrentTemperature(temp)
                    .setSuccess(true)
                    .build();
            responseObserver.onNext(response);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
        responseObserver.onCompleted();
    }
}

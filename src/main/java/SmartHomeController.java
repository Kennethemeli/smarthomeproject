
import LightService.LightClient;
import SecurityService.SecurityClient;
import TemperatureService.TemperatureClient;
import com.ken.light.*;
import com.ken.temperature.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class SmartHomeController {

    public Button stramTemperatureButton;
    public Label tempData;
    public Ellipse securityLight;
    public ToggleButton toggleLightButton;
    public Circle lightControl;
    public TextField lightIdField;
    public ToggleButton toggleButton;
    public Label responseLabel;
    @FXML
    private Label tempLabel;
    @FXML
    private Slider tempSlider;
    @FXML
    private Button lockButton;
    @FXML
    private Button unlockButton;

    private ManagedChannel channel;
    private LightingServiceGrpc.LightingServiceStub asyncStub;

    private TemperatureClient tempClient;
    private LightClient lightClient;
    private SecurityClient secClient;

    @FXML
    public void initialize() {
        channel = ManagedChannelBuilder.forAddress("localhost", 3000)
                .usePlaintext()
                .build();
        asyncStub = LightingServiceGrpc.newStub(channel);
        // Initialize gRPC clients
        tempClient = new TemperatureClient("localhost", 3001);
        secClient = new SecurityClient("localhost", 3002);
        lightClient = new LightClient("localhost", 3000);

        // Listener for the temperature slider
        tempSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            tempLabel.setText("Set Temperature: " + newValue.intValue() + "°C");
            tempClient.setTemperature(newValue.intValue());
        });
    }

    @FXML
    private void handleLock(ActionEvent event) {
        securityLight.setFill(Color.GREEN);
        secClient.toggleLock(true);
    }

    @FXML
    private void handleUnlock(ActionEvent event) {
        securityLight.setFill(Color.RED);
        secClient.toggleLock(false);
    }

    public void streamTemperatureAction(ActionEvent actionEvent) {
        tempClient.streamTemperature(new StreamObserver<TemperatureResponse>() {
            @Override
            public void onNext(TemperatureResponse response) {
                Platform.runLater(() -> tempData.setText(String.valueOf(response.getCurrentTemperature())));
            }

            @Override
            public void onError(Throwable t) {
                Platform.runLater(() -> tempData.setText("Error: " + t.getMessage()));
            }

            @Override
            public void onCompleted() {
                System.out.println("Streaming temperatures completed.");
            }
        });
    }

    public void toggleLightAction(ActionEvent actionEvent) {
        if (toggleLightButton.isSelected()) {
            lightClient.setLight(false);
            toggleLightButton.setText("Off");
            lightControl.setFill(Color.GREEN);
        }
        else{
            lightClient.setLight(true);
            toggleLightButton.setText("On");
            lightControl.setFill(Color.RED);
        }
    }

    public void handleToggleLightAction() {
        new Thread(() -> {
            try {
                controlLights();
            } catch (InterruptedException e) {
                Platform.runLater(() -> responseLabel.setText("Failed: " + e.getMessage()));
            }
        }).start();
    }

    public void controlLights() throws InterruptedException {
        CountDownLatch finishLatch = new CountDownLatch(1);

        StreamObserver<LightControlRequest> requestObserver = asyncStub.interactiveLightControl(new StreamObserver<LightControlResponse>() {
            @Override
            public void onNext(LightControlResponse response) {
                Platform.runLater(() -> responseLabel.setText("Server Response: " + response.getMessage()));
            }

            @Override
            public void onError(Throwable t) {
                Platform.runLater(() -> responseLabel.setText("Interactive control failed: " + t));
                finishLatch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Stream is completed by the server.");
                finishLatch.countDown();
            }
        });

        try {
            // Send requests based on UI input
            String lightId = lightIdField.getText(); // Assuming the light ID is entered by the user in a TextField
            boolean state = toggleButton.getText().equals("Turn On"); // Toggle state based on button text
            LightControlRequest request = LightControlRequest.newBuilder()
                    .setLightId(lightId)
                    .setOn(state)
                    .build();
            requestObserver.onNext(request);

            // Simulating delay for next potential request or example
            Thread.sleep(1000); // Remove or adjust based on actual application needs

        } catch (RuntimeException e) {
            requestObserver.onError(e);
            throw e;
        }
        // Mark the end of requests
        requestObserver.onCompleted();

        // Receiving happens asynchronously
        finishLatch.await(1, TimeUnit.MINUTES);
    }

    public void shutdown() {
        if (channel != null) {
            try {
                channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

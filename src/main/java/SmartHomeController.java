
import SecurityService.SecurityClient;
import TemperatureService.TemperatureClient;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class SmartHomeController {

    @FXML
    private Label tempLabel;
    @FXML
    private Slider tempSlider;
    @FXML
    private Button lockButton;
    @FXML
    private Button unlockButton;

    private TemperatureClient tempClient;
    private SecurityClient secClient;

    @FXML
    public void initialize() {
        // Initialize gRPC clients
        tempClient = new TemperatureClient("localhost", 3001);
        secClient = new SecurityClient("localhost", 3002);

        // Listener for the temperature slider
        tempSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            tempLabel.setText("Set Temperature: " + newValue.intValue() + "°C");
            tempClient.setTemperature(newValue.intValue());
        });
    }

    @FXML
    private void handleLock(ActionEvent event) {
        secClient.toggleLock(true);
    }

    @FXML
    private void handleUnlock(ActionEvent event) {
        secClient.toggleLock(false);
    }
}

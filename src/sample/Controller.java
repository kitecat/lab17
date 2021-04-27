package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Button buttonOne;

    @FXML
    private Button buttonTwo;

    @FXML
    private Button buttonThree;

    @FXML
    private Label labelForButtons;

    @FXML
    private void clickButton1(ActionEvent actionEvent) {
        labelForButtons.setText("Clicked Button1");
    }

    @FXML
    private void clickButton2(ActionEvent actionEvent) {
        labelForButtons.setText("Clicked Button2");
    }

    @FXML
    private void clickButton3(ActionEvent actionEvent) {
        labelForButtons.setText("Clicked Button3");
    }
}

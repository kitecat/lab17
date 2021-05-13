package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Button plusOneButton;

    @FXML
    private Button minusOneButton;

    @FXML
    private TextField numTextField;

    @FXML
    private void plusOneButtonClick(ActionEvent actionEvent) {
        int number = getNumber();
        if (number < 3) {
            number++;
            numTextField.setText("" + number);
        }
    }

    @FXML
    private void minusOneButtonClick(ActionEvent actionEvent) {
        int number = getNumber();
        if (number > -5) {
            number--;
            numTextField.setText("" + number);
        }
    }

    private int getNumber() {
        return Integer.parseInt(numTextField.getText());
    }
}

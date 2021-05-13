package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Button calculateButton;

    @FXML
    private Button clearButton;

    @FXML
    private TextField sumTextField;

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    private void calculateButtonClick(ActionEvent actionEvent) {
        int sum = Integer.parseInt(aTextField.getText()) + Integer.parseInt(bTextField.getText());
        sumTextField.setText("" + sum);
    }

    @FXML
    private void clearButtonClick(ActionEvent actionEvent) {
        aTextField.clear();
        bTextField.clear();
        sumTextField.clear();
    }
}

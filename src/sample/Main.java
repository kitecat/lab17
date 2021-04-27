package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        Text text = new Text("Hello from JavaFX!");
        text.setLayoutY(80);
        text.setLayoutX(100);
        Group group = new Group(text);
        Scene scene = new Scene(group);
        primaryStage.setScene(scene);

        primaryStage.setTitle("Hello World");
        primaryStage.setWidth(300);
        primaryStage.setHeight(250);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

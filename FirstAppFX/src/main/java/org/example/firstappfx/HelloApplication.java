package org.example.firstappfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        Stage secondaryStage = new Stage();
        secondaryStage.setTitle("Secondary Stage");
        secondaryStage.setScene(new Scene(new Button("Hello from the other world"),320,240));
        secondaryStage.setResizable(false);
        secondaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
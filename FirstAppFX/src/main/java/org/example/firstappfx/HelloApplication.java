package org.example.firstappfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
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
        secondaryStage.show();

        Pane pane= new Pane();
        Button button=new Button("Ok");
        pane.getChildren().add(button);
        Circle circle = new Circle();
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        circle.radiusProperty().bind(pane.heightProperty().divide(4));
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        pane.getChildren().add(circle);
        Scene scene1= new Scene(pane, 270, 250);
        secondaryStage.setTitle("Button in Pane");
        secondaryStage.setScene(scene1);
        secondaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
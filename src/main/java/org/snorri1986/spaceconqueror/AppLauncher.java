package org.snorri1986.spaceconqueror;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppLauncher extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Scene scene = setScene();
        initStage(stage, scene);
        stage.show();
    }

    Scene setScene() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AppLauncher.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        return scene;
    }

    Stage initStage(Stage stage,Scene scene) {
        stage.setTitle("Hello!");
        stage.setScene(scene);
        return stage;
    }

    public static void main(String[] args) {
        launch();
    }
}
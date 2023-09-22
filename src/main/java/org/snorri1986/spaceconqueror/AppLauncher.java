package org.snorri1986.spaceconqueror;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AppLauncher extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Scene scene = setScene();
        initStage(stage, scene);
        stage.show();
    }

    Scene setScene() throws IOException {
        URL fxmlLocationMain = getClass().getResource("fxml/launcher-view.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(fxmlLocationMain);
        Scene scene = new Scene(fxmlLoader.load(), getOptimalWidth(), getOptimalHeight());
        return scene;
    }

    double getOptimalWidth() {
        double width = 320;
        return width;
    }

    double getOptimalHeight() {
        double height = 620;
        return height;
    }

    Stage initStage(Stage stage,Scene scene) {
        stage.setTitle("SpaceConqueror");
        stage.setScene(scene);
        return stage;
    }

    public static void main(String[] args) {
        launch();
    }
}
package org.snorri1986.spaceconqueror;

import static org.apache.log4j.helpers.Loader.getResource;

import java.io.IOException;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class AppLauncher extends Application {
  static final Logger logger = Logger.getLogger(AppLauncher.class.getName());


  @Override
  public void start(Stage stage) throws IOException {
    PropertyConfigurator.configure(getResource("log4j.properties"));
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

  Stage initStage(Stage stage, Scene scene) {
    stage.setTitle("SpaceConqueror");
    stage.setScene(scene);
    return stage;
  }

  public static void main(String[] args) {

    launch();
  }
}

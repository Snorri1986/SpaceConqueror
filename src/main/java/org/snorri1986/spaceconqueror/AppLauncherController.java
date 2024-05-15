package org.snorri1986.spaceconqueror;

import java.io.IOException;
import java.net.URL;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.log4j.Logger;

public class AppLauncherController {

  private static final Logger LOG = Logger.getLogger(AppLauncherController.class.getName());

  @FXML
  protected void onBtnSolarSystemClick() {
    try {
      Scene sceneSolarSys = setSolarSystemScene();
      Stage stageSolarSys = setSolarSystemStage(sceneSolarSys);
      stageSolarSys.show();
    } catch (IOException e) {
      LOG.error("The button SolarSystem does not work", e);
    }
  }

  public Scene setSolarSystemScene() throws IOException {
    URL fxmlLocationSolarSystem = getClass().getResource("fxml/solar-system.fxml");
    FXMLLoader fxmlLoader = new FXMLLoader(fxmlLocationSolarSystem);
    Scene solarSystem = new Scene(fxmlLoader.load(), 600, 400);
    return solarSystem;
  }


  public Stage setSolarSystemStage(Scene scene) throws IOException {
    Stage stage = new Stage();
    stage.setTitle("About Solar System");
    stage.setScene(scene);
    return stage;
  }

  @FXML
  protected void onBtnSovietUnionClick() {
    try {
      Scene sceneSovietUnion = setSovietUnionScene();
      Stage stageSovietUnion = setSovietUnionStage(sceneSovietUnion);
      stageSovietUnion.show();
    } catch (IOException e) {
      LOG.error("The button Soviet Union does not work", e);
    }
  }

  public Scene setSovietUnionScene() throws IOException {
    URL fxmlLocationSovietUnion = getClass().getResource("fxml/soviet-union.fxml");
    FXMLLoader fxmlLoader = new FXMLLoader(fxmlLocationSovietUnion);
    Scene sovietUnion = new Scene(fxmlLoader.load(), 600, 400);
    return sovietUnion;
  }

  public Stage setSovietUnionStage(Scene scene) throws IOException {
    Stage stage = new Stage();
    stage.setTitle("About Soviet Union");
    stage.setScene(scene);
    return stage;
  }

  @FXML
  protected void onBtnChinaClick() {
    try {
      Scene sceneChina = setChinaScene();
      Stage stageChina = setChinaStage(sceneChina);
      stageChina.show();
    } catch (IOException e) {
      LOG.error("The button China does not work", e);
    }
  }

  public Scene setChinaScene() throws IOException {
    URL fxmlLocationChina = getClass().getResource("fxml/china.fxml");
    FXMLLoader fxmlLoader = new FXMLLoader(fxmlLocationChina);
    Scene china = new Scene(fxmlLoader.load(), 600, 400);
    return china;
  }

  public Stage setChinaStage(Scene scene) throws IOException {
    Stage stage = new Stage();
    stage.setTitle("About China");
    stage.setScene(scene);
    return stage;
  }

  @FXML
  protected void onBtnUsaClick() {
    try {
      Scene sceneUsa = setUsaScene();
      Stage stageUsa = setUsaStage(sceneUsa);
      stageUsa.show();
    } catch (IOException e) {
      LOG.error("The button USA does not work", e);
    }
  }

  @SuppressWarnings({"checkstyle:MissingJavadocMethod", "checkstyle:AbbreviationAsWordInName"})
  public Scene setUsaScene() throws IOException {
    URL fxmlLocationUSA = getClass().getResource("fxml/usa.fxml");
    FXMLLoader fxmlLoader = new FXMLLoader(fxmlLocationUSA);
    Scene usa = new Scene(fxmlLoader.load(), 600, 400);
    return usa;
  }

  public Stage setUsaStage(Scene scene) throws IOException {
    Stage stage = new Stage();
    stage.setTitle("About USA");
    stage.setScene(scene);
    return stage;
  }

  @FXML
  protected void onBtnIndiaClick() {
    try {
      Scene sceneIndia = setIndiaScene();
      Stage stageIndia = setIndiaStage(sceneIndia);
      stageIndia.show();
    } catch (IOException e) {
      LOG.error("The button India does not work", e);
    }
  }

  public Scene setIndiaScene() throws IOException {
    URL fxmlLocationIndia = getClass().getResource("fxml/india.fxml");
    FXMLLoader fxmlLoader = new FXMLLoader(fxmlLocationIndia);
    Scene india = new Scene(fxmlLoader.load(), 600, 400);
    return india;
  }

  public Stage setIndiaStage(Scene scene) throws IOException {
    Stage stage = new Stage();
    stage.setTitle("About India");
    stage.setScene(scene);
    return stage;
  }

  @SuppressWarnings({"checkstyle:MissingJavadocMethod", "checkstyle:AbbreviationAsWordInName"})
  @FXML
  protected void onBtnSpaceXClick() {
    try {
      Scene sceneSpaceX = setSpaceXScene();
      Stage stageSpaceX = setSpaceXStage(sceneSpaceX);
      stageSpaceX.show();
    } catch (IOException e) {
      LOG.error("The button SpaceX does not work", e);
    }
  }

  @SuppressWarnings("checkstyle:MissingJavadocMethod")
  public Scene setSpaceXScene() throws IOException {
    URL fxmlLocationSpaceX = getClass().getResource("fxml/spacex.fxml");
    FXMLLoader fxmlLoader = new FXMLLoader(fxmlLocationSpaceX);
    Scene spaceX = new Scene(fxmlLoader.load(), 600, 400);
    return spaceX;
  }

  public Stage setSpaceXStage(Scene scene) throws IOException {
    Stage stage = new Stage();
    stage.setTitle("About SpaceX");
    stage.setScene(scene);
    return stage;
  }

}
package org.snorri1986.spaceconqueror.buttons;

import java.io.IOException;
import java.net.URL;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.apache.log4j.Logger;

@SuppressWarnings("checkstyle:MissingJavadocType")
public class IndiaBtnController {

  private static final Logger LOG = Logger.getLogger(IndiaBtnController.class.getName());

  @FXML
  public Button satellites;

  @FXML
  public Button gagan;

  @FXML
  public Button irnss;

  @FXML
  public Button chandrayaanOne;

  @FXML
  public Button marsOrbiter;

  @FXML
  public Button chandrayaanThree;

  @FXML
  public Button adityaL1;

  @FXML
  public Button cosmodroms;

  @FXML
  public Button peoples;

  @FXML
  protected void onBtnSatellitesClick() {
    try {
      Scene sceneSatellites = setSatellitesScene();
      Stage stageSatellites = setSatellitesStage(sceneSatellites);
      stageSatellites.show();
    } catch (IOException e) {
      LOG.error("The button Satellites does not work", e);
    }
  }

  Scene setSatellitesScene() throws IOException {
    URL fxmlLocationSatellites = getClass().getResource("india_space_program.fxml");
    FXMLLoader fxmlSatellitesLoader = new FXMLLoader(fxmlLocationSatellites);
    Scene satellites = new Scene(fxmlSatellitesLoader.load(), 1000, 700);
    return satellites;
  }


  Stage setSatellitesStage(Scene scene) throws IOException {
    Stage stage = new Stage();
    stage.setTitle("Satellites");
    stage.setScene(scene);
    return stage;
  }

  @FXML
  protected void onBtnGaganClick() {
    try {
      Scene sceneGagan = setGaganScene();
      Stage stageGagan = setGaganStage(sceneGagan);
      stageGagan.show();
    } catch (IOException e) {
      LOG.error("The button GAGAN does not work", e);
    }
  }

  Scene setGaganScene() throws IOException {
    URL fxmlLocationGagan = getClass().getResource("india_space_program.fxml");
    FXMLLoader fxmlGaganLoader = new FXMLLoader(fxmlLocationGagan);
    Scene gagan = new Scene(fxmlGaganLoader.load(), 1000, 700);
    return gagan;
  }

  Stage setGaganStage(Scene scene) throws IOException {
    Stage stage = new Stage();
    stage.setTitle("GAGAN");
    stage.setScene(scene);
    return stage;
  }

  @FXML
  protected void onBtnIrnssClick() {
    try {
      Scene sceneIrnss = setIrnssScene();
      Stage stageIrnss = setIrnssStage(sceneIrnss);
      stageIrnss.show();
    } catch (IOException e) {
      LOG.error("The button IRNSS does not work", e);
    }
  }

  Scene setIrnssScene() throws IOException {
    URL fxmlLocationIrnss = getClass().getResource("india_space_program.fxml");
    FXMLLoader fxmlIrnssLoader = new FXMLLoader(fxmlLocationIrnss);
    Scene irnss = new Scene(fxmlIrnssLoader.load(), 1000, 700);
    return irnss;
  }

  Stage setIrnssStage(Scene scene) throws IOException {
    Stage stage = new Stage();
    stage.setTitle("IRNSS");
    stage.setScene(scene);
    return stage;
  }

  @FXML
  protected void onBtnChandrayaanOneClick() {
    try {
      Scene sceneChandrayaanOne = setChandrayaanOneScene();
      Stage stageChandrayaanOne = setChandrayaanOneStage(sceneChandrayaanOne);
      stageChandrayaanOne.show();
    } catch (IOException e) {
      LOG.error("The button Chandrayaan-1 does not work", e);
    }
  }

  Scene setChandrayaanOneScene() throws IOException {
    URL fxmlLocationChandrayaanOne = getClass().getResource("india_space_program.fxml");
    FXMLLoader fxmlChandrayaanOneLoader = new FXMLLoader(fxmlLocationChandrayaanOne);
    Scene chandrayaanOne = new Scene(fxmlChandrayaanOneLoader.load(), 1000, 700);
    return chandrayaanOne;
  }

  Stage setChandrayaanOneStage(Scene scene) throws IOException {
    Stage stage = new Stage();
    stage.setTitle("Chandrayaan-1");
    stage.setScene(scene);
    return stage;
  }

  @FXML
  protected void onBtnMarsOrbiterClick() {
    try {
      Scene sceneMarsOrbiter = setMarsOrbiterScene();
      Stage stageMarsOrbiter = setMarsOrbiterStage(sceneMarsOrbiter);
      stageMarsOrbiter.show();
    } catch (IOException e) {
      LOG.error("The button MarsOrbiter does not work", e);
    }
  }

  Scene setMarsOrbiterScene() throws IOException {
    URL fxmlLocationMarsOrbiter = getClass().getResource("india_space_program.fxml");
    FXMLLoader fxmlMarsOrbiterLoader = new FXMLLoader(fxmlLocationMarsOrbiter);
    Scene marsOrbiter = new Scene(fxmlMarsOrbiterLoader.load(), 1000, 700);
    return marsOrbiter;
  }

  Stage setMarsOrbiterStage(Scene scene) throws IOException {
    Stage stage = new Stage();
    stage.setTitle("Mars Orbiter");
    stage.setScene(scene);
    return stage;
  }

  @FXML
  protected void onBtnChandrayaanThreeClick() {
    try {
      Scene sceneChandrayaanThree = setChandrayaanThreeScene();
      Stage stageChandrayaanThree = setChandrayaanThreeStage(sceneChandrayaanThree);
      stageChandrayaanThree.show();
    } catch (IOException e) {
      LOG.error("The button Chandrayaan-3 does not work", e);
    }
  }

  Scene setChandrayaanThreeScene() throws IOException {
    URL fxmlLocationChandrayaanThree = getClass().getResource("india_space_program.fxml");
    FXMLLoader fxmlChandrayaanThreeLoader = new FXMLLoader(fxmlLocationChandrayaanThree);
    Scene chandrayaanThree = new Scene(fxmlChandrayaanThreeLoader.load(), 1000, 700);
    return chandrayaanThree;
  }

  Stage setChandrayaanThreeStage(Scene scene) throws IOException {
    Stage stage = new Stage();
    stage.setTitle("Chandrayaan-3");
    stage.setScene(scene);
    return stage;
  }

  @FXML
  protected void onBtnAdityaLoneClick() {
    try {
      Scene sceneAdityaLone = setAdityaLoneScene();
      Stage stageAdityaLone = setAdityaLoneStage(sceneAdityaLone);
      stageAdityaLone.show();
    } catch (IOException e) {
      LOG.error("The button Aditya-L1 does not work", e);
    }
  }

  Scene setAdityaLoneScene() throws IOException {
    URL fxmlLocationAdityaLone = getClass().getResource("india_space_program.fxml");
    FXMLLoader fxmlAdityaLoneLoader = new FXMLLoader(fxmlLocationAdityaLone);
    Scene adityaLone = new Scene(fxmlAdityaLoneLoader.load(), 1000, 700);
    return adityaLone;
  }

  Stage setAdityaLoneStage(Scene scene) throws IOException {
    Stage stage = new Stage();
    stage.setTitle("Aditya-L1");
    stage.setScene(scene);
    return stage;
  }

  @FXML
  protected void onBtnCosmodromsClick() {
    try {
      Scene sceneCosmodroms = setCosmodromsScene();
      Stage stageCosmodroms = setCosmodromsStage(sceneCosmodroms);
      stageCosmodroms.show();
    } catch (IOException e) {
      LOG.error("The button Cosmodroms does not work", e);
    }
  }

  Scene setCosmodromsScene() throws IOException {
    URL fxmlLocationCosmodroms = getClass().getResource("india_space_program.fxml");
    FXMLLoader fxmlCosmodromsLoader = new FXMLLoader(fxmlLocationCosmodroms);
    Scene cosmodroms = new Scene(fxmlCosmodromsLoader.load(), 1000, 700);
    return cosmodroms;
  }

  Stage setCosmodromsStage(Scene scene) throws IOException {
    Stage stage = new Stage();
    stage.setTitle("India Cosmodroms");
    stage.setScene(scene);
    return stage;
  }

  @FXML
  protected void onBtnPeoplesClick() {
    try {
      Scene scenePeoples = setPeoplesScene();
      Stage stagePeoples = setPeoplesStage(scenePeoples);
      stagePeoples.show();
    } catch (IOException e) {
      LOG.error("The button Peoples does not work", e);
    }
  }

  Scene setPeoplesScene() throws IOException {
    URL fxmlLocationPeoples = getClass().getResource("india_space_program.fxml");
    FXMLLoader fxmlPeoplesLoader = new FXMLLoader(fxmlLocationPeoples);
    Scene peoples = new Scene(fxmlPeoplesLoader.load(), 1000, 700);
    return peoples;
  }

  Stage setPeoplesStage(Scene scene) throws IOException {
    Stage stage = new Stage();
    stage.setTitle("India Peoples");
    stage.setScene(scene);
    return stage;
  }

}

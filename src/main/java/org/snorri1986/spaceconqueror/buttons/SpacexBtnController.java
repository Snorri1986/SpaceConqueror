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
public class SpacexBtnController {

  private static final Logger LOG = Logger.getLogger(SpacexBtnController.class.getName());

  @FXML
  public Button falconone;

  @FXML
  public Button falconnine;

  @FXML
  public Button dragon;

  @FXML
  public Button falconheavy;

  @FXML
  public Button starship;

  @FXML
  public Button starlink;

  @FXML
  public Button elonmask;

  @FXML
  public Button cosmodroms;

  @FXML
  public Button peoples;

  @FXML
  protected void onBtnFalconOneClick() {
    try {
      Scene sceneFalconOne = setFalconOneScene();
      Stage stageFalconOne = setFalconOneStage(sceneFalconOne);
      stageFalconOne.show();
    } catch (IOException e) {
      LOG.error("The button Falcon One does not work", e);
    }
  }

  Scene setFalconOneScene() throws IOException {
    URL fxmlLocationFalconOne = getClass().getResource("spacex_space_program.fxml");
    FXMLLoader fxmlFalconOneLoader = new FXMLLoader(fxmlLocationFalconOne);
    Scene falconOne = new Scene(fxmlFalconOneLoader.load(), 1000, 700);
    return falconOne;
  }


  Stage setFalconOneStage(Scene scene) throws IOException {
    Stage stage = new Stage();
    stage.setTitle("Falcon One");
    stage.setScene(scene);
    return stage;
  }

  @FXML
  protected void onBtnFalconNineClick() {
    try {
      Scene sceneFalconNine = setFalconNineScene();
      Stage stageFalconNine = setFalconNineStage(sceneFalconNine);
      stageFalconNine.show();
    } catch (IOException e) {
      LOG.error("The button Falcon Nine does not work", e);
    }
  }

  Scene setFalconNineScene() throws IOException {
    URL fxmlLocationFalconNine = getClass().getResource("spacex_space_program.fxml");
    FXMLLoader fxmlFalconNineLoader = new FXMLLoader(fxmlLocationFalconNine);
    Scene falconNine = new Scene(fxmlFalconNineLoader.load(), 1000, 700);
    return falconNine;
  }

  Stage setFalconNineStage(Scene scene) throws IOException {
    Stage stage = new Stage();
    stage.setTitle("Falcon Nine");
    stage.setScene(scene);
    return stage;
  }

  @FXML
  protected void onBtnDragonClick() {
    try {
      Scene sceneDragon = setDragonScene();
      Stage stageDragon = setDragonStage(sceneDragon);
      stageDragon.show();
    } catch (IOException e) {
      LOG.error("The button Dragon does not work", e);
    }
  }

  Scene setDragonScene() throws IOException {
    URL fxmlLocationDragon = getClass().getResource("spacex_space_program.fxml");
    FXMLLoader fxmlDragonLoader = new FXMLLoader(fxmlLocationDragon);
    Scene dragon = new Scene(fxmlDragonLoader.load(), 1000, 700);
    return dragon;
  }

  Stage setDragonStage(Scene scene) throws IOException {
    Stage stage = new Stage();
    stage.setTitle("Dragon");
    stage.setScene(scene);
    return stage;
  }

  @FXML
  protected void onBtnFalconHeavyClick() {
    try {
      Scene sceneFalconHeavy = setFalconHeavyScene();
      Stage stageFalconHeavy = setFalconHeavyStage(sceneFalconHeavy);
      stageFalconHeavy.show();
    } catch (IOException e) {
      LOG.error("The button Falcon Heavy does not work", e);
    }
  }

  Scene setFalconHeavyScene() throws IOException {
    URL fxmlLocationFalconHeavy = getClass().getResource("spacex_space_program.fxml");
    FXMLLoader fxmlFalconHeavyLoader = new FXMLLoader(fxmlLocationFalconHeavy);
    Scene falconHeavy = new Scene(fxmlFalconHeavyLoader.load(), 1000, 700);
    return falconHeavy;
  }

  Stage setFalconHeavyStage(Scene scene) throws IOException {
    Stage stage = new Stage();
    stage.setTitle("Falcon Heavy");
    stage.setScene(scene);
    return stage;
  }

  @FXML
  protected void onBtnStarshipClick() {
    try {
      Scene sceneStarship = setStarshipScene();
      Stage stageStarship = setStarshipStage(sceneStarship);
      stageStarship.show();
    } catch (IOException e) {
      LOG.error("The button Starship does not work", e);
    }
  }

  Scene setStarshipScene() throws IOException {
    URL fxmlLocationStarship = getClass().getResource("spacex_space_program.fxml");
    FXMLLoader fxmlStarshipLoader = new FXMLLoader(fxmlLocationStarship);
    Scene starShip = new Scene(fxmlStarshipLoader.load(), 1000, 700);
    return starShip;
  }

  Stage setStarshipStage(Scene scene) throws IOException {
    Stage stage = new Stage();
    stage.setTitle("Starship");
    stage.setScene(scene);
    return stage;
  }

  @FXML
  protected void onBtnStarLinkClick() {
    try {
      Scene sceneStarLink = setStarLinkScene();
      Stage stageStarLink = setStarLinkStage(sceneStarLink);
      stageStarLink.show();
    } catch (IOException e) {
      LOG.error("The button Starlink does not work", e);
    }
  }

  Scene setStarLinkScene() throws IOException {
    URL fxmlLocationStarLink = getClass().getResource("spacex_space_program.fxml");
    FXMLLoader fxmlStarLinkLoader = new FXMLLoader(fxmlLocationStarLink);
    Scene starLink = new Scene(fxmlStarLinkLoader.load(), 1000, 700);
    return starLink;
  }

  Stage setStarLinkStage(Scene scene) throws IOException {
    Stage stage = new Stage();
    stage.setTitle("Starlink");
    stage.setScene(scene);
    return stage;
  }

  @FXML
  protected void onBtnElonMaskClick() {
    try {
      Scene sceneElonMask = setElonMaskScene();
      Stage stageElonMask = setElonMaskStage(sceneElonMask);
      stageElonMask.show();
    } catch (IOException e) {
      LOG.error("The button ElonMask does not work", e);
    }
  }

  Scene setElonMaskScene() throws IOException {
    URL fxmlLocationElonMask = getClass().getResource("spacex_space_program.fxml");
    FXMLLoader fxmlElonMaskLoader = new FXMLLoader(fxmlLocationElonMask);
    Scene elonMask = new Scene(fxmlElonMaskLoader.load(), 1000, 700);
    return elonMask;
  }

  Stage setElonMaskStage(Scene scene) throws IOException {
    Stage stage = new Stage();
    stage.setTitle("ElonMask");
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
    URL fxmlLocationCosmodroms = getClass().getResource("spacex_space_program.fxml");
    FXMLLoader fxmlCosmodromsLoader = new FXMLLoader(fxmlLocationCosmodroms);
    Scene cosmodroms = new Scene(fxmlCosmodromsLoader.load(), 1000, 700);
    return cosmodroms;
  }

  Stage setCosmodromsStage(Scene scene) throws IOException {
    Stage stage = new Stage();
    stage.setTitle("SpaceX Cosmodroms");
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
    URL fxmlLocationPeoples = getClass().getResource("spacex_space_program.fxml");
    FXMLLoader fxmlPeoplesLoader = new FXMLLoader(fxmlLocationPeoples);
    Scene peoples = new Scene(fxmlPeoplesLoader.load(), 1000, 700);
    return peoples;
  }

  Stage setPeoplesStage(Scene scene) throws IOException {
    Stage stage = new Stage();
    stage.setTitle("SpaceX Peoples");
    stage.setScene(scene);
    return stage;
  }
}

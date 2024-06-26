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
public class SovietUnionBtnController {
  private static final Logger LOG = Logger.getLogger(SovietUnionBtnController.class.getName());

  @FXML
  public Button vostok;
  @FXML
  public Button voshod;
  @FXML
  public Button soyuz;
  @FXML
  public Button mir;
  @FXML
  public Button buran;
  @FXML
  public Button luna;
  @FXML
  public Button venera;
  @FXML
  public Button vega;
  @FXML
  public Button mars;

  @FXML
  protected void onBtnVostokClick() {
    try {
      Scene sceneVostok = setVostokScene();
      Stage stageVostok = setVostokStage(sceneVostok);
      stageVostok.show();
    } catch (IOException e) {
      LOG.error("The button Vostok does not work", e);
    }
  }

  Scene setVostokScene() throws IOException {
    URL fxmlLocationVostok = getClass().getResource("sovietunion.fxml");
    FXMLLoader fxmlVostokLoader = new FXMLLoader(fxmlLocationVostok);
    Scene vostok = new Scene(fxmlVostokLoader.load(), 1000, 700);
    return vostok;
  }


  Stage setVostokStage(Scene scene) throws IOException {
    Stage stage = new Stage();
    stage.setTitle("Vostok");
    stage.setScene(scene);
    return stage;
  }

  @FXML
  protected void onBtnVoshodClick() {
    try {
      Scene sceneVoshod = setVoshodScene();
      Stage stageVoshod = setVoshodStage(sceneVoshod);
      stageVoshod.show();
    } catch (IOException e) {
      LOG.error("The button Voshod does not work", e);
    }
  }

  Scene setVoshodScene() throws IOException {
    URL fxmlLocationVoshod = getClass().getResource("sovietunion.fxml");
    FXMLLoader fxmlVoshodLoader = new FXMLLoader(fxmlLocationVoshod);
    Scene voshod = new Scene(fxmlVoshodLoader.load(), 1000, 700);
    return voshod;
  }

  Stage setVoshodStage(Scene scene) throws IOException {
    Stage stage = new Stage();
    stage.setTitle("Voshod");
    stage.setScene(scene);
    return stage;
  }

  @FXML
  protected void onBtnSoyuzClick() {
    try {
      Scene sceneSoyuz = setSoyuzScene();
      Stage stageSoyuz = setSoyuzStage(sceneSoyuz);
      stageSoyuz.show();
    } catch (IOException e) {
      LOG.error("The button Soyuz does not work", e);
    }
  }

  Scene setSoyuzScene() throws IOException {
    URL fxmlLocationSoyuz = getClass().getResource("sovietunion.fxml");
    FXMLLoader fxmlSoyuzLoader = new FXMLLoader(fxmlLocationSoyuz);
    Scene soyuz = new Scene(fxmlSoyuzLoader.load(), 1000, 700);
    return soyuz;
  }

  Stage setSoyuzStage(Scene scene) throws IOException {
    Stage stage = new Stage();
    stage.setTitle("Soyuz");
    stage.setScene(scene);
    return stage;
  }

  @FXML
  protected void onBtnMirClick() {
    try {
      Scene sceneMir = setMirScene();
      Stage stageMir = setMirStage(sceneMir);
      stageMir.show();
    } catch (IOException e) {
      LOG.error("The button Mir does not work", e);
    }
  }

  Scene setMirScene() throws IOException {
    URL fxmlLocationMir = getClass().getResource("sovietunion.fxml");
    FXMLLoader fxmlMirLoader = new FXMLLoader(fxmlLocationMir);
    Scene mir = new Scene(fxmlMirLoader.load(), 1000, 700);
    return mir;
  }

  Stage setMirStage(Scene scene) throws IOException {
    Stage stage = new Stage();
    stage.setTitle("Mir");
    stage.setScene(scene);
    return stage;
  }

  @FXML
  protected void onBtnBuranClick() {
    try {
      Scene sceneBuran = setBuranScene();
      Stage stageBuran = setBuranStage(sceneBuran);
      stageBuran.show();
    } catch (IOException e) {
      LOG.error("The button Buran does not work", e);
    }
  }

  Scene setBuranScene() throws IOException {
    URL fxmlLocationBuran = getClass().getResource("sovietunion.fxml");
    FXMLLoader fxmlBuranLoader = new FXMLLoader(fxmlLocationBuran);
    Scene buran = new Scene(fxmlBuranLoader.load(), 1000, 700);
    return buran;
  }

  Stage setBuranStage(Scene scene) throws IOException {
    Stage stage = new Stage();
    stage.setTitle("Buran");
    stage.setScene(scene);
    return stage;
  }

  @FXML
  protected void onBtnLunaClick() {
    try {
      Scene sceneLuna = setLunaScene();
      Stage stageLuna = setLunaStage(sceneLuna);
      stageLuna.show();
    } catch (IOException e) {
      LOG.error("The button Luna does not work", e);
    }
  }

  Scene setLunaScene() throws IOException {
    URL fxmlLocationLuna = getClass().getResource("sovietunion.fxml");
    FXMLLoader fxmlLunaLoader = new FXMLLoader(fxmlLocationLuna);
    Scene luna = new Scene(fxmlLunaLoader.load(), 1000, 700);
    return luna;
  }

  Stage setLunaStage(Scene scene) throws IOException {
    Stage stage = new Stage();
    stage.setTitle("Luna");
    stage.setScene(scene);
    return stage;
  }

  @FXML
  protected void onBtnVeneraClick() {
    try {
      Scene sceneVenera = setVeneraScene();
      Stage stageVenera = setVeneraStage(sceneVenera);
      stageVenera.show();
    } catch (IOException e) {
      LOG.error("The button Venera does not work", e);
    }
  }

  Scene setVeneraScene() throws IOException {
    URL fxmlLocationVenera = getClass().getResource("sovietunion.fxml");
    FXMLLoader fxmlVeneraLoader = new FXMLLoader(fxmlLocationVenera);
    Scene venera = new Scene(fxmlVeneraLoader.load(), 1000, 700);
    return venera;
  }

  Stage setVeneraStage(Scene scene) throws IOException {
    Stage stage = new Stage();
    stage.setTitle("Venera");
    stage.setScene(scene);
    return stage;
  }

  @FXML
  protected void onBtnVegaClick() {
    try {
      Scene sceneVega = setVegaScene();
      Stage stageVega = setVegaStage(sceneVega);
      stageVega.show();
    } catch (IOException e) {
      LOG.error("The button Vega does not work", e);
    }
  }

  Scene setVegaScene() throws IOException {
    URL fxmlLocationVega = getClass().getResource("sovietunion.fxml");
    FXMLLoader fxmlVegaLoader = new FXMLLoader(fxmlLocationVega);
    Scene vega = new Scene(fxmlVegaLoader.load(), 1000, 700);
    return vega;
  }

  Stage setVegaStage(Scene scene) throws IOException {
    Stage stage = new Stage();
    stage.setTitle("Vega");
    stage.setScene(scene);
    return stage;
  }

  @FXML
  protected void onBtnMarsClick() {
    try {
      Scene sceneMars = setMarsScene();
      Stage stageMars = setMarsStage(sceneMars);
      stageMars.show();
    } catch (IOException e) {
      LOG.error("The button Mars does not work", e);
    }
  }

  Scene setMarsScene() throws IOException {
    URL fxmlLocationMars = getClass().getResource("sovietunion.fxml");
    FXMLLoader fxmlMarsLoader = new FXMLLoader(fxmlLocationMars);
    Scene vega = new Scene(fxmlMarsLoader.load(), 1000, 700);
    return vega;
  }

  Stage setMarsStage(Scene scene) throws IOException {
    Stage stage = new Stage();
    stage.setTitle("Mars");
    stage.setScene(scene);
    return stage;
  }
}

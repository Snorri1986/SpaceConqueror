package org.snorri1986.spaceconqueror.buttons;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.io.IOException;
import java.net.URL;

public class SolarSystemBtnController {

    private static final Logger LOG = LoggerFactory.getLogger(SolarSystemBtnController.class);
    @FXML
    public Button mercury;
    @FXML
    public Button venus;
    @FXML
    public Button earth;
    @FXML
    public Button mars;
    @FXML
    public Button jupiter;
    @FXML
    public Button saturn;
    @FXML
    public Button uranus;
    @FXML
    public Button neptune;
    @FXML
    public Button pluto;

    @FXML
    protected void onBtnMercuryClick() {
        try {
            Scene sceneMercury = setMercuryScene();
            Stage stageSolarSys = setMercuryStage(sceneMercury);
            stageSolarSys.show();
        } catch (IOException e) {
            LOG.error("The button Mercury does not work",e);
        }
    }

    Scene setMercuryScene() throws IOException {
        URL fxmlLocationMercury = getClass().getResource("mercury.fxml");
        FXMLLoader fxmlMercuryLoader = new FXMLLoader(fxmlLocationMercury);
        Scene mercury = new Scene(fxmlMercuryLoader.load(), 600, 400);
        return mercury;
    }


    Stage setMercuryStage(Scene scene) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Mercury");
        stage.setScene(scene);
        return stage;
    }

    @FXML
    protected void onBtnVenusClick() {
        try {
            Scene sceneVenus = setVenusScene();
            Stage stageVenus = setVenusStage(sceneVenus);
            stageVenus.show();
        } catch (IOException e) {
            LOG.error("The button Venus does not work",e);
        }
    }

    Scene setVenusScene() throws IOException {
        URL fxmlLocationVenus = getClass().getResource("venus.fxml");
        FXMLLoader fxmlVenusLoader = new FXMLLoader(fxmlLocationVenus);
        Scene venus = new Scene(fxmlVenusLoader.load(), 600, 400);
        return venus;
    }

    Stage setVenusStage(Scene scene) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Venus");
        stage.setScene(scene);
        return stage;
    }

    @FXML
    protected void onBtnEarthClick() {
        try {
            Scene sceneEarth = setEarthScene();
            Stage stageEarth = setEarthStage(sceneEarth);
            stageEarth.show();
        } catch (IOException e) {
            LOG.error("The button Earth does not work",e);
        }
    }

    Scene setEarthScene() throws IOException {
        URL fxmlLocationEarth = getClass().getResource("earth.fxml");
        FXMLLoader fxmlEarthLoader = new FXMLLoader(fxmlLocationEarth);
        Scene earth = new Scene(fxmlEarthLoader.load(), 600, 400);
        return earth;
    }

    Stage setEarthStage(Scene scene) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Earth");
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
            LOG.error("The button Mars does not work",e);
        }
    }

    Scene setMarsScene() throws IOException {
        URL fxmlLocationMars = getClass().getResource("mars.fxml");
        FXMLLoader fxmlMarsLoader = new FXMLLoader(fxmlLocationMars);
        Scene mars = new Scene(fxmlMarsLoader.load(), 600, 400);
        return mars;
    }

    Stage setMarsStage(Scene scene) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Mars");
        stage.setScene(scene);
        return stage;
    }

    @FXML
    protected void onBtnJupiterClick() {
        try {
            Scene sceneJupiter = setJupiterScene();
            Stage stageJupiter = setJupiterStage(sceneJupiter);
            stageJupiter.show();
        } catch (IOException e) {
            LOG.error("The button Jupiter does not work",e);
        }
    }

    Scene setJupiterScene() throws IOException {
        URL fxmlLocationJupiter = getClass().getResource("jupiter.fxml");
        FXMLLoader fxmlJupiterLoader = new FXMLLoader(fxmlLocationJupiter);
        Scene jupiter = new Scene(fxmlJupiterLoader.load(), 600, 400);
        return jupiter;
    }

    Stage setJupiterStage(Scene scene) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Jupiter");
        stage.setScene(scene);
        return stage;
    }

    @FXML
    protected void onBtnSaturnClick() {
        try {
            Scene sceneSaturn = setSaturnScene();
            Stage stageSaturn = setSaturnStage(sceneSaturn);
            stageSaturn.show();
        } catch (IOException e) {
            LOG.error("The button Saturn does not work",e);
        }
    }

    Scene setSaturnScene() throws IOException {
        URL fxmlLocationSaturn = getClass().getResource("saturn.fxml");
        FXMLLoader fxmlSaturnLoader = new FXMLLoader(fxmlLocationSaturn);
        Scene saturn = new Scene(fxmlSaturnLoader.load(), 600, 400);
        return saturn;
    }

    Stage setSaturnStage(Scene scene) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Saturn");
        stage.setScene(scene);
        return stage;
    }

    @FXML
    protected void onBtnUranusClick() {
        try {
            Scene sceneUranus = setUranusScene();
            Stage stageUranus = setUranusStage(sceneUranus);
            stageUranus.show();
        } catch (IOException e) {
            LOG.error("The button Uranus does not work",e);
        }
    }

    Scene setUranusScene() throws IOException {
        URL fxmlLocationUranus = getClass().getResource("uranus.fxml");
        FXMLLoader fxmlUranusLoader = new FXMLLoader(fxmlLocationUranus);
        Scene uranus = new Scene(fxmlUranusLoader.load(), 600, 400);
        return uranus;
    }

    Stage setUranusStage(Scene scene) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Uranus");
        stage.setScene(scene);
        return stage;
    }

    @FXML
    protected void onBtnNeptuneClick() {
        try {
            Scene sceneNeptune = setNeptuneScene();
            Stage stageNeptune = setNeptuneStage(sceneNeptune);
            stageNeptune.show();
        } catch (IOException e) {
            LOG.error("The button Neptune does not work",e);
        }
    }

    Scene setNeptuneScene() throws IOException {
        URL fxmlLocationNeptune = getClass().getResource("neptune.fxml");
        FXMLLoader fxmlNeptuneLoader = new FXMLLoader(fxmlLocationNeptune);
        Scene neptune = new Scene(fxmlNeptuneLoader.load(), 600, 400);
        return neptune;
    }

    Stage setNeptuneStage(Scene scene) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Neptune");
        stage.setScene(scene);
        return stage;
    }

    @FXML
    protected void onBtnPlutoClick() {
        try {
            Scene scenePluto = setPlutoScene();
            Stage stagePluto = setPlutoStage(scenePluto);
            stagePluto.show();
        } catch (IOException e) {
            LOG.error("The button Pluto does not work",e);
        }
    }

    Scene setPlutoScene() throws IOException {
        URL fxmlLocationPluto = getClass().getResource("pluto.fxml");
        FXMLLoader fxmlPlutoLoader = new FXMLLoader(fxmlLocationPluto);
        Scene pluto = new Scene(fxmlPlutoLoader.load(), 600, 400);
        return pluto;
    }

    Stage setPlutoStage(Scene scene) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Pluto");
        stage.setScene(scene);
        return stage;
    }
}

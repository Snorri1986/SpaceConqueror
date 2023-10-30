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

public class IndiaBtnController {

    private static final Logger LOG = LoggerFactory.getLogger(IndiaBtnController.class);

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
            LOG.error("The button Satellites does not work",e);
        }
    }

    Scene setSatellitesScene() throws IOException {
        URL fxmlLocationSatellites = getClass().getResource("satellites.fxml");
        FXMLLoader fxmlSatellitesLoader = new FXMLLoader(fxmlLocationSatellites);
        Scene satellites = new Scene(fxmlSatellitesLoader.load(), 600, 400);
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
            LOG.error("The button GAGAN does not work",e);
        }
    }

    Scene setGaganScene() throws IOException {
        URL fxmlLocationGagan = getClass().getResource("gagan.fxml");
        FXMLLoader fxmlGaganLoader = new FXMLLoader(fxmlLocationGagan);
        Scene gagan = new Scene(fxmlGaganLoader.load(), 600, 400);
        return gagan;
    }
    Stage setGaganStage(Scene scene) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Gagan");
        stage.setScene(scene);
        return stage;
    }

}

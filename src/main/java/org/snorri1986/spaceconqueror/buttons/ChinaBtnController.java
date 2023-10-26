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

public class ChinaBtnController {

    private static final Logger LOG = LoggerFactory.getLogger(ChinaBtnController.class);

    @FXML
    public Button prj9211;

    @FXML
    public Button prj9212;

    @FXML
    public Button prj9213;

    @FXML
    public Button lunar;

    @FXML
    public Button interplanet;

    @FXML
    public Button orbital;

    @FXML
    public Button marsPrg;

    @FXML
    public Button cosmodroms;

    @FXML
    public Button peoples;

    @FXML
    protected void onBtnProject9211Click() {
        try {
            Scene scenePrj9211 = setPrj9211Scene();
            Stage stagePrj9211 = setPrj9211Stage(scenePrj9211);
            stagePrj9211.show();
        } catch (IOException e) {
            LOG.error("The button Project9211 does not work",e);
        }
    }

    Scene setPrj9211Scene() throws IOException {
        URL fxmlLocationPrj9211 = getClass().getResource("prj9211.fxml");
        FXMLLoader fxmlPrj9211Loader = new FXMLLoader(fxmlLocationPrj9211);
        Scene prj9211 = new Scene(fxmlPrj9211Loader.load(), 600, 400);
        return prj9211;
    }


    Stage setPrj9211Stage(Scene scene) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("PRJ9211");
        stage.setScene(scene);
        return stage;
    }

    @FXML
    protected void onBtnProject9212Click() {
        try {
            Scene scenePrj9212 = setPrj9212Scene();
            Stage stagePrj9212 = setPrj9212Stage(scenePrj9212);
            stagePrj9212.show();
        } catch (IOException e) {
            LOG.error("The button Project9212 does not work",e);
        }
    }

    Scene setPrj9212Scene() throws IOException {
        URL fxmlLocationPrj9212 = getClass().getResource("prj9212.fxml");
        FXMLLoader fxmlPrj9212Loader = new FXMLLoader(fxmlLocationPrj9212);
        Scene prj9212 = new Scene(fxmlPrj9212Loader.load(), 600, 400);
        return prj9212;
    }

    Stage setPrj9212Stage(Scene scene) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("PRJ9212");
        stage.setScene(scene);
        return stage;
    }

    @FXML
    protected void onBtnProject9213Click() {
        try {
            Scene scenePrj9213 = setPrj9213Scene();
            Stage stagePrj9213 = setPrj9213Stage(scenePrj9213);
            stagePrj9213.show();
        } catch (IOException e) {
            LOG.error("The button Project9213 does not work",e);
        }
    }

    Scene setPrj9213Scene() throws IOException {
        URL fxmlLocationPrj9213 = getClass().getResource("prj9213.fxml");
        FXMLLoader fxmlPrj9213Loader = new FXMLLoader(fxmlLocationPrj9213);
        Scene prj9213 = new Scene(fxmlPrj9213Loader.load(), 600, 400);
        return prj9213;
    }

    Stage setPrj9213Stage(Scene scene) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("PRJ9213");
        stage.setScene(scene);
        return stage;
    }

    @FXML
    protected void onBtnLunarClick() {
        try {
            Scene sceneLunar = setLunarScene();
            Stage stageLunar = setLunarStage(sceneLunar);
            stageLunar.show();
        } catch (IOException e) {
            LOG.error("The button Lunar does not work",e);
        }
    }

    Scene setLunarScene() throws IOException {
        URL fxmlLocationLunar = getClass().getResource("lunar.fxml");
        FXMLLoader fxmlLunarLoader = new FXMLLoader(fxmlLocationLunar);
        Scene lunar = new Scene(fxmlLunarLoader.load(), 600, 400);
        return lunar;
    }

    Stage setLunarStage(Scene scene) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Lunar");
        stage.setScene(scene);
        return stage;
    }

    @FXML
    protected void onBtnInterplanetsClick() {
        try {
            Scene sceneInterplanets = setInterplanetsScene();
            Stage stageInterplanets = setInterplanetsStage(sceneInterplanets);
            stageInterplanets.show();
        } catch (IOException e) {
            LOG.error("The button Interplanets does not work",e);
        }
    }

    Scene setInterplanetsScene() throws IOException {
        URL fxmlLocationInterplanets = getClass().getResource("interplanets.fxml");
        FXMLLoader fxmlInterplanetsLoader = new FXMLLoader(fxmlLocationInterplanets);
        Scene interplanets = new Scene(fxmlInterplanetsLoader.load(), 600, 400);
        return interplanets;
    }

    Stage setInterplanetsStage(Scene scene) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Interplanets");
        stage.setScene(scene);
        return stage;
    }

    @FXML
    protected void onBtnOrbitalsClick() {
        try {
            Scene sceneOrbitals = setOrbitalsScene();
            Stage stageOrbitals = setOrbitalsStage(sceneOrbitals);
            stageOrbitals.show();
        } catch (IOException e) {
            LOG.error("The button Orbitals does not work",e);
        }
    }

    Scene setOrbitalsScene() throws IOException {
        URL fxmlLocationOrbitals = getClass().getResource("orbitals_china.fxml");
        FXMLLoader fxmlOrbitalsLoader = new FXMLLoader(fxmlLocationOrbitals);
        Scene orbitals = new Scene(fxmlOrbitalsLoader.load(), 600, 400);
        return orbitals;
    }

    Stage setOrbitalsStage(Scene scene) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Orbitals");
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
        URL fxmlLocationMars = getClass().getResource("mars_china_program.fxml");
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
    protected void onBtnCosmodromsClick() {
        try {
            Scene sceneCosmodroms = setCosmodromsScene();
            Stage stageCosmodroms = setCosmodromsStage(sceneCosmodroms);
            stageCosmodroms.show();
        } catch (IOException e) {
            LOG.error("The button Cosmodroms does not work",e);
        }
    }

    Scene setCosmodromsScene() throws IOException {
        URL fxmlLocationCosmodroms = getClass().getResource("china_cosmodroms.fxml");
        FXMLLoader fxmlCosmodromsLoader = new FXMLLoader(fxmlLocationCosmodroms);
        Scene cosmodroms = new Scene(fxmlCosmodromsLoader.load(), 600, 400);
        return cosmodroms;
    }

    Stage setCosmodromsStage(Scene scene) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("China Cosmodroms");
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
            LOG.error("The button Peoples does not work",e);
        }
    }

    Scene setPeoplesScene() throws IOException {
        URL fxmlLocationPeoples = getClass().getResource("china_peoples.fxml");
        FXMLLoader fxmlPeoplesLoader = new FXMLLoader(fxmlLocationPeoples);
        Scene peoples = new Scene(fxmlPeoplesLoader.load(), 600, 400);
        return peoples;
    }

    Stage setPeoplesStage(Scene scene) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Peoples");
        stage.setScene(scene);
        return stage;
    }
}

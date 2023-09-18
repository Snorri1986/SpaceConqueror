package org.snorri1986.spaceconqueror;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppLauncherController {
    @FXML
    protected void onBtnSolarSystemClick() {
        try {
            Scene sceneSolarSys = setSolarSystemScene();
            Stage stageSolarSys = setSolarSystemStage(sceneSolarSys);
            stageSolarSys.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    Scene setSolarSystemScene() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AppLauncher.class.getResource("solar-system.fxml"));
        Scene solarSystem = new Scene(fxmlLoader.load(), 600, 400);
        return solarSystem;
    }


    Stage setSolarSystemStage(Scene scene) throws IOException {
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
            e.printStackTrace();
        }
    }

    Scene setSovietUnionScene() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AppLauncher.class.getResource("soviet-union.fxml"));
        Scene sovietUnion = new Scene(fxmlLoader.load(), 600, 400);
        return sovietUnion;
    }

    Stage setSovietUnionStage(Scene scene) throws IOException {
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
            e.printStackTrace();
        }
    }

    Scene setChinaScene() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AppLauncher.class.getResource("china.fxml"));
        Scene china = new Scene(fxmlLoader.load(), 600, 400);
        return china;
    }

    Stage setChinaStage(Scene scene) throws IOException {
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
            e.printStackTrace();
        }
    }

    Scene setUsaScene() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AppLauncher.class.getResource("usa.fxml"));
        Scene usa = new Scene(fxmlLoader.load(), 600, 400);
        return usa;
    }

    Stage setUsaStage(Scene scene) throws IOException {
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
            e.printStackTrace();
        }
    }

    Scene setIndiaScene() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AppLauncher.class.getResource("india.fxml"));
        Scene india = new Scene(fxmlLoader.load(), 600, 400);
        return india;
    }

    Stage setIndiaStage(Scene scene) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("About India");
        stage.setScene(scene);
        return stage;
    }

    @FXML
    protected void onBtnSpaceXClick() {
        try {
            Scene sceneSpaceX = setSpaceXScene();
            Stage stageSpaceX = setSpaceXStage(sceneSpaceX);
            stageSpaceX.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    Scene setSpaceXScene() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AppLauncher.class.getResource("spacex.fxml"));
        Scene spaceX = new Scene(fxmlLoader.load(), 600, 400);
        return spaceX;
    }

    Stage setSpaceXStage(Scene scene) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("About SpaceX");
        stage.setScene(scene);
        return stage;
    }

}
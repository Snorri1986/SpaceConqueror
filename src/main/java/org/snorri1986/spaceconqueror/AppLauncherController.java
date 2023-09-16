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


}
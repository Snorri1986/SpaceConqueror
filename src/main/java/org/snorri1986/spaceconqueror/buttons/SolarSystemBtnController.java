package org.snorri1986.spaceconqueror.buttons;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.snorri1986.spaceconqueror.AppLauncherController;

import java.io.IOException;
import java.net.URL;

public class SolarSystemBtnController {

    private static final Logger LOG = LoggerFactory.getLogger(SolarSystemBtnController.class);
    @FXML
    public Button mercury;
//    @FXML
//    public Button venus;
//    @FXML
//    public Button earth;
//    @FXML
//    public Button mars;
//    @FXML
//    public Button jupiter;
//    @FXML
//    public Button saturn;
//    @FXML
//    public Button uranus;
//    @FXML
//    public Button neptune;
//    @FXML
//    public Button pluto;

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
}

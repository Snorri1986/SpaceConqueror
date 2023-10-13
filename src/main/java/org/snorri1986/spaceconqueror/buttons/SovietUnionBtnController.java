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

public class SovietUnionBtnController {
    private static final Logger LOG = LoggerFactory.getLogger(SovietUnionBtnController.class);

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
            LOG.error("The button Vostok does not work",e);
        }
    }

    Scene setVostokScene() throws IOException {
        URL fxmlLocationVostok = getClass().getResource("vostok.fxml");
        FXMLLoader fxmlVostokLoader = new FXMLLoader(fxmlLocationVostok);
        Scene vostok = new Scene(fxmlVostokLoader.load(), 600, 400);
        return vostok;
    }


    Stage setVostokStage(Scene scene) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Vostok");
        stage.setScene(scene);
        return stage;
    }
}

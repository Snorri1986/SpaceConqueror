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

    @FXML
    protected void onBtnVoshodClick() {
        try {
            Scene sceneVoshod = setVoshodScene();
            Stage stageVoshod = setVoshodStage(sceneVoshod);
            stageVoshod.show();
        } catch (IOException e) {
            LOG.error("The button Voshod does not work",e);
        }
    }

    Scene setVoshodScene() throws IOException {
        URL fxmlLocationVoshod = getClass().getResource("voshod.fxml");
        FXMLLoader fxmlVoshodLoader = new FXMLLoader(fxmlLocationVoshod);
        Scene voshod = new Scene(fxmlVoshodLoader.load(), 600, 400);
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
            LOG.error("The button Soyuz does not work",e);
        }
    }

    Scene setSoyuzScene() throws IOException {
        URL fxmlLocationSoyuz = getClass().getResource("soyuz.fxml");
        FXMLLoader fxmlSoyuzLoader = new FXMLLoader(fxmlLocationSoyuz);
        Scene soyuz = new Scene(fxmlSoyuzLoader.load(), 600, 400);
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
            LOG.error("The button Mir does not work",e);
        }
    }

    Scene setMirScene() throws IOException {
        URL fxmlLocationMir = getClass().getResource("mir.fxml");
        FXMLLoader fxmlSoyuzMir = new FXMLLoader(fxmlLocationMir);
        Scene mir = new Scene(fxmlSoyuzMir.load(), 600, 400);
        return mir;
    }

    Stage setMirStage(Scene scene) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Mir");
        stage.setScene(scene);
        return stage;
    }
}

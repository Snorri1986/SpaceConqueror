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

public class SpacexBtnController {

    private static final Logger LOG = LoggerFactory.getLogger(SpacexBtnController.class);

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
            LOG.error("The button Falcon One does not work",e);
        }
    }

    Scene setFalconOneScene() throws IOException {
        URL fxmlLocationFalconOne = getClass().getResource("falconone.fxml");
        FXMLLoader fxmlFalconOneLoader = new FXMLLoader(fxmlLocationFalconOne);
        Scene falconOne = new Scene(fxmlFalconOneLoader.load(), 600, 400);
        return falconOne;
    }


    Stage setFalconOneStage(Scene scene) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Falcon One");
        stage.setScene(scene);
        return stage;
    }
}

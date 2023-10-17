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
}

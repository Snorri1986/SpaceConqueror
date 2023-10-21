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

public class UsaBtnController {

    private static final Logger LOG = LoggerFactory.getLogger(UsaBtnController.class);

    @FXML
    public Button mercuryProject;

    @FXML
    public Button geminiProgram;

    @FXML
    public Button apolloProgram;

    @FXML
    public Button soyuzApollo;

    @FXML
    public Button iss;

    @FXML
    public Button spaceShuttle;

    @FXML
    public Button cosmodromsUSA;

    @FXML
    public Button people;

    @FXML
    public Button nasa;

    @FXML
    protected void onBtnMercuryProjectClick() {
        try {
            Scene sceneMercuryProject = setMercuryProjectScene();
            Stage stageMercuryProject = setMercuryProjectStage(sceneMercuryProject);
            stageMercuryProject.show();
        } catch (IOException e) {
            LOG.error("The button MercuryProject does not work",e);
        }
    }

    Scene setMercuryProjectScene() throws IOException {
        URL fxmlLocationMercuryProject = getClass().getResource("mercury_project.fxml");
        FXMLLoader fxmlMercuryProjectLoader = new FXMLLoader(fxmlLocationMercuryProject);
        Scene mercuryProject = new Scene(fxmlMercuryProjectLoader.load(), 600, 400);
        return mercuryProject;
    }


    Stage setMercuryProjectStage(Scene scene) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Mercury Project");
        stage.setScene(scene);
        return stage;
    }

    @FXML
    protected void onBtnGeminiProgramClick() throws IOException {
        try {
            Scene sceneGeminiProgram = setGeminiProgramScene();
            Stage stageGeminiProgram = setGeminiProgramStage(sceneGeminiProgram);
            stageGeminiProgram.show();
        } catch (IOException e) {
            LOG.error("The button Gemini Program does not work",e);
        }
    }

    Scene setGeminiProgramScene() throws IOException {
        URL fxmlLocationGeminiProgram = getClass().getResource("gemini_program.fxml");
        FXMLLoader fxmlGeminiProgramLoader = new FXMLLoader(fxmlLocationGeminiProgram);
        Scene geminiProgram = new Scene(fxmlGeminiProgramLoader.load(), 600, 400);
        return geminiProgram;
    }

    Stage setGeminiProgramStage(Scene scene) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Gemini Program");
        stage.setScene(scene);
        return stage;
    }
}

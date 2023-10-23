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

    @FXML
    protected void onBtnApolloProgramClick() throws IOException {
        try {
            Scene sceneApolloProgram = setApolloProgramScene();
            Stage stageApolloProgram = setApolloProgramStage(sceneApolloProgram);
            stageApolloProgram.show();
        } catch (IOException e) {
            LOG.error("The button Apollo Program does not work",e);
        }
    }

    Scene setApolloProgramScene() throws IOException {
        URL fxmlLocationApolloProgram = getClass().getResource("apollo_program.fxml");
        FXMLLoader fxmlApolloProgramLoader = new FXMLLoader(fxmlLocationApolloProgram);
        Scene apolloProgram = new Scene(fxmlApolloProgramLoader.load(), 600, 400);
        return apolloProgram;
    }

    Stage setApolloProgramStage(Scene scene) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Apollo Program");
        stage.setScene(scene);
        return stage;
    }

    @FXML
    protected void onBtnSoyuzApolloProgramClick() throws IOException {
        try {
            Scene sceneSoyuzApolloProgram = setSoyuzApolloProgramScene();
            Stage stageSoyuzApolloProgram = setSoyuzApolloProgramStage(sceneSoyuzApolloProgram);
            stageSoyuzApolloProgram.show();
        } catch (IOException e) {
            LOG.error("The button Soyuz-Apollo Program does not work",e);
        }
    }

    Scene setSoyuzApolloProgramScene() throws IOException {
        URL fxmlLocationSoyuzApolloProgram = getClass().getResource("soyuz_apollo_program.fxml");
        FXMLLoader fxmlSoyuzApolloProgramLoader = new FXMLLoader(fxmlLocationSoyuzApolloProgram);
        Scene soyuzApolloProgram = new Scene(fxmlSoyuzApolloProgramLoader.load(), 600, 400);
        return soyuzApolloProgram;
    }

    Stage setSoyuzApolloProgramStage(Scene scene) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Soyuz Apollo Program");
        stage.setScene(scene);
        return stage;
    }
}

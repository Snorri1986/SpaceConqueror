package org.snorri1986.spaceconqueror.buttons;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.net.URL;

public class UsaBtnController {

    private static final Logger LOG = Logger.getLogger(UsaBtnController.class.getName());

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
        URL fxmlLocationMercuryProject = getClass().getResource("usa_space_program.fxml");
        FXMLLoader fxmlMercuryProjectLoader = new FXMLLoader(fxmlLocationMercuryProject);
        Scene mercuryProject = new Scene(fxmlMercuryProjectLoader.load(), 1000, 700);
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
        URL fxmlLocationGeminiProgram = getClass().getResource("usa_space_program.fxml");
        FXMLLoader fxmlGeminiProgramLoader = new FXMLLoader(fxmlLocationGeminiProgram);
        Scene geminiProgram = new Scene(fxmlGeminiProgramLoader.load(), 1000, 700);
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
        URL fxmlLocationApolloProgram = getClass().getResource("usa_space_program.fxml");
        FXMLLoader fxmlApolloProgramLoader = new FXMLLoader(fxmlLocationApolloProgram);
        Scene apolloProgram = new Scene(fxmlApolloProgramLoader.load(), 1000, 700);
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
        URL fxmlLocationSoyuzApolloProgram = getClass().getResource("usa_space_program.fxml");
        FXMLLoader fxmlSoyuzApolloProgramLoader = new FXMLLoader(fxmlLocationSoyuzApolloProgram);
        Scene soyuzApolloProgram = new Scene(fxmlSoyuzApolloProgramLoader.load(), 1000, 700);
        return soyuzApolloProgram;
    }

    Stage setSoyuzApolloProgramStage(Scene scene) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Soyuz Apollo Program");
        stage.setScene(scene);
        return stage;
    }

    @FXML
    protected void onIssProgramClick() throws IOException {
        try {
            Scene sceneIssProgram = setIssScene();
            Stage stageIssProgram = setIssStage(sceneIssProgram);
            stageIssProgram.show();
        } catch (IOException e) {
            LOG.error("The button ISS Program does not work",e);
        }
    }

    Scene setIssScene() throws IOException {
        URL fxmlIss= getClass().getResource("usa_space_program.fxml");
        FXMLLoader fxmlIssLoader = new FXMLLoader(fxmlIss);
        Scene iSS = new Scene(fxmlIssLoader.load(), 1000, 700);
        return iSS;
    }

    Stage setIssStage(Scene scene) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("ISS");
        stage.setScene(scene);
        return stage;
    }

    @FXML
    protected void onSpaceShuttleProgramClick() throws IOException {
        try {
            Scene sceneSpaceShuttleProgram = setSpaceShuttleProgramScene();
            Stage stageSpaceShuttleProgram = setSpaceShuttleProgramStage(sceneSpaceShuttleProgram);
            stageSpaceShuttleProgram.show();
        } catch (IOException e) {
            LOG.error("The button SpaceShuttle Program does not work",e);
        }
    }

    Scene setSpaceShuttleProgramScene() throws IOException {
        URL fxmlSpaceShuttleProgram= getClass().getResource("usa_space_program.fxml");
        FXMLLoader fxmlSpaceShuttleProgramLoader = new FXMLLoader(fxmlSpaceShuttleProgram);
        Scene spaceShuttleProgram = new Scene(fxmlSpaceShuttleProgramLoader.load(), 1000, 700);
        return spaceShuttleProgram;
    }

    Stage setSpaceShuttleProgramStage(Scene scene) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Space Shuttle Program");
        stage.setScene(scene);
        return stage;
    }

    @FXML
    protected void onCosmodromsClick() throws IOException {
        try {
            Scene sceneCosmodroms = setCosmodromsScene();
            Stage stageCosmodroms = setCosmodromsStage(sceneCosmodroms);
            stageCosmodroms.show();
        } catch (IOException e) {
            LOG.error("The button Cosmodroms does not work",e);
        }
    }

    Scene setCosmodromsScene() throws IOException {
        URL fxmlCosmodroms = getClass().getResource("usa_space_program.fxml");
        FXMLLoader fxmlCosmodromsLoader = new FXMLLoader(fxmlCosmodroms);
        Scene cosmodroms = new Scene(fxmlCosmodromsLoader.load(), 1000, 700);
        return cosmodroms;
    }

    Stage setCosmodromsStage(Scene scene) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("USA Cosmodroms");
        stage.setScene(scene);
        return stage;
    }

    @FXML
    protected void onPeoplesClick() throws IOException {
        try {
            Scene scenePeoples = setPeoplesScene();
            Stage stagePeoples = setPeoplesStage(scenePeoples);
            stagePeoples.show();
        } catch (IOException e) {
            LOG.error("The button Peoples does not work",e);
        }
    }

    Scene setPeoplesScene() throws IOException {
        URL fxmlPeoples = getClass().getResource("usa_space_program.fxml");
        FXMLLoader fxmlPeoplesLoader = new FXMLLoader(fxmlPeoples);
        Scene peoples = new Scene(fxmlPeoplesLoader.load(), 1000, 700);
        return peoples;
    }

    Stage setPeoplesStage(Scene scene) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("USA Peoples");
        stage.setScene(scene);
        return stage;
    }

    @FXML
    protected void onNasaClick() throws IOException {
        try {
            Scene sceneNasa = setNasaScene();
            Stage stageNasa = setNasaStage(sceneNasa);
            stageNasa.show();
        } catch (IOException e) {
            LOG.error("The button NASA does not work",e);
        }
    }

    Scene setNasaScene() throws IOException {
        URL fxmlNasa = getClass().getResource("usa_space_program.fxml");
        FXMLLoader fxmlNasaLoader = new FXMLLoader(fxmlNasa);
        Scene nasa = new Scene(fxmlNasaLoader.load(), 1000, 700);
        return nasa;
    }

    Stage setNasaStage(Scene scene) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("NASA");
        stage.setScene(scene);
        return stage;
    }
}

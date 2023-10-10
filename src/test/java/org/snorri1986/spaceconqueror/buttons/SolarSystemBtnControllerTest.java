package org.snorri1986.spaceconqueror.buttons;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.snorri1986.spaceconqueror.AppLauncherController;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.ApplicationTest;
import org.testfx.framework.junit5.Start;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;



@ExtendWith(ApplicationExtension.class)
public class SolarSystemBtnControllerTest extends ApplicationTest {

    //TODO: add test for another buttons

    public final AppLauncherController appLauncherController = new AppLauncherController();
    public final SolarSystemBtnController solarSystemBtnController = new SolarSystemBtnController();

    @Start
    public void start(Stage stageOriginal) throws IOException {
        stageOriginal = appLauncherController.setSolarSystemStage(appLauncherController.setSolarSystemScene());
        stageOriginal.show();
    }
    @Test
    void testMercuryStage() throws IOException {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Scene testMercuryScene = null;
                try {
                    testMercuryScene = solarSystemBtnController.setMercuryScene();
                    Stage testMercuryStage = solarSystemBtnController.setMercuryStage(testMercuryScene);
                    assertNotNull(testMercuryStage);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    @Test
    void testVenusStage() throws IOException {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Scene testVenusScene = null;
                try {
                    testVenusScene = solarSystemBtnController.setVenusScene();
                    Stage testVenusStage = solarSystemBtnController.setVenusStage(testVenusScene);
                    assertNotNull(testVenusStage);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    @Test
    void testEarthStage() throws IOException {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Scene testEarthScene = null;
                try {
                    testEarthScene = solarSystemBtnController.setEarthScene();
                    Stage testEarthStage = solarSystemBtnController.setEarthStage(testEarthScene);
                    assertNotNull(testEarthStage);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    @Test
    void testMarsStage() throws IOException {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Scene testMarsScene = null;
                try {
                    testMarsScene = solarSystemBtnController.setMarsScene();
                    Stage testMarsStage = solarSystemBtnController.setMarsStage(testMarsScene);
                    assertNotNull(testMarsStage);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    @Test
    void testJupiterStage() throws IOException {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Scene testJupiterScene = null;
                try {
                    testJupiterScene = solarSystemBtnController.setJupiterScene();
                    Stage testJupiterStage = solarSystemBtnController.setJupiterStage(testJupiterScene);
                    assertNotNull(testJupiterStage);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    @Test
    void testSaturnStage() throws IOException {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Scene testSaturnScene = null;
                try {
                    testSaturnScene = solarSystemBtnController.setSaturnScene();
                    Stage testSaturnStage = solarSystemBtnController.setSaturnStage(testSaturnScene);
                    assertNotNull(testSaturnStage);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    @Test
    void testUranusStage() throws IOException {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Scene testUranusScene = null;
                try {
                    testUranusScene = solarSystemBtnController.setUranusScene();
                    Stage testUranusStage = solarSystemBtnController.setUranusStage(testUranusScene);
                    assertNotNull(testUranusStage);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    @Test
    void testNeptuneStage() throws IOException {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Scene testNeptuneScene = null;
                try {
                    testNeptuneScene = solarSystemBtnController.setNeptuneScene();
                    Stage testNeptuneStage = solarSystemBtnController.setNeptuneStage(testNeptuneScene);
                    assertNotNull(testNeptuneStage);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}


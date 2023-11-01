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
public class IndiaBtnControllerTest extends ApplicationTest {

    public final AppLauncherController appLauncherController = new AppLauncherController();
    public final IndiaBtnController indiaBtnController = new IndiaBtnController();

    @Start
    public void start(Stage stageOriginal) throws IOException {
        stageOriginal = appLauncherController.setIndiaStage(appLauncherController.setIndiaScene());
        stageOriginal.show();
    }

    @Test
    void testSatelliteStage() throws IOException {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Scene testSatelliteScene = null;
                try {
                    testSatelliteScene = indiaBtnController.setSatellitesScene();
                    Stage testSatelliteStage = indiaBtnController.setSatellitesStage(testSatelliteScene);
                    assertNotNull(testSatelliteStage);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    @Test
    void testGaganStage() throws IOException {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Scene testGaganScene = null;
                try {
                    testGaganScene = indiaBtnController.setGaganScene();
                    Stage testGaganStage = indiaBtnController.setGaganStage(testGaganScene);
                    assertNotNull(testGaganStage);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    @Test
    void testIrnssStage() throws IOException {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Scene testIrnssScene = null;
                try {
                    testIrnssScene = indiaBtnController.setIrnssScene();
                    Stage testIsrnnStage = indiaBtnController.setIrnssStage(testIrnssScene);
                    assertNotNull(testIsrnnStage);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    @Test
    void testChandrayaanOneStage() throws IOException {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Scene testChandrayaanOneScene = null;
                try {
                    testChandrayaanOneScene = indiaBtnController.setChandrayaanOneScene();
                    Stage testChandrayaanOneStage = indiaBtnController.setChandrayaanOneStage(testChandrayaanOneScene);
                    assertNotNull(testChandrayaanOneStage);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    @Test
    void testMarsOrbiterStage() throws IOException {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Scene testMarsOrbiterScene = null;
                try {
                    testMarsOrbiterScene = indiaBtnController.setMarsOrbiterScene();
                    Stage testMarsOrbiterStage = indiaBtnController.setMarsOrbiterStage(testMarsOrbiterScene);
                    assertNotNull(testMarsOrbiterStage);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    @Test
    void testChandrayaanThreeStage() throws IOException {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Scene testChandrayaanThreeScene = null;
                try {
                    testChandrayaanThreeScene = indiaBtnController.setChandrayaanThreeScene();
                    Stage testChandrayaanThreeStage = indiaBtnController.setChandrayaanThreeStage(testChandrayaanThreeScene);
                    assertNotNull(testChandrayaanThreeStage);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    @Test
    void testAdityaLoneStage() throws IOException {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Scene testAdityaLoneScene = null;
                try {
                    testAdityaLoneScene = indiaBtnController.setAdityaLoneScene();
                    Stage testAdityaLoneStage = indiaBtnController.setAdityaLoneStage(testAdityaLoneScene);
                    assertNotNull(testAdityaLoneStage);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    @Test
    void testCosmodromsStage() throws IOException {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Scene testCosmodromsScene = null;
                try {
                    testCosmodromsScene = indiaBtnController.setCosmodromsScene();
                    Stage testCosmodromsStage = indiaBtnController.setCosmodromsStage(testCosmodromsScene);
                    assertNotNull(testCosmodromsStage);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}

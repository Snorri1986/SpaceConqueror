package org.snorri1986.spaceconqueror;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxAssert;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.ApplicationTest;
import org.testfx.framework.junit5.Start;
import org.testfx.matcher.base.WindowMatchers;


import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(ApplicationExtension.class)
public class AppLauncherControllerTest extends ApplicationTest {

    private final AppLauncher hello = new AppLauncher();
    private final AppLauncherController appController = new AppLauncherController();

    @Start
    public void start(Stage stageOriginal) throws IOException {
        hello.start(stageOriginal);
    }
    @Test
    void checkBtnSolarSystem() {
        Button btnSolarSystem = lookup("#btn_s_system").queryButton();
        clickOn(btnSolarSystem);
        FxAssert.verifyThat(window("About Solar System"), WindowMatchers.isShowing());
    }

    @Test
    void testSetSolarSystemScene() throws IOException {
        Scene sceneSolarSys = appController.setSolarSystemScene();
        assertNotNull(sceneSolarSys);
    }

    @Test
    void testSetSolarSystemStage() throws IOException {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Scene testSolarSystemScene = null;
                try {
                    testSolarSystemScene = appController.setSolarSystemScene();
                    Stage testSolarSystemStage = appController.setSolarSystemStage(testSolarSystemScene);
                    assertNotNull(testSolarSystemStage);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
    @Test
    void checkBtnSovietUnion() {
        Button btnSovietUnion = lookup("#btn_s_union").queryButton();
        clickOn(btnSovietUnion);
        FxAssert.verifyThat(window("About Soviet Union"), WindowMatchers.isShowing());
    }

    @Test
    void testSetSovietUnionScene() throws IOException {
        Scene sceneSovietUnion = appController.setSovietUnionScene();
        assertNotNull(sceneSovietUnion);
    }

    @Test
    void testSetSovietUnionStage() throws IOException {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Scene testSovietUnionScene = null;
                try {
                    testSovietUnionScene = appController.setSovietUnionScene();
                    Stage testSovietUnionStage = appController.setSovietUnionStage(testSovietUnionScene);
                    assertNotNull(testSovietUnionStage);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    @Test
    void checkBtnChina() {
        Button btnChina = lookup("#btn_china").queryButton();
        clickOn(btnChina);
        FxAssert.verifyThat(window("About China"), WindowMatchers.isShowing());
    }

    @Test
    void testSetChinaScene() throws IOException {
        Scene sceneChina = appController.setChinaScene();
        assertNotNull(sceneChina);
    }

    @Test
    void testSetChinaStage() throws IOException {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Scene testChinaScene = null;
                try {
                    testChinaScene = appController.setSovietUnionScene();
                    Stage testChinaStage = appController.setSovietUnionStage(testChinaScene);
                    assertNotNull(testChinaStage);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}

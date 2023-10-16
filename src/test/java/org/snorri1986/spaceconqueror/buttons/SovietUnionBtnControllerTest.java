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
public class SovietUnionBtnControllerTest extends ApplicationTest {

    public final AppLauncherController appLauncherController = new AppLauncherController();
    public final SovietUnionBtnController sovietUnionBtnController = new SovietUnionBtnController();

    @Start
    public void start(Stage stageOriginal) throws IOException {
        stageOriginal = appLauncherController.setSovietUnionStage(appLauncherController.setSovietUnionScene());
        stageOriginal.show();
    }

    @Test
    void testVostokStage() throws IOException {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Scene testVostokScene = null;
                try {
                    testVostokScene = sovietUnionBtnController.setVostokScene();
                    Stage testVostokStage = sovietUnionBtnController.setVostokStage(testVostokScene);
                    assertNotNull(testVostokStage);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    @Test
    void testVoshodStage() throws IOException {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Scene testVoshodScene = null;
                try {
                    testVoshodScene = sovietUnionBtnController.setVoshodScene();
                    Stage testVoshodStage = sovietUnionBtnController.setVoshodStage(testVoshodScene);
                    assertNotNull(testVoshodStage);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    @Test
    void testSoyuzStage() throws IOException {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Scene testSoyuzScene = null;
                try {
                    testSoyuzScene = sovietUnionBtnController.setSoyuzScene();
                    Stage testSoyuzStage = sovietUnionBtnController.setSoyuzStage(testSoyuzScene);
                    assertNotNull(testSoyuzStage);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    @Test
    void testMirStage() throws IOException {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Scene testMirScene = null;
                try {
                    testMirScene = sovietUnionBtnController.setMirScene();
                    Stage testMirStage = sovietUnionBtnController.setMirStage(testMirScene);
                    assertNotNull(testMirStage);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    @Test
    void testBuranStage() throws IOException {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Scene testBuranScene = null;
                try {
                    testBuranScene = sovietUnionBtnController.setBuranScene();
                    Stage testBuranStage = sovietUnionBtnController.setBuranStage(testBuranScene);
                    assertNotNull(testBuranStage);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    @Test
    void testLunaStage() throws IOException {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Scene testLunaScene = null;
                try {
                    testLunaScene = sovietUnionBtnController.setLunaScene();
                    Stage testLunaStage = sovietUnionBtnController.setLunaStage(testLunaScene);
                    assertNotNull(testLunaStage);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    @Test
    void testVeneraStage() throws IOException {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Scene testVeneraScene = null;
                try {
                    testVeneraScene = sovietUnionBtnController.setVeneraScene();
                    Stage testVeneraStage = sovietUnionBtnController.setVeneraStage(testVeneraScene);
                    assertNotNull(testVeneraStage);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}

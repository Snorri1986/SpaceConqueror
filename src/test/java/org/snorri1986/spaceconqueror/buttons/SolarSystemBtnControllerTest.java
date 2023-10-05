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
}


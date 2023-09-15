package org.snorri1986.spaceconqueror;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.ApplicationTest;
import org.testfx.framework.junit5.Start;

import java.io.IOException;


import static org.junit.jupiter.api.Assertions.assertEquals;
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
    @Disabled // body will be used in future
    void checkTextBeforeClicked() {
        clickOn("#welcome");
        Label myLabel = lookup("#welcomeText").query();
        assertEquals("Welcome to JavaFX Application!", myLabel.getText());
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
}

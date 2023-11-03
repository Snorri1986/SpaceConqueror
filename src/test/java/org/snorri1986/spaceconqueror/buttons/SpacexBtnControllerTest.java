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
public class SpacexBtnControllerTest extends ApplicationTest  {

    public final AppLauncherController appLauncherController = new AppLauncherController();

    public final SpacexBtnController spacexBtnController = new SpacexBtnController();

    @Start
    public void start(Stage stageOriginal) throws IOException {
        stageOriginal = appLauncherController.setSpaceXStage(appLauncherController.setSpaceXScene());
        stageOriginal.show();
    }

    @Test
    void testFalconOneStage() throws IOException {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Scene testFalconOneScene = null;
                try {
                    testFalconOneScene = spacexBtnController.setFalconOneScene();
                    Stage testFalconOneStage = spacexBtnController.setFalconOneStage(testFalconOneScene);
                    assertNotNull(testFalconOneStage);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}

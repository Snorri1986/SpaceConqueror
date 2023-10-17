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
public class ChinaBtnControllerTest extends ApplicationTest {

    public final AppLauncherController appLauncherController = new AppLauncherController();

    public final ChinaBtnController chinaBtnController = new ChinaBtnController();

    @Start
    public void start(Stage stageOriginal) throws IOException {
        stageOriginal = appLauncherController.setChinaStage(appLauncherController.setChinaScene());
        stageOriginal.show();
    }

    @Test
    void testPrj9211Stage() throws IOException {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Scene testPrj9211Scene = null;
                try {
                    testPrj9211Scene = chinaBtnController.setPrj9211Scene();
                    Stage testPrj9211Stage = chinaBtnController.setPrj9211Stage(testPrj9211Scene);
                    assertNotNull(testPrj9211Stage);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    @Test
    void testPrj9212Stage() throws IOException {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Scene testPrj9212Scene = null;
                try {
                    testPrj9212Scene = chinaBtnController.setPrj9212Scene();
                    Stage testPrj9212Stage = chinaBtnController.setPrj9212Stage(testPrj9212Scene);
                    assertNotNull(testPrj9212Stage);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}

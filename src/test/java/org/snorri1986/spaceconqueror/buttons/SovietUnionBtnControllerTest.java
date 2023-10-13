package org.snorri1986.spaceconqueror.buttons;

import javafx.stage.Stage;
import org.junit.jupiter.api.extension.ExtendWith;
import org.snorri1986.spaceconqueror.AppLauncherController;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.ApplicationTest;
import org.testfx.framework.junit5.Start;

import java.io.IOException;

@ExtendWith(ApplicationExtension.class)
public class SovietUnionBtnControllerTest extends ApplicationTest {

    public final AppLauncherController appLauncherController = new AppLauncherController();
    public final SovietUnionBtnController sovietUnionBtnController = new SovietUnionBtnController();

    @Start
    public void start(Stage stageOriginal) throws IOException {
        stageOriginal = appLauncherController.setSovietUnionStage(appLauncherController.setSovietUnionScene());
        stageOriginal.show();
    }
}

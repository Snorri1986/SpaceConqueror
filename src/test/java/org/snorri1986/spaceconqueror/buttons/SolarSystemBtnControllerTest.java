package org.snorri1986.spaceconqueror.buttons;

import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.snorri1986.spaceconqueror.AppLauncher;
import org.snorri1986.spaceconqueror.AppLauncherController;
import org.testfx.api.FxAssert;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.ApplicationTest;
import org.testfx.framework.junit5.Start;
import org.testfx.matcher.base.WindowMatchers;

import java.io.IOException;

@ExtendWith(ApplicationExtension.class)
public class SolarSystemBtnControllerTest extends ApplicationTest {

    //TODO: config test class

    private final AppLauncher hello = new AppLauncher();
    private final SolarSystemBtnController solarSystemBtnController = new SolarSystemBtnController();

    @Start
    public void start(Stage stageOriginal) throws IOException {
        hello.start(stageOriginal);
    }

    @Test
    void checkBtnMercury() {
        Button solarSystem = lookup("#btn_s_system").queryButton();
        Button btnMercury = lookup("#mercury").queryButton();
        clickOn(solarSystem);
        clickOn(btnMercury);
        FxAssert.verifyThat(window("Mercury"), WindowMatchers.isShowing());
    }
}

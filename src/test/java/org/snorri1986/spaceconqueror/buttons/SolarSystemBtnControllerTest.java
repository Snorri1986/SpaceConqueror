package org.snorri1986.spaceconqueror.buttons;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.snorri1986.spaceconqueror.AppLauncher;
import org.snorri1986.spaceconqueror.AppLauncherController;
import org.testfx.api.FxAssert;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.ApplicationTest;
import org.testfx.framework.junit5.Start;
import org.testfx.matcher.base.WindowMatchers;

import java.io.IOException;
import java.net.URL;

@ExtendWith(ApplicationExtension.class)
public class SolarSystemBtnControllerTest extends ApplicationTest {

    //TODO: config test class

    @Start
    public void start(Stage stageOriginal) throws IOException {
        URL fxmlLocationSolarSystem = getClass().getResource("solar-system.fxml");
        FXMLLoader fxmlSolarSystem = new FXMLLoader(fxmlLocationSolarSystem);
        Scene solarSystem = new Scene(fxmlSolarSystem.load(), 600, 400);
        stageOriginal.setTitle("About Solar System");
        stageOriginal.setScene(solarSystem);
        stageOriginal.show();
    }

    @Test
    void checkBtnMercury() {
        Button btnMercury = lookup("#mercury").queryButton();
        clickOn(btnMercury);
        FxAssert.verifyThat(window("Mercury"), WindowMatchers.isShowing());
    }
}


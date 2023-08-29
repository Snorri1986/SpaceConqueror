package org.snorri1986.spaceconqueror;

import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.assertions.api.Assertions;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.ApplicationTest;
import org.testfx.framework.junit5.Start;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(ApplicationExtension.class)
public class HelloApplicationTest extends ApplicationTest {

    private final HelloApplication hello = new HelloApplication();
    private Stage stageInternalTest;

    @Start
    public void start(Stage stageOriginal) throws IOException {
        hello.start(stageOriginal);
        stageInternalTest = hello.initStage(stageOriginal,null);
    }

    @Test
    void checkSceneExists() throws IOException {
        assertNotNull(hello.setScene());
    }

    @Test
    void testCheckTitle() {
        String title = stageInternalTest.getTitle();
        assertEquals("Hello!", title);
    }

    @Test
    void shouldContainButtonWithText(FxRobot robot) {
        // or (lookup by css id):
        Assertions.assertThat(robot.lookup("#myButton").queryAs(Button.class)).hasText("Hello");
        // or (lookup by css class):
        Assertions.assertThat(robot.lookup(".button").queryAs(Button.class)).hasText("Hello");
        // or (query specific type):
        Assertions.assertThat(robot.lookup(".button").queryButton()).hasText("Hello");
    }
}

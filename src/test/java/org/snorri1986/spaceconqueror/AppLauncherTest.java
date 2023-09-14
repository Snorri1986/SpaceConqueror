package org.snorri1986.spaceconqueror;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.ApplicationTest;
import org.testfx.framework.junit5.Start;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(ApplicationExtension.class)
public class AppLauncherTest extends ApplicationTest {

    private final AppLauncher hello = new AppLauncher();
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
    void checkTextOnTitle() {
        String title = stageInternalTest.getTitle();
        assertEquals("Content!", title);
    }
    @Test
    void checkTextOnButtonSolarSystem() throws IOException {
        Scene originalScene = hello.setScene();
        Button btn = (Button)originalScene.lookup("#btn_s_system");
        assertEquals("Solar System", btn.getText());
    }
    @Test
    void checkTextOnButtonSovietUnion() throws IOException {
        Scene originalScene = hello.setScene();
        Button btn = (Button)originalScene.lookup("#btn_s_union");
        assertEquals("Soviet Union", btn.getText());
    }
    @Test
    void checkTextOnButtonChina() throws IOException {
        Scene originalScene = hello.setScene();
        Button btn = (Button)originalScene.lookup("#btn_china");
        assertEquals("China", btn.getText());
    }
    @Test
    void checkTextOnButtonUSA() throws IOException {
        Scene originalScene = hello.setScene();
        Button btn = (Button)originalScene.lookup("#btn_usa");
        assertEquals("USA", btn.getText());
    }
    @Test
    void checkTextOnButtonIndia() throws IOException {
        Scene originalScene = hello.setScene();
        Button btn = (Button)originalScene.lookup("#btn_ind_bharat");
        assertEquals("India(Bharat)", btn.getText());
    }
    @Test
    void checkTextOnButtonSpaceX() throws IOException {
        Scene originalScene = hello.setScene();
        Button btn = (Button)originalScene.lookup("#btn_space_x");
        assertEquals("Space X", btn.getText());
    }
}

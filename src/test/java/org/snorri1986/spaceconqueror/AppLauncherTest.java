// pvs-studio exclude file
// This file will be excluded from analysis
package org.snorri1986.spaceconqueror;

import javafx.scene.Node;
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
    void checkOptimalSizeMainScene() throws IOException {
        final double normalHeight = 620;
        final double normalWidth = 320;
        Scene testScene = hello.setScene();
        assertEquals(testScene.getHeight(),normalHeight);
        assertEquals(testScene.getWidth(),normalWidth);
    }

    @Test
    void checkSetOptimalValueSizeMainScene() {
        final double normalHeight = 620;
        final double normalWidth = 320;
        double actualHeight = hello.getOptimalHeight();
        double actualWidth = hello.getOptimalWidth();
        assertEquals(actualHeight,normalHeight);
        assertEquals(actualWidth,normalWidth);
    }

    @Test
    void checkTextOnTitle() {
        String title = stageInternalTest.getTitle();
        assertEquals("SpaceConqueror", title);
    }
    @Test
    void checkTextOnButtonSolarSystem() throws IOException {
        Scene originalScene = hello.setScene();
        Button btn = (Button)originalScene.lookup("#btn_s_system");
        assertEquals("Solar System", btn.getText());
    }
    @Test
    void checkGraphicOnButtonSolarSystem() throws IOException {
        Scene originalScene = hello.setScene();
        Button btn = (Button)originalScene.lookup("#btn_s_system");
        Node picSun = btn.getGraphic();
        assertNotNull(picSun);
    }
    @Test
    void checkTextOnButtonSovietUnion() throws IOException {
        Scene originalScene = hello.setScene();
        Button btn = (Button)originalScene.lookup("#btn_s_union");
        assertEquals("Soviet Union", btn.getText());
    }
    @Test
    void checkGraphicOnButtonSovietUnion() throws IOException {
        Scene originalScene = hello.setScene();
        Button btn = (Button)originalScene.lookup("#btn_s_union");
        Node picSovietUnion = btn.getGraphic();
        assertNotNull(picSovietUnion);
    }
    @Test
    void checkTextOnButtonChina() throws IOException {
        Scene originalScene = hello.setScene();
        Button btn = (Button)originalScene.lookup("#btn_china");
        assertEquals("China", btn.getText());
    }
    @Test
    void checkGraphicOnButtonChina() throws IOException {
        Scene originalScene = hello.setScene();
        Button btn = (Button)originalScene.lookup("#btn_china");
        Node picChina = btn.getGraphic();
        assertNotNull(picChina);
    }
    @Test
    void checkTextOnButtonUSA() throws IOException {
        Scene originalScene = hello.setScene();
        Button btn = (Button)originalScene.lookup("#btn_usa");
        assertEquals("USA", btn.getText());
    }
    @Test
    void checkGraphicOnButtonUSA() throws IOException {
        Scene originalScene = hello.setScene();
        Button btn = (Button)originalScene.lookup("#btn_usa");
        Node picUSA = btn.getGraphic();
        assertNotNull(picUSA);
    }
    @Test
    void checkTextOnButtonIndia() throws IOException {
        Scene originalScene = hello.setScene();
        Button btn = (Button)originalScene.lookup("#btn_ind_bharat");
        assertEquals("India(Bharat)", btn.getText());
    }
    @Test
    void checkGraphicOnButtonIndia() throws IOException {
        Scene originalScene = hello.setScene();
        Button btn = (Button)originalScene.lookup("#btn_ind_bharat");
        Node picIndia = btn.getGraphic();
        assertNotNull(picIndia);
    }
    @Test
    void checkTextOnButtonSpaceX() throws IOException {
        Scene originalScene = hello.setScene();
        Button btn = (Button)originalScene.lookup("#btn_space_x");
        assertEquals("Space X", btn.getText());
    }
    @Test
    void checkGraphicOnButtonSpaceX() throws IOException {
        Scene originalScene = hello.setScene();
        Button btn = (Button)originalScene.lookup("#btn_space_x");
        Node picSpaceX = btn.getGraphic();
        assertNotNull(picSpaceX);
    }
}

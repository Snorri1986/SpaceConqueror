package org.snorri1986.spaceconqueror.buttons;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.snorri1986.spaceconqueror.AppLauncherController;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.ApplicationTest;
import org.testfx.framework.junit5.Start;


@ExtendWith(ApplicationExtension.class)
public class SpacexBtnControllerTest extends ApplicationTest {

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

  @Test
  void testFalconNineStage() throws IOException {
    Platform.runLater(new Runnable() {
      @Override
      public void run() {
        Scene testFalconNineScene = null;
        try {
          testFalconNineScene = spacexBtnController.setFalconNineScene();
          Stage testFalconNineStage = spacexBtnController.setFalconNineStage(testFalconNineScene);
          assertNotNull(testFalconNineStage);
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    });
  }

  @Test
  void testDragonStage() throws IOException {
    Platform.runLater(new Runnable() {
      @Override
      public void run() {
        Scene testDragonScene = null;
        try {
          testDragonScene = spacexBtnController.setDragonScene();
          Stage testDragonStage = spacexBtnController.setDragonStage(testDragonScene);
          assertNotNull(testDragonStage);
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    });
  }

  @Test
  void testFalconHeavyStage() throws IOException {
    Platform.runLater(new Runnable() {
      @Override
      public void run() {
        Scene testFalconHeavyScene = null;
        try {
          testFalconHeavyScene = spacexBtnController.setFalconHeavyScene();
          Stage testFalconHeavyStage = spacexBtnController.setFalconHeavyStage(testFalconHeavyScene);
          assertNotNull(testFalconHeavyStage);
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    });
  }

  @Test
  void testStarShipStage() throws IOException {
    Platform.runLater(new Runnable() {
      @Override
      public void run() {
        Scene testStarShipScene = null;
        try {
          testStarShipScene = spacexBtnController.setStarshipScene();
          Stage testStarShipStage = spacexBtnController.setStarshipStage(testStarShipScene);
          assertNotNull(testStarShipStage);
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    });
  }

  @Test
  void testStarLinkStage() throws IOException {
    Platform.runLater(new Runnable() {
      @Override
      public void run() {
        Scene testStarLinkScene = null;
        try {
          testStarLinkScene = spacexBtnController.setStarLinkScene();
          Stage testStarLinkStage = spacexBtnController.setStarLinkStage(testStarLinkScene);
          assertNotNull(testStarLinkStage);
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    });
  }

  @Test
  void testElonMaskStage() throws IOException {
    Platform.runLater(new Runnable() {
      @Override
      public void run() {
        Scene testElonMaskScene = null;
        try {
          testElonMaskScene = spacexBtnController.setElonMaskScene();
          Stage testElonMaskStage = spacexBtnController.setElonMaskStage(testElonMaskScene);
          assertNotNull(testElonMaskStage);
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    });
  }

  @Test
  void testCosmodromsStage() throws IOException {
    Platform.runLater(new Runnable() {
      @Override
      public void run() {
        Scene testCosmodromsScene = null;
        try {
          testCosmodromsScene = spacexBtnController.setCosmodromsScene();
          Stage testCosmodromsStage = spacexBtnController.setCosmodromsStage(testCosmodromsScene);
          assertNotNull(testCosmodromsStage);
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    });
  }

  @Test
  void testPeoplesStage() throws IOException {
    Platform.runLater(new Runnable() {
      @Override
      public void run() {
        Scene testPeoplesScene = null;
        try {
          testPeoplesScene = spacexBtnController.setPeoplesScene();
          Stage testPeopleStage = spacexBtnController.setPeoplesStage(testPeoplesScene);
          assertNotNull(testPeopleStage);
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    });
  }
}

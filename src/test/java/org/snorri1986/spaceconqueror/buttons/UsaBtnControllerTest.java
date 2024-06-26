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
public class UsaBtnControllerTest extends ApplicationTest {

  public final AppLauncherController appLauncherController = new AppLauncherController();

  public final UsaBtnController usaBtnController = new UsaBtnController();

  @Start
  public void start(Stage stageOriginal) throws IOException {
    stageOriginal = appLauncherController.setUsaStage(appLauncherController.setUsaScene());
    stageOriginal.show();
  }

  @Test
  void testProjectMercuryStage() throws IOException {
    Platform.runLater(new Runnable() {
      @Override
      public void run() {
        Scene testProjectMercuryScene = null;
        try {
          testProjectMercuryScene = usaBtnController.setMercuryProjectScene();
          Stage testProjectMercuryStage = usaBtnController.setMercuryProjectStage(testProjectMercuryScene);
          assertNotNull(testProjectMercuryStage);
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    });
  }

  @Test
  void testGeminiProgramStage() throws IOException {
    Platform.runLater(new Runnable() {
      @Override
      public void run() {
        Scene testGeminiProgramScene = null;
        try {
          testGeminiProgramScene = usaBtnController.setGeminiProgramScene();
          Stage testGeminiProgramStage = usaBtnController.setGeminiProgramStage(testGeminiProgramScene);
          assertNotNull(testGeminiProgramStage);
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    });
  }

  @Test
  void testApolloProgramStage() throws IOException {
    Platform.runLater(new Runnable() {
      @Override
      public void run() {
        Scene testApolloProgramScene = null;
        try {
          testApolloProgramScene = usaBtnController.setApolloProgramScene();
          Stage testApolloProgramStage = usaBtnController.setApolloProgramStage(testApolloProgramScene);
          assertNotNull(testApolloProgramStage);
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    });
  }

  @Test
  void testSoyuzApolloProgramStage() throws IOException {
    Platform.runLater(new Runnable() {
      @Override
      public void run() {
        Scene testSoyuzApolloProgramScene = null;
        try {
          testSoyuzApolloProgramScene = usaBtnController.setSoyuzApolloProgramScene();
          Stage testSoyuzApolloProgramStage = usaBtnController.setSoyuzApolloProgramStage(testSoyuzApolloProgramScene);
          assertNotNull(testSoyuzApolloProgramStage);
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    });
  }

  @Test
  void testIssStage() throws IOException {
    Platform.runLater(new Runnable() {
      @Override
      public void run() {
        Scene testIssScene = null;
        try {
          testIssScene = usaBtnController.setIssScene();
          Stage testIssStage = usaBtnController.setIssStage(testIssScene);
          assertNotNull(testIssStage);
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    });
  }

  @Test
  void testSpaceShuttleProgramStage() throws IOException {
    Platform.runLater(new Runnable() {
      @Override
      public void run() {
        Scene testSpaceShuttleProgramScene = null;
        try {
          testSpaceShuttleProgramScene = usaBtnController.setSpaceShuttleProgramScene();
          Stage testSpaceShuttleProgramStage = usaBtnController.setSpaceShuttleProgramStage(testSpaceShuttleProgramScene);
          assertNotNull(testSpaceShuttleProgramStage);
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    });
  }

  @Test
  void testUsaCosmodromsStage() throws IOException {
    Platform.runLater(new Runnable() {
      @Override
      public void run() {
        Scene testUsaCosmodromsScene = null;
        try {
          testUsaCosmodromsScene = usaBtnController.setCosmodromsScene();
          Stage testUsaCosmodromsStage = usaBtnController.setCosmodromsStage(testUsaCosmodromsScene);
          assertNotNull(testUsaCosmodromsStage);
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    });
  }

  @Test
  void testUsaPeoplesStage() throws IOException {
    Platform.runLater(new Runnable() {
      @Override
      public void run() {
        Scene testUsaPeoplesScene = null;
        try {
          testUsaPeoplesScene = usaBtnController.setPeoplesScene();
          Stage testUsaPeoplesStage = usaBtnController.setPeoplesStage(testUsaPeoplesScene);
          assertNotNull(testUsaPeoplesStage);
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    });
  }

  @Test
  void testNasaStage() throws IOException {
    Platform.runLater(new Runnable() {
      @Override
      public void run() {
        Scene testNasaScene = null;
        try {
          testNasaScene = usaBtnController.setNasaScene();
          Stage testNasaStage = usaBtnController.setNasaStage(testNasaScene);
          assertNotNull(testNasaStage);
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    });
  }
}

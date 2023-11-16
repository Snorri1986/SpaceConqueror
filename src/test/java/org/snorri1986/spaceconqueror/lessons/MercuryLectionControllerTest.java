package org.snorri1986.spaceconqueror.lessons;

import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.snorri1986.spaceconqueror.AppLauncherController;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.ApplicationTest;
import org.testfx.framework.junit5.Start;

import java.io.File;
import java.io.IOException;


import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(ApplicationExtension.class)
public class MercuryLectionControllerTest extends ApplicationTest {

    public final AppLauncherController appLauncherController = new AppLauncherController();
    public final MercuryLectionController mercuryLectionController = new MercuryLectionController();

    FileChooser fileChooserENtest = new FileChooser();

    @Start
    public void start(Stage stageOriginal) throws IOException {
        stageOriginal = appLauncherController.setSolarSystemStage(appLauncherController.setSolarSystemScene());
        stageOriginal.show();
    }

    @Test
    public void checkInitialDirectory() {
        fileChooserENtest.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\java\\org\\snorri1986\\spaceconqueror\\content\\text\\en"));
        assertNotNull(fileChooserENtest.getInitialDirectory());
    }

}

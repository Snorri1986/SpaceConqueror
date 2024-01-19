package org.snorri1986.spaceconqueror.lessons;

import javafx.scene.image.Image;
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
public class ChinaLessonControllerTest extends ApplicationTest {

    public final AppLauncherController appLauncherController = new AppLauncherController();
    FileChooser fileChooserUAtest = new FileChooser();
    FileChooser fileChooserENtest = new FileChooser();

    FileChooser fileChooserDKtest = new FileChooser();


    @Start
    public void start(Stage stageOriginal) throws IOException {
        stageOriginal = appLauncherController.setSovietUnionStage(appLauncherController.setSovietUnionScene());
        stageOriginal.show();
    }

    @Test
    public void checkInitialDirectoryUA() {
        fileChooserUAtest.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\china\\ua"));
        assertNotNull(fileChooserUAtest.getInitialDirectory());
    }

    @Test
    public void checkInitialDirectoryEN() {
        fileChooserENtest.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\china\\en"));
        assertNotNull(fileChooserENtest.getInitialDirectory());
    }

    @Test
    public void checkInitialDirectoryDK() {
        fileChooserDKtest.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\china\\dk"));
        assertNotNull(fileChooserDKtest.getInitialDirectory());
    }
    @Test
    public void testPRJ9211PhotoOne() {
        String prj9211PhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\china\\prj9211\\1.jpg";
        File photoprj9211OneFile = new File(prj9211PhotoOnePath);
        Image photoprj9211OneImage = new Image(photoprj9211OneFile.toURI().toString());
        assertNotNull(photoprj9211OneFile);
        assertNotNull(photoprj9211OneImage);
    }
    @Test
    public void testPRJ9211PhotoTwo() {
        String prj9211PhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\china\\prj9211\\2.jpg";
        File photoprj9211TwoFile = new File(prj9211PhotoTwoPath);
        Image photoprj9211TwoImage = new Image(photoprj9211TwoFile.toURI().toString());
        assertNotNull(photoprj9211TwoFile);
        assertNotNull(photoprj9211TwoImage);
    }

    @Test
    public void testPRJ9211PhotoThree() {
        String prj9211PhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\china\\prj9211\\3.jpg";
        File photoprj9211ThreeFile = new File(prj9211PhotoThreePath);
        Image photoprj9211ThreeImage = new Image(photoprj9211ThreeFile.toURI().toString());
        assertNotNull(photoprj9211ThreeFile);
        assertNotNull(photoprj9211ThreeImage);
    }
}

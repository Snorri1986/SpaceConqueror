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
public class SovietUnionLessonControllerTest extends ApplicationTest {

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
        fileChooserUAtest.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\sovietunion\\ua"));
        assertNotNull(fileChooserUAtest.getInitialDirectory());
    }

    @Test
    public void checkInitialDirectoryEN() {
        fileChooserENtest.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\sovietunion\\en"));
        assertNotNull(fileChooserENtest.getInitialDirectory());
    }

    @Test
    public void checkInitialDirectoryDK() {
        fileChooserDKtest.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\sovietunion\\dk"));
        assertNotNull(fileChooserDKtest.getInitialDirectory());
    }

    @Test
    public void testVostokPhotoOne() {
        String vostokPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\sovietunion\\vostok\\1.jpg";
        File photoVostokOneFile = new File(vostokPhotoOnePath);
        Image photoVostokOneImage = new Image(photoVostokOneFile.toURI().toString());
        assertNotNull(photoVostokOneFile);
        assertNotNull(photoVostokOneImage);
    }

    @Test
    public void testMercuryPhotoTwo() {
        String vostokPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\sovietunion\\vostok\\2.jpg";
        File photoVostokTwoFile = new File(vostokPhotoTwoPath);
        Image photoVostokTwoImage = new Image(photoVostokTwoFile.toURI().toString());
        assertNotNull(photoVostokTwoFile);
        assertNotNull(photoVostokTwoImage);
    }

    @Test
    public void testMercuryPhotoThree() {
        String vostokPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\sovietunion\\vostok\\3.jpg";
        File photoVostokThreeFile = new File(vostokPhotoThreePath);
        Image photoVostokThreeImage = new Image(photoVostokThreeFile.toURI().toString());
        assertNotNull(photoVostokThreeFile);
        assertNotNull(photoVostokThreeImage);
    }
}

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
public class SpacexLessonControllerTest extends ApplicationTest {

    public final AppLauncherController appLauncherController = new AppLauncherController();
    FileChooser fileChooserUAtest = new FileChooser();
    FileChooser fileChooserENtest = new FileChooser();

    FileChooser fileChooserDKtest = new FileChooser();


    @Start
    public void start(Stage stageOriginal) throws IOException {
        stageOriginal = appLauncherController.setSpaceXStage(appLauncherController.setSpaceXScene());
        stageOriginal.show();
    }

    @Test
    public void checkInitialDirectoryUA() {
        fileChooserUAtest.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\spacex\\ua"));
        assertNotNull(fileChooserUAtest.getInitialDirectory());
    }

    @Test
    public void checkInitialDirectoryEN() {
        fileChooserENtest.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\spacex\\en"));
        assertNotNull(fileChooserENtest.getInitialDirectory());
    }

    @Test
    public void checkInitialDirectoryDK() {
        fileChooserDKtest.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\spacex\\dk"));
        assertNotNull(fileChooserDKtest.getInitialDirectory());
    }

    @Test
    public void testSpacexPhotoOne() {
        String indiaSatellitesPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\spacex\\falcone1\\1.jpg";
        File photoIndiaSatellitesOneFile = new File(indiaSatellitesPhotoOnePath);
        Image photoIndiaSatellitesOneImage = new Image(photoIndiaSatellitesOneFile.toURI().toString());
        assertNotNull(photoIndiaSatellitesOneFile);
        assertNotNull(photoIndiaSatellitesOneImage);
    }
    @Test
    public void testIndiaSatellitesPhotoTwo() {
        String indiaSatellitesPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\india\\satellites\\2.jpg";
        File photoIndiaSatellitesTwoFile = new File(indiaSatellitesPhotoTwoPath);
        Image photoIndiaSatellitesTwoImage = new Image(photoIndiaSatellitesTwoFile.toURI().toString());
        assertNotNull(photoIndiaSatellitesTwoFile);
        assertNotNull(photoIndiaSatellitesTwoImage);
    }
    @Test
    public void testIndiaSatellitesPhotoThree() {
        String indiaSatellitesPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\india\\satellites\\3.jpg";
        File photoIndiaSatellitesThreeFile = new File(indiaSatellitesPhotoThreePath);
        Image photoIndiaSatellitesThreeImage = new Image(photoIndiaSatellitesThreeFile.toURI().toString());
        assertNotNull(photoIndiaSatellitesThreeFile);
        assertNotNull(photoIndiaSatellitesThreeImage);
    }
}

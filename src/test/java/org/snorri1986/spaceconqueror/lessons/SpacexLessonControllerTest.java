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
    public void testSpacexFalconOnePhotoOne() {
        String spacexPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\spacex\\falcon1\\1.jpg";
        File photoSpacexOneFile = new File(spacexPhotoOnePath);
        Image photoSpacexOneImage = new Image(photoSpacexOneFile.toURI().toString());
        assertNotNull(photoSpacexOneFile);
        assertNotNull(photoSpacexOneImage);
    }

    @Test
    public void testSpacexFalconOnePhotoTwo() {
        String spacexPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\spacex\\falcon1\\2.jpg";
        File photoSpacexTwoFile = new File(spacexPhotoTwoPath);
        Image photoSpacexTwoImage = new Image(photoSpacexTwoFile.toURI().toString());
        assertNotNull(photoSpacexTwoFile);
        assertNotNull(photoSpacexTwoImage);
    }

    @Test
    public void testSpacexFalconOnePhotoThree() {
        String spacexPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\spacex\\falcon1\\3.jpg";
        File photoSpacexThreeFile = new File(spacexPhotoThreePath);
        Image photoSpacexTwoImage = new Image(photoSpacexThreeFile.toURI().toString());
        assertNotNull(photoSpacexThreeFile);
        assertNotNull(photoSpacexTwoImage);
    }

    @Test
    public void testSpacexFalconNinePhotoOne() {
        String spacexFalconNinePhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\spacex\\falcon9\\1.jpg";
        File photoSpacexFalconeNineOneFile = new File(spacexFalconNinePhotoOnePath);
        Image photoSpacexFalconeNineOneImage = new Image(photoSpacexFalconeNineOneFile.toURI().toString());
        assertNotNull(photoSpacexFalconeNineOneFile);
        assertNotNull(photoSpacexFalconeNineOneImage);
    }

    @Test
    public void testSpacexFalconNinePhotoTwo() {
        String spacexFalconNinePhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\spacex\\falcon9\\2.jpg";
        File photoSpacexFalconeNineTwoFile = new File(spacexFalconNinePhotoTwoPath);
        Image photoSpacexFalconeNineTwoImage = new Image(photoSpacexFalconeNineTwoFile.toURI().toString());
        assertNotNull(photoSpacexFalconeNineTwoFile);
        assertNotNull(photoSpacexFalconeNineTwoImage);
    }

    @Test
    public void testSpacexFalconNinePhotoThree() {
        String spacexFalconNinePhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\spacex\\falcon9\\3.jpg";
        File photoSpacexFalconeNineThreeFile = new File(spacexFalconNinePhotoThreePath);
        Image photoSpacexFalconeNineThreeImage = new Image(photoSpacexFalconeNineThreeFile.toURI().toString());
        assertNotNull(photoSpacexFalconeNineThreeFile);
        assertNotNull(photoSpacexFalconeNineThreeImage);
    }

    @Test
    public void testDragonPhotoOne() {
        String spacexDragonPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\spacex\\dragon\\1.jpg";
        File photoSpacexDragonOneFile = new File(spacexDragonPhotoOnePath);
        Image photoSpacexDragonOneImage = new Image(photoSpacexDragonOneFile.toURI().toString());
        assertNotNull(photoSpacexDragonOneFile);
        assertNotNull(photoSpacexDragonOneImage);
    }

    @Test
    public void testDragonPhotoTwo() {
        String spacexDragonPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\spacex\\dragon\\2.jpg";
        File photoSpacexDragonTwoFile = new File(spacexDragonPhotoTwoPath);
        Image photoSpacexDragonTwoImage = new Image(photoSpacexDragonTwoFile.toURI().toString());
        assertNotNull(photoSpacexDragonTwoFile);
        assertNotNull(photoSpacexDragonTwoImage);
    }

    @Test
    public void testDragonPhotoThree() {
        String spacexDragonPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\spacex\\dragon\\3.jpg";
        File photoSpacexDragonThreeFile = new File(spacexDragonPhotoThreePath);
        Image photoSpacexDragonThreeImage = new Image(photoSpacexDragonThreeFile.toURI().toString());
        assertNotNull(photoSpacexDragonThreeFile);
        assertNotNull(photoSpacexDragonThreeImage);
    }

    @Test
    public void testFalconHeavyPhotoOne() {
        String spacexFalconHeavyPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\spacex\\falconheavy\\1.jpg";
        File photoSpacexFalconHeavyOneFile = new File(spacexFalconHeavyPhotoOnePath);
        Image photoSpacexFalconHeavyOneImage = new Image(photoSpacexFalconHeavyOneFile.toURI().toString());
        assertNotNull(photoSpacexFalconHeavyOneFile);
        assertNotNull(photoSpacexFalconHeavyOneImage);
    }

    @Test
    public void testFalconHeavyPhotoTwo() {
        String spacexFalconHeavyPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\spacex\\falconheavy\\2.jpg";
        File photoSpacexFalconHeavyTwoFile = new File(spacexFalconHeavyPhotoTwoPath);
        Image photoSpacexFalconHeavyTwoImage = new Image(photoSpacexFalconHeavyTwoFile.toURI().toString());
        assertNotNull(photoSpacexFalconHeavyTwoFile);
        assertNotNull(photoSpacexFalconHeavyTwoImage);
    }

    @Test
    public void testFalconHeavyPhotoThree() {
        String spacexFalconHeavyPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\spacex\\falconheavy\\3.jpg";
        File photoSpacexFalconHeavyThreeFile = new File(spacexFalconHeavyPhotoThreePath);
        Image photoSpacexFalconHeavyThreeImage = new Image(photoSpacexFalconHeavyThreeFile.toURI().toString());
        assertNotNull(photoSpacexFalconHeavyThreeFile);
        assertNotNull(photoSpacexFalconHeavyThreeImage);
    }
}

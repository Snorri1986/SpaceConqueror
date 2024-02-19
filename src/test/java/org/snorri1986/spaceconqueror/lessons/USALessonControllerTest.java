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
public class USALessonControllerTest extends ApplicationTest {

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
        fileChooserUAtest.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\usa\\ua"));
        assertNotNull(fileChooserUAtest.getInitialDirectory());
    }

    @Test
    public void checkInitialDirectoryEN() {
        fileChooserENtest.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\usa\\en"));
        assertNotNull(fileChooserENtest.getInitialDirectory());
    }

    @Test
    public void checkInitialDirectoryDK() {
        fileChooserDKtest.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\usa\\dk"));
        assertNotNull(fileChooserDKtest.getInitialDirectory());
    }
    @Test
    public void testUSAMercuryPhotoOne() {
        String mercuryPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\mercury\\1.jpg";
        File photoMercuryOneFile = new File(mercuryPhotoOnePath);
        Image photoMercuryOneImage = new Image(photoMercuryOneFile.toURI().toString());
        assertNotNull(photoMercuryOneFile);
        assertNotNull(photoMercuryOneImage);
    }
    @Test
    public void testUSAMercuryPhotoTwo() {
        String mercuryPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\mercury\\2.jpg";
        File photoMercuryTwoFile = new File(mercuryPhotoTwoPath);
        Image photoMercuryTwoImage = new Image(photoMercuryTwoFile.toURI().toString());
        assertNotNull(photoMercuryTwoFile);
        assertNotNull(photoMercuryTwoImage);
    }

    @Test
    public void testUSAMercuryPhotoThree() {
        String mercuryPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\mercury\\3.jpg";
        File photoMercuryThreeFile = new File(mercuryPhotoThreePath);
        Image photoMercuryThreeImage = new Image(photoMercuryThreeFile.toURI().toString());
        assertNotNull(photoMercuryThreeFile);
        assertNotNull(photoMercuryThreeImage);
    }
    @Test
    public void testUSAGeminiPhotoOne() {
        String geminiPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\gemini\\1.jpg";
        File photoGeminiOneFile = new File(geminiPhotoOnePath);
        Image photoGeminiOneImage = new Image(photoGeminiOneFile.toURI().toString());
        assertNotNull(photoGeminiOneFile);
        assertNotNull(photoGeminiOneImage);
    }
    @Test
    public void testUSAGeminiPhotoTwo() {
        String geminiPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\gemini\\2.jpg";
        File photoGeminiTwoFile = new File(geminiPhotoTwoPath);
        Image photoGeminiTwoImage = new Image(photoGeminiTwoFile.toURI().toString());
        assertNotNull(photoGeminiTwoFile);
        assertNotNull(photoGeminiTwoImage);
    }
    @Test
    public void testUSAGeminiPhotoThree() {
        String geminiPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\gemini\\3.jpg";
        File photoGeminiThreeFile = new File(geminiPhotoThreePath);
        Image photoGeminiThreeImage = new Image(photoGeminiThreeFile.toURI().toString());
        assertNotNull(photoGeminiThreeFile);
        assertNotNull(photoGeminiThreeImage);
    }
}

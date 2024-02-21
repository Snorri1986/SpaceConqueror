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
    @Test
    public void testUSAApolloPhotoOne() {
        String apolloPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\apollo\\1.jpg";
        File photoApolloOneFile = new File(apolloPhotoOnePath);
        Image photoApolloOneImage = new Image(photoApolloOneFile.toURI().toString());
        assertNotNull(photoApolloOneFile);
        assertNotNull(photoApolloOneImage);
    }
    @Test
    public void testUSAApolloPhotoTwo() {
        String apolloPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\apollo\\2.jpg";
        File photoApolloTwoFile = new File(apolloPhotoTwoPath);
        Image photoApolloTwoImage = new Image(photoApolloTwoFile.toURI().toString());
        assertNotNull(photoApolloTwoFile);
        assertNotNull(photoApolloTwoImage);
    }
    @Test
    public void testUSAApolloPhotoThree() {
        String apolloPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\apollo\\3.jpg";
        File photoApolloThreeFile = new File(apolloPhotoThreePath);
        Image photoApolloThreeImage = new Image(photoApolloThreeFile.toURI().toString());
        assertNotNull(photoApolloThreeFile);
        assertNotNull(photoApolloThreeImage);
    }
    @Test
    public void testUSASoyuzApolloProgramPhotoOne() {
        String soyuzApolloProgramPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\soyuz-apollo\\1.jpg";
        File photoSoyuzApolloProgramOneFile = new File(soyuzApolloProgramPhotoOnePath);
        Image photoSoyuzApolloProgramOneImage = new Image(photoSoyuzApolloProgramOneFile.toURI().toString());
        assertNotNull(photoSoyuzApolloProgramOneFile);
        assertNotNull(photoSoyuzApolloProgramOneImage);
    }
    @Test
    public void testUSASoyuzApolloProgramPhotoTwo() {
        String soyuzApolloProgramPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\soyuz-apollo\\2.jpg";
        File photoSoyuzApolloProgramTwoFile = new File(soyuzApolloProgramPhotoTwoPath);
        Image photoSoyuzApolloProgramTwoImage = new Image(photoSoyuzApolloProgramTwoFile.toURI().toString());
        assertNotNull(photoSoyuzApolloProgramTwoFile);
        assertNotNull(photoSoyuzApolloProgramTwoImage);
    }
    @Test
    public void testUSASoyuzApolloProgramPhotoThree() {
        String soyuzApolloProgramPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\soyuz-apollo\\3.jpg";
        File photoSoyuzApolloProgramThreeFile = new File(soyuzApolloProgramPhotoThreePath);
        Image photoSoyuzApolloProgramThreeImage = new Image(photoSoyuzApolloProgramThreeFile.toURI().toString());
        assertNotNull(photoSoyuzApolloProgramThreeFile);
        assertNotNull(photoSoyuzApolloProgramThreeImage);
    }
}

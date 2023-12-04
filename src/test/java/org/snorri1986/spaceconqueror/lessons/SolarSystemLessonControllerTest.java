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


import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(ApplicationExtension.class)
public class SolarSystemLessonControllerTest extends ApplicationTest {

    public final AppLauncherController appLauncherController = new AppLauncherController();
    FileChooser fileChooserUAtest = new FileChooser();
    FileChooser fileChooserENtest = new FileChooser();

    FileChooser fileChooserDKtest = new FileChooser();


    @Start
    public void start(Stage stageOriginal) throws IOException {
        stageOriginal = appLauncherController.setSolarSystemStage(appLauncherController.setSolarSystemScene());
        stageOriginal.show();
    }

    @Test
    public void checkInitialDirectoryUA() {
        fileChooserUAtest.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\solarsystem\\ua"));
        assertNotNull(fileChooserUAtest.getInitialDirectory());
    }

    @Test
    public void checkInitialDirectoryEN() {
        fileChooserENtest.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\solarsystem\\en"));
        assertNotNull(fileChooserENtest.getInitialDirectory());
    }

    @Test
    public void checkInitialDirectoryDK() {
        fileChooserDKtest.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\solarsystem\\dk"));
        assertNotNull(fileChooserDKtest.getInitialDirectory());
    }

    @Test
    public void testMercuryPhotoOne() {
        String mercuryPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\solarsystem\\mercury\\1.jpg";
        File photoMercuryOneFile = new File(mercuryPhotoOnePath);
        Image photoMercuryOneImage = new Image(photoMercuryOneFile.toURI().toString());
        assertNotNull(photoMercuryOneFile);
        assertNotNull(photoMercuryOneImage);
    }

    @Test
    public void testMercuryPhotoTwo() {
        String mercuryPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\solarsystem\\mercury\\2.jpg";
        File photoMercuryTwoFile = new File(mercuryPhotoTwoPath);
        Image photoMercuryTwoImage = new Image(photoMercuryTwoFile.toURI().toString());
        assertNotNull(photoMercuryTwoFile);
        assertNotNull(photoMercuryTwoImage);
    }

    @Test
    public void testMercuryPhotoThree() {
        String mercuryPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\solarsystem\\mercury\\3.jpg";
        File photoMercuryThreeFile = new File(mercuryPhotoThreePath);
        Image photoMercuryThreeImage = new Image(photoMercuryThreeFile.toURI().toString());
        assertNotNull(photoMercuryThreeFile);
        assertNotNull(photoMercuryThreeImage);
    }

    @Test
    public void testVenusPhotoOne() {
        String venusPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\solarsystem\\venus\\1.jpg";
        File photoVenusOneFile = new File(venusPhotoOnePath);
        Image photoVenusOneImage = new Image(photoVenusOneFile.toURI().toString());
        assertNotNull(photoVenusOneFile);
        assertNotNull(photoVenusOneImage);
    }

    @Test
    public void testVenusPhotoTwo() {
        String venusPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\solarsystem\\venus\\2.jpg";
        File photoVenusTwoFile = new File(venusPhotoTwoPath);
        Image photoVenusTwoImage = new Image(photoVenusTwoFile.toURI().toString());
        assertNotNull(photoVenusTwoFile);
        assertNotNull(photoVenusTwoImage);
    }

    @Test
    public void testVenusPhotoThree() {
        String venusPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\solarsystem\\venus\\3.jpg";
        File photoVenusThreeFile = new File(venusPhotoThreePath);
        Image photoVenusThreeImage = new Image(photoVenusThreeFile.toURI().toString());
        assertNotNull(photoVenusThreeFile);
        assertNotNull(photoVenusThreeImage);
    }

    @Test
    public void testEarthPhotoOne() {
        String earthPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\solarsystem\\earth\\1.jpg";
        File photoEarthOneFile = new File(earthPhotoOnePath);
        Image photoEarthOneImage = new Image(photoEarthOneFile.toURI().toString());
        assertNotNull(photoEarthOneFile);
        assertNotNull(photoEarthOneImage);
    }

    @Test
    public void testEarthPhotoTwo() {
        String earthPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\solarsystem\\earth\\2.jpg";
        File photoEarthTwoFile = new File(earthPhotoTwoPath);
        Image photoEarthTwoImage = new Image(photoEarthTwoFile.toURI().toString());
        assertNotNull(photoEarthTwoFile);
        assertNotNull(photoEarthTwoImage);
    }

    @Test
    public void testEarthPhotoThree() {
        String earthPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\solarsystem\\earth\\3.jpg";
        File photoEarthThreeFile = new File(earthPhotoThreePath);
        Image photoEarthThreeImage = new Image(photoEarthThreeFile.toURI().toString());
        assertNotNull(photoEarthThreeFile);
        assertNotNull(photoEarthThreeImage);
    }

    @Test
    public void testMarsPhotoOne() {
        String marsPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\solarsystem\\mars\\1.jpg";
        File photoMarsOneFile = new File(marsPhotoOnePath);
        Image photoMarsOneImage = new Image(photoMarsOneFile.toURI().toString());
        assertNotNull(photoMarsOneFile);
        assertNotNull(photoMarsOneImage);
    }

    @Test
    public void testMarsPhotoTwo() {
        String marsPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\solarsystem\\mars\\2.jpg";
        File photoMarsTwoFile = new File(marsPhotoTwoPath);
        Image photoMarsTwoImage = new Image(photoMarsTwoFile.toURI().toString());
        assertNotNull(photoMarsTwoFile);
        assertNotNull(photoMarsTwoImage);
    }

    @Test
    public void testMarsPhotoThree() {
        String marsPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\solarsystem\\mars\\3.jpg";
        File photoMarsThreeFile = new File(marsPhotoThreePath);
        Image photoMarsThreeImage = new Image(photoMarsThreeFile.toURI().toString());
        assertNotNull(photoMarsThreeFile);
        assertNotNull(photoMarsThreeImage);
    }
}

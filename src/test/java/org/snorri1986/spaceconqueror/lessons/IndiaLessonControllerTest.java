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
public class IndiaLessonControllerTest extends ApplicationTest {

    public final AppLauncherController appLauncherController = new AppLauncherController();
    FileChooser fileChooserUAtest = new FileChooser();
    FileChooser fileChooserENtest = new FileChooser();

    FileChooser fileChooserDKtest = new FileChooser();


    @Start
    public void start(Stage stageOriginal) throws IOException {
        stageOriginal = appLauncherController.setIndiaStage(appLauncherController.setIndiaScene());
        stageOriginal.show();
    }

    @Test
    public void checkInitialDirectoryUA() {
        fileChooserUAtest.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\india\\ua"));
        assertNotNull(fileChooserUAtest.getInitialDirectory());
    }

    @Test
    public void checkInitialDirectoryEN() {
        fileChooserENtest.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\india\\en"));
        assertNotNull(fileChooserENtest.getInitialDirectory());
    }

    @Test
    public void checkInitialDirectoryDK() {
        fileChooserDKtest.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\india\\dk"));
        assertNotNull(fileChooserDKtest.getInitialDirectory());
    }
    @Test
    public void testIndiaSatellitesPhotoOne() {
        String indiaSatellitesPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\india\\satellites\\1.jpg";
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
    @Test
    public void testIndiaGaganPhotoOne() {
        String indiaGaganPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\india\\gagan\\1.jpg";
        File photoIndiaGaganOneFile = new File(indiaGaganPhotoOnePath);
        Image photoIndiaGaganOneImage = new Image(photoIndiaGaganOneFile.toURI().toString());
        assertNotNull(photoIndiaGaganOneFile);
        assertNotNull(photoIndiaGaganOneImage);
    }
    @Test
    public void testIndiaGaganPhotoTwo() {
        String indiaGaganPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\india\\gagan\\2.jpg";
        File photoIndiaGaganTwoFile = new File(indiaGaganPhotoTwoPath);
        Image photoIndiaGaganTwoImage = new Image(photoIndiaGaganTwoFile.toURI().toString());
        assertNotNull(photoIndiaGaganTwoFile);
        assertNotNull(photoIndiaGaganTwoImage);
    }
    @Test
    public void testIndiaGaganPhotoThree() {
        String indiaGaganPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\india\\gagan\\3.jpg";
        File photoIndiaGaganThreeFile = new File(indiaGaganPhotoThreePath);
        Image photoIndiaGaganThreeImage = new Image(photoIndiaGaganThreeFile.toURI().toString());
        assertNotNull(photoIndiaGaganThreeFile);
        assertNotNull(photoIndiaGaganThreeImage);
    }
    @Test
    public void testIndiaIrnssPhotoOne() {
        String indiaIrnssPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\india\\irnss\\1.jpg";
        File photoIndiaIrnssOneFile = new File(indiaIrnssPhotoOnePath);
        Image photoIndiaIrnssOneImage = new Image(photoIndiaIrnssOneFile.toURI().toString());
        assertNotNull(photoIndiaIrnssOneFile);
        assertNotNull(photoIndiaIrnssOneImage);
    }
    @Test
    public void testIndiaIrnssPhotoTwo() {
        String indiaIrnssPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\india\\irnss\\2.jpg";
        File photoIndiaIrnssTwoFile = new File(indiaIrnssPhotoTwoPath);
        Image photoIndiaIrnssTwoImage = new Image(photoIndiaIrnssTwoFile.toURI().toString());
        assertNotNull(photoIndiaIrnssTwoFile);
        assertNotNull(photoIndiaIrnssTwoImage);
    }
    @Test
    public void testIndiaIrnssPhotoThree() {
        String indiaIrnssPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\india\\irnss\\3.jpg";
        File photoIndiaIrnssThreeFile = new File(indiaIrnssPhotoThreePath);
        Image photoIndiaIrnssThreeImage = new Image(photoIndiaIrnssThreeFile.toURI().toString());
        assertNotNull(photoIndiaIrnssThreeFile);
        assertNotNull(photoIndiaIrnssThreeImage);
    }
    @Test
    public void testIndiaChandrayaan1PhotoOne() {
        String indiaChandrayaan1PhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\india\\chandrayaan1\\1.jpg";
        File photoIndiaChandrayaan1OneFile = new File(indiaChandrayaan1PhotoOnePath);
        Image photoIndiaChandrayaan1OneImage = new Image(photoIndiaChandrayaan1OneFile.toURI().toString());
        assertNotNull(photoIndiaChandrayaan1OneFile);
        assertNotNull(photoIndiaChandrayaan1OneImage);
    }
    @Test
    public void testIndiaChandrayaan1PhotoTwo() {
        String indiaChandrayaan1PhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\india\\chandrayaan1\\2.jpg";
        File photoIndiaChandrayaan1TwoFile = new File(indiaChandrayaan1PhotoTwoPath);
        Image photoIndiaChandrayaan1TwoImage = new Image(photoIndiaChandrayaan1TwoFile.toURI().toString());
        assertNotNull(photoIndiaChandrayaan1TwoFile);
        assertNotNull(photoIndiaChandrayaan1TwoImage);
    }
    @Test
    public void testIndiaChandrayaan1PhotoThree() {
        String indiaChandrayaan1PhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\india\\chandrayaan1\\3.jpg";
        File photoIndiaChandrayaan1ThreeFile = new File(indiaChandrayaan1PhotoThreePath);
        Image photoIndiaChandrayaan1ThreeImage = new Image(photoIndiaChandrayaan1ThreeFile.toURI().toString());
        assertNotNull(photoIndiaChandrayaan1ThreeFile);
        assertNotNull(photoIndiaChandrayaan1ThreeImage);
    }
    @Test
    public void testIndiaMarsOrbiterPhotoOne() {
        String indiaMarsOrbiterPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\india\\marsorbiter\\1.jpg";
        File photoIndiaMarsOrbiterOneFile = new File(indiaMarsOrbiterPhotoOnePath);
        Image photoIndiaMarsOrbiterOneImage = new Image(photoIndiaMarsOrbiterOneFile.toURI().toString());
        assertNotNull(photoIndiaMarsOrbiterOneFile);
        assertNotNull(photoIndiaMarsOrbiterOneImage);
    }
    @Test
    public void testIndiaMarsOrbiterPhotoTwo() {
        String indiaMarsOrbiterPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\india\\marsorbiter\\2.jpg";
        File photoIndiaMarsOrbiterTwoFile = new File(indiaMarsOrbiterPhotoTwoPath);
        Image photoIndiaMarsOrbiterTwoImage = new Image(photoIndiaMarsOrbiterTwoFile.toURI().toString());
        assertNotNull(photoIndiaMarsOrbiterTwoFile);
        assertNotNull(photoIndiaMarsOrbiterTwoImage);
    }
    @Test
    public void testIndiaMarsOrbiterPhotoThree() {
        String indiaMarsOrbiterPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\india\\marsorbiter\\3.jpg";
        File photoIndiaMarsOrbiterThreeFile = new File(indiaMarsOrbiterPhotoThreePath);
        Image photoIndiaMarsOrbiterThreeImage = new Image(photoIndiaMarsOrbiterThreeFile.toURI().toString());
        assertNotNull(photoIndiaMarsOrbiterThreeFile);
        assertNotNull(photoIndiaMarsOrbiterThreeImage);
    }
    @Test
    public void testIndiaChandrayaan3PhotoOne() {
        String indiaChandrayaan3PhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\india\\chandrayaan3\\1.jpg";
        File photoIndiaChandrayaan3OneFile = new File(indiaChandrayaan3PhotoOnePath);
        Image photoIndiaChandrayaan3OneImage = new Image(photoIndiaChandrayaan3OneFile.toURI().toString());
        assertNotNull(photoIndiaChandrayaan3OneFile);
        assertNotNull(photoIndiaChandrayaan3OneImage);
    }
    @Test
    public void testIndiaChandrayaan3PhotoTwo() {
        String indiaChandrayaan3PhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\india\\chandrayaan3\\2.jpg";
        File photoIndiaChandrayaan3TwoFile = new File(indiaChandrayaan3PhotoTwoPath);
        Image photoIndiaChandrayaan3TwoImage = new Image(photoIndiaChandrayaan3TwoFile.toURI().toString());
        assertNotNull(photoIndiaChandrayaan3TwoFile);
        assertNotNull(photoIndiaChandrayaan3TwoImage);
    }
    @Test
    public void testIndiaChandrayaan3PhotoThree() {
        String indiaChandrayaan3PhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\india\\chandrayaan3\\3.jpg";
        File photoIndiaChandrayaan3ThreeFile = new File(indiaChandrayaan3PhotoThreePath);
        Image photoIndiaChandrayaan3ThreeImage = new Image(photoIndiaChandrayaan3ThreeFile.toURI().toString());
        assertNotNull(photoIndiaChandrayaan3ThreeFile);
        assertNotNull(photoIndiaChandrayaan3ThreeImage);
    }
}

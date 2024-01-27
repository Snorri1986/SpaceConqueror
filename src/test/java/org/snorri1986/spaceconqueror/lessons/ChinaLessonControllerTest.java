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
    @Test
    public void testPRJ9212PhotoOne() {
        String prj9212PhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\china\\prj9212\\1.jpg";
        File photoprj9212OneFile = new File(prj9212PhotoOnePath);
        Image photoprj9212OneImage = new Image(photoprj9212OneFile.toURI().toString());
        assertNotNull(photoprj9212OneFile);
        assertNotNull(photoprj9212OneImage);
    }
    @Test
    public void testPRJ9212PhotoTwo() {
        String prj9212PhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\china\\prj9212\\2.jpg";
        File photoprj9212TwoFile = new File(prj9212PhotoTwoPath);
        Image photoprj9212TwoImage = new Image(photoprj9212TwoFile.toURI().toString());
        assertNotNull(photoprj9212TwoFile);
        assertNotNull(photoprj9212TwoImage);
    }
    @Test
    public void testPRJ9212PhotoThree() {
        String prj9212PhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\china\\prj9212\\3.jpg";
        File photoprj9212ThreeFile = new File(prj9212PhotoThreePath);
        Image photoprj9212ThreeImage = new Image(photoprj9212ThreeFile.toURI().toString());
        assertNotNull(photoprj9212ThreeFile);
        assertNotNull(photoprj9212ThreeImage);
    }
    @Test
    public void testPRJ9213PhotoOne() {
        String prj9213PhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\china\\prj9213\\1.jpg";
        File photoprj9213OneFile = new File(prj9213PhotoOnePath);
        Image photoprj9213OneImage = new Image(photoprj9213OneFile.toURI().toString());
        assertNotNull(photoprj9213OneFile);
        assertNotNull(photoprj9213OneImage);
    }
    @Test
    public void testPRJ9213PhotoTwo() {
        String prj9213PhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\china\\prj9213\\2.jpg";
        File photoprj9213TwoFile = new File(prj9213PhotoTwoPath);
        Image photoprj9213TwoImage = new Image(photoprj9213TwoFile.toURI().toString());
        assertNotNull(photoprj9213TwoFile);
        assertNotNull(photoprj9213TwoImage);
    }
    @Test
    public void testPRJ9213PhotoThree() {
        String prj9213PhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\china\\prj9213\\3.jpg";
        File photoprj9213ThreeFile = new File(prj9213PhotoThreePath);
        Image photoprj9213ThreeImage = new Image(photoprj9213ThreeFile.toURI().toString());
        assertNotNull(photoprj9213ThreeFile);
        assertNotNull(photoprj9213ThreeImage);
    }
    @Test
    public void testLunarPhotoOne() {
        String lunarPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\china\\lunar\\1.jpg";
        File photoLunarOneFile = new File(lunarPhotoOnePath);
        Image photoLunarOneImage = new Image(photoLunarOneFile.toURI().toString());
        assertNotNull(photoLunarOneFile);
        assertNotNull(photoLunarOneImage);
    }
    @Test
    public void testLunarPhotoTwo() {
        String lunarPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\china\\lunar\\2.jpg";
        File photoLunarTwoFile = new File(lunarPhotoTwoPath);
        Image photoLunarTwoImage = new Image(photoLunarTwoFile.toURI().toString());
        assertNotNull(photoLunarTwoFile);
        assertNotNull(photoLunarTwoImage);
    }
    @Test
    public void testLunarPhotoThree() {
        String lunarPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\china\\lunar\\3.jpg";
        File photoLunarThreeFile = new File(lunarPhotoThreePath);
        Image photoLunarThreeImage = new Image(photoLunarThreeFile.toURI().toString());
        assertNotNull(photoLunarThreeFile);
        assertNotNull(photoLunarThreeImage);
    }
    @Test
    public void testInterplanetsPhotoOne() {
        String interplanetsPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\china\\Interplanets\\1.jpg";
        File photoInterplanetsOneFile = new File(interplanetsPhotoOnePath);
        Image photoInterplanetsOneImage = new Image(photoInterplanetsOneFile.toURI().toString());
        assertNotNull(photoInterplanetsOneFile);
        assertNotNull(photoInterplanetsOneImage);
    }
    @Test
    public void testInterplanetsPhotoTwo() {
        String interplanetsPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\china\\Interplanets\\2.jpg";
        File photoInterplanetsTwoFile = new File(interplanetsPhotoTwoPath);
        Image photoInterplanetsTwoImage = new Image(photoInterplanetsTwoFile.toURI().toString());
        assertNotNull(photoInterplanetsTwoFile);
        assertNotNull(photoInterplanetsTwoImage);
    }
    @Test
    public void testInterplanetsPhotoThree() {
        String interplanetsPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\china\\Interplanets\\3.jpg";
        File photoInterplanetsThreeFile = new File(interplanetsPhotoThreePath);
        Image photoInterplanetsThreeImage = new Image(photoInterplanetsThreeFile.toURI().toString());
        assertNotNull(photoInterplanetsThreeFile);
        assertNotNull(photoInterplanetsThreeImage);
    }
    @Test
    public void testOrbitalsPhotoOne() {
        String orbitalsPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\china\\Orbitals\\1.jpg";
        File photoOrbitalsOneFile = new File(orbitalsPhotoOnePath);
        Image photoOrbitalsOneImage = new Image(photoOrbitalsOneFile.toURI().toString());
        assertNotNull(photoOrbitalsOneFile);
        assertNotNull(photoOrbitalsOneImage);
    }
    @Test
    public void testOrbitalsPhotoTwo() {
        String orbitalsPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\china\\Orbitals\\2.jpg";
        File photoOrbitalsTwoFile = new File(orbitalsPhotoTwoPath);
        Image photoOrbitalsTwoImage = new Image(photoOrbitalsTwoFile.toURI().toString());
        assertNotNull(photoOrbitalsTwoFile);
        assertNotNull(photoOrbitalsTwoImage);
    }
    @Test
    public void testOrbitalsPhotoThree() {
        String orbitalsPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\china\\Orbitals\\3.jpg";
        File photoOrbitalsThreeFile = new File(orbitalsPhotoThreePath);
        Image photoOrbitalsThreeImage = new Image(photoOrbitalsThreeFile.toURI().toString());
        assertNotNull(photoOrbitalsThreeFile);
        assertNotNull(photoOrbitalsThreeImage);
    }
}

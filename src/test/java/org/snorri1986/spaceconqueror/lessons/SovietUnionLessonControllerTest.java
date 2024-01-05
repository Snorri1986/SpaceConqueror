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
    public void testVostokPhotoTwo() {
        String vostokPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\sovietunion\\vostok\\2.jpg";
        File photoVostokTwoFile = new File(vostokPhotoTwoPath);
        Image photoVostokTwoImage = new Image(photoVostokTwoFile.toURI().toString());
        assertNotNull(photoVostokTwoFile);
        assertNotNull(photoVostokTwoImage);
    }

    @Test
    public void testVostokPhotoThree() {
        String vostokPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\sovietunion\\vostok\\3.jpg";
        File photoVostokThreeFile = new File(vostokPhotoThreePath);
        Image photoVostokThreeImage = new Image(photoVostokThreeFile.toURI().toString());
        assertNotNull(photoVostokThreeFile);
        assertNotNull(photoVostokThreeImage);
    }

    @Test
    public void testVoshodPhotoOne() {
        String voshodPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\sovietunion\\voshod\\1.jpg";
        File photoVoshodOneFile = new File(voshodPhotoOnePath);
        Image photoVoshodOneImage = new Image(photoVoshodOneFile.toURI().toString());
        assertNotNull(photoVoshodOneFile);
        assertNotNull(photoVoshodOneImage);
    }

    @Test
    public void testVoshodPhotoTwo() {
        String voshodPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\sovietunion\\voshod\\2.jpg";
        File photoVoshodTwoFile = new File(voshodPhotoTwoPath);
        Image photoVoshodTwoImage = new Image(photoVoshodTwoFile.toURI().toString());
        assertNotNull(photoVoshodTwoFile);
        assertNotNull(photoVoshodTwoImage);
    }

    @Test
    public void testVoshodPhotoThree() {
        String voshodPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\sovietunion\\voshod\\3.jpg";
        File photoVoshodThreeFile = new File(voshodPhotoThreePath);
        Image photoVoshodThreeImage = new Image(photoVoshodThreeFile.toURI().toString());
        assertNotNull(photoVoshodThreeFile);
        assertNotNull(photoVoshodThreeImage);
    }

    @Test
    public void testSoyuzPhotoOne() {
        String soyuzPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\sovietunion\\soyuz\\1.jpg";
        File photoSoyuzOneFile = new File(soyuzPhotoOnePath);
        Image photoSoyuzOneImage = new Image(photoSoyuzOneFile.toURI().toString());
        assertNotNull(photoSoyuzOneFile);
        assertNotNull(photoSoyuzOneImage);
    }

    @Test
    public void testSoyuzPhotoTwo() {
        String soyuzPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\sovietunion\\soyuz\\2.jpg";
        File photoSoyuzTwoFile = new File(soyuzPhotoTwoPath);
        Image photoSoyuzTwoImage = new Image(photoSoyuzTwoFile.toURI().toString());
        assertNotNull(photoSoyuzTwoFile);
        assertNotNull(photoSoyuzTwoImage);
    }

    @Test
    public void testSoyuzPhotoThree() {
        String soyuzPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\sovietunion\\soyuz\\3.jpg";
        File photoSoyuzThreeFile = new File(soyuzPhotoThreePath);
        Image photoSoyuzThreeImage = new Image(photoSoyuzThreeFile.toURI().toString());
        assertNotNull(photoSoyuzThreeFile);
        assertNotNull(photoSoyuzThreeImage);
    }

    @Test
    public void testMirPhotoOne() {
        String mirPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\sovietunion\\mir\\1.jpg";
        File photoMirOneFile = new File(mirPhotoOnePath);
        Image photoMirOneImage = new Image(photoMirOneFile.toURI().toString());
        assertNotNull(photoMirOneFile);
        assertNotNull(photoMirOneImage);
    }

    @Test
    public void testMirPhotoTwo() {
        String mirPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\sovietunion\\mir\\2.jpg";
        File photoMirTwoFile = new File(mirPhotoTwoPath);
        Image photoMirTwoImage = new Image(photoMirTwoFile.toURI().toString());
        assertNotNull(photoMirTwoFile);
        assertNotNull(photoMirTwoImage);
    }

    @Test
    public void testMirPhotoThree() {
        String mirPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\sovietunion\\mir\\3.jpg";
        File photoMirThreeFile = new File(mirPhotoThreePath);
        Image photoMirThreeImage = new Image(photoMirThreeFile.toURI().toString());
        assertNotNull(photoMirThreeFile);
        assertNotNull(photoMirThreeImage);
    }

    @Test
    public void testBuranPhotoOne() {
        String buranPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\sovietunion\\buran\\1.jpg";
        File photoBuranOneFile = new File(buranPhotoOnePath);
        Image photoBuranOneImage = new Image(photoBuranOneFile.toURI().toString());
        assertNotNull(photoBuranOneFile);
        assertNotNull(photoBuranOneImage);
    }

    @Test
    public void testBuranPhotoTwo() {
        String buranPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\sovietunion\\buran\\2.jpg";
        File photoBuranTwoFile = new File(buranPhotoTwoPath);
        Image photoBuranTwoImage = new Image(photoBuranTwoFile.toURI().toString());
        assertNotNull(photoBuranTwoFile);
        assertNotNull(photoBuranTwoImage);
    }

    @Test
    public void testBuranPhotoThree() {
        String buranPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\sovietunion\\buran\\3.jpg";
        File photoBuranThreeFile = new File(buranPhotoThreePath);
        Image photoBuranThreeImage = new Image(photoBuranThreeFile.toURI().toString());
        assertNotNull(photoBuranThreeFile);
        assertNotNull(photoBuranThreeImage);
    }
    @Test
    public void testLunaPhotoOne() {
        String lunaPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\sovietunion\\luna\\1.jpg";
        File photoLunaOneFile = new File(lunaPhotoOnePath);
        Image photoLunaOneImage = new Image(photoLunaOneFile.toURI().toString());
        assertNotNull(photoLunaOneFile);
        assertNotNull(photoLunaOneImage);
    }

    @Test
    public void testLunaPhotoTwo() {
        String lunaPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\sovietunion\\luna\\2.jpg";
        File photoLunaTwoFile = new File(lunaPhotoTwoPath);
        Image photoLunaTwoImage = new Image(photoLunaTwoFile.toURI().toString());
        assertNotNull(photoLunaTwoFile);
        assertNotNull(photoLunaTwoImage);
    }

    @Test
    public void testLunaPhotoThree() {
        String lunaPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\sovietunion\\luna\\3.jpg";
        File lunaBuranThreeFile = new File(lunaPhotoThreePath);
        Image lunaBuranThreeImage = new Image(lunaBuranThreeFile.toURI().toString());
        assertNotNull(lunaBuranThreeFile);
        assertNotNull(lunaBuranThreeImage);
    }
}

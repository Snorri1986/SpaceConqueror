package org.snorri1986.spaceconqueror.lessons;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.apache.log4j.Logger;



import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;


public class SolarSystemLessonController implements Initializable {

    private static final Logger LOG = Logger.getLogger(SolarSystemLessonController.class.getName());

    FileChooser fileChooserUA = new FileChooser();
    FileChooser fileChooserEN = new FileChooser();
    FileChooser fileChooserDK = new FileChooser();

    @FXML
    TextArea lessonTxt;

    @FXML
    Button btnClose;

    @FXML
    ImageView photoSpace;

    @FXML
    protected void onBtnLocalUaClick() throws FileNotFoundException {
        lessonTxt.clear();
        File file = fileChooserUA.showOpenDialog(new Stage());
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()) {
            lessonTxt.appendText(scanner.nextLine() + "\n");
        }
    }

    @FXML
    protected void onBtnLocalEnClick() throws FileNotFoundException {
        lessonTxt.clear();
        File file = fileChooserEN.showOpenDialog(new Stage());
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()) {
            lessonTxt.appendText(scanner.nextLine() + "\n");
        }
    }

    @FXML
    protected void onBtnLocalDkClick() throws FileNotFoundException {
        lessonTxt.clear();
        File file = fileChooserDK.showOpenDialog(new Stage());
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()) {
            lessonTxt.appendText(scanner.nextLine() + "\n");
        }
    }

    //TODO: add unit test
    @FXML
    protected void closeStage() {
        Stage stage = (Stage) btnClose.getScene().getWindow();
        stage.close();
    }

    public void initialize(URL url, ResourceBundle resourceBundle) {
        fileChooserEN.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\solarsystem\\en"));
        fileChooserUA.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\solarsystem\\ua"));
        fileChooserDK.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\solarsystem\\dk"));
    }

    @FXML
    protected void showPhotoOne() {
        Stage stage = (Stage) btnClose.getScene().getWindow();
        String title = stage.getTitle();
        switch(title) {
            case "Mercury": {
                String mercuryPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\solarsystem\\mercury\\1.jpg";
                File photoMercuryOneFile = new File(mercuryPhotoOnePath);
                Image photoMercuryOneImage = new Image(photoMercuryOneFile.toURI().toString());
                photoSpace.setImage(photoMercuryOneImage);
                break;
            }
            case "Venus": {
                String venusPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\solarsystem\\venus\\1.jpg";
                File photoVenusOneFile = new File(venusPhotoOnePath);
                Image photoVenusOneImage = new Image(photoVenusOneFile.toURI().toString());
                photoSpace.setImage(photoVenusOneImage);
                break;
            }
            case "Earth": {
                String earthPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\solarsystem\\earth\\1.jpg";
                File photoEarthOneFile = new File(earthPhotoOnePath);
                Image photoEarthOneImage = new Image(photoEarthOneFile.toURI().toString());
                photoSpace.setImage(photoEarthOneImage);
                break;
            }
            case "Mars": {
                String marsPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\solarsystem\\mars\\1.jpg";
                File photoMarsOneFile = new File(marsPhotoOnePath);
                Image photoMarsOneImage = new Image(photoMarsOneFile.toURI().toString());
                photoSpace.setImage(photoMarsOneImage);
                break;
            }
            case "Jupiter": {
                String jupiterPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\solarsystem\\jupiter\\1.jpg";
                File photoJupiterOneFile = new File(jupiterPhotoOnePath);
                Image photoJupiterOneImage = new Image(photoJupiterOneFile.toURI().toString());
                photoSpace.setImage(photoJupiterOneImage);
                break;
            }
            case "Saturn": {
                String saturnPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\solarsystem\\saturn\\1.jpg";
                File photoSaturnOneFile = new File(saturnPhotoOnePath);
                Image photoSaturnOneImage = new Image(photoSaturnOneFile.toURI().toString());
                photoSpace.setImage(photoSaturnOneImage);
                break;
            }
            default: {
                System.out.println("No photo");
            }
        }
    }

    @FXML
    protected void showPhotoTwo() {
        Stage stage = (Stage) btnClose.getScene().getWindow();
        String title = stage.getTitle();
        switch(title) {
            case "Mercury": {
                String mercuryPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\solarsystem\\mercury\\2.jpg";
                File photoMercuryTwoFile = new File(mercuryPhotoTwoPath);
                Image photoMercuryTwoImage = new Image(photoMercuryTwoFile.toURI().toString());
                photoSpace.setImage(photoMercuryTwoImage);
                break;
            }
            case "Venus": {
                String venusPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\solarsystem\\venus\\2.jpg";
                File photoVenusTwoFile = new File(venusPhotoTwoPath);
                Image photoVenusTwoImage = new Image(photoVenusTwoFile.toURI().toString());
                photoSpace.setImage(photoVenusTwoImage);
                break;
            }
            case "Earth": {
                String earthPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\solarsystem\\earth\\2.jpg";
                File photoEarthTwoFile = new File(earthPhotoTwoPath);
                Image photoEarthTwoImage = new Image(photoEarthTwoFile.toURI().toString());
                photoSpace.setImage(photoEarthTwoImage);
                break;
            }
            case "Mars": {
                String marsPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\solarsystem\\mars\\2.jpg";
                File photoMarsTwoFile = new File(marsPhotoTwoPath);
                Image photoMarsTwoImage = new Image(photoMarsTwoFile.toURI().toString());
                photoSpace.setImage(photoMarsTwoImage);
                break;
            }
            case "Jupiter": {
                String jupiterPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\solarsystem\\jupiter\\2.jpg";
                File photoJupiterTwoFile = new File(jupiterPhotoTwoPath);
                Image photoJupiterTwoImage = new Image(photoJupiterTwoFile.toURI().toString());
                photoSpace.setImage(photoJupiterTwoImage);
                break;
            }
            case "Saturn": {
                String saturnPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\solarsystem\\saturn\\2.jpg";
                File photoSaturnTwoFile = new File(saturnPhotoTwoPath);
                Image photoSaturnTwoImage = new Image(photoSaturnTwoFile.toURI().toString());
                photoSpace.setImage(photoSaturnTwoImage);
                break;
            }
            default: {
                System.out.println("No photo");
            }
        }
    }

    @FXML
    protected void showPhotoThree() {
        Stage stage = (Stage) btnClose.getScene().getWindow();
        String title = stage.getTitle();
        switch(title) {
            case "Mercury" : {
                String mercuryPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\solarsystem\\mercury\\3.jpg";
                File photoMercuryThreeFile = new File(mercuryPhotoThreePath);
                Image photoMercuryThreeImage = new Image(photoMercuryThreeFile.toURI().toString());
                photoSpace.setImage(photoMercuryThreeImage);
                break;
            }
            case "Venus": {
                String venusPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\solarsystem\\venus\\3.jpg";
                File photoVenusThreeFile = new File(venusPhotoThreePath);
                Image photoVenusThreeImage = new Image(photoVenusThreeFile.toURI().toString());
                photoSpace.setImage(photoVenusThreeImage);
                break;
            }
            case "Earth": {
                String earthPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\solarsystem\\earth\\3.jpg";
                File photoEarthThreeFile = new File(earthPhotoThreePath);
                Image photoEarthThreeImage = new Image(photoEarthThreeFile.toURI().toString());
                photoSpace.setImage(photoEarthThreeImage);
                break;
            }
            case "Mars": {
                String marsPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\solarsystem\\mars\\3.jpg";
                File photoMarsThreeFile = new File(marsPhotoThreePath);
                Image photoMarsThreeImage = new Image(photoMarsThreeFile.toURI().toString());
                photoSpace.setImage(photoMarsThreeImage);
                break;
            }
            case "Jupiter": {
                String jupiterPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\solarsystem\\jupiter\\3.jpg";
                File photoJupiterThreeFile = new File(jupiterPhotoThreePath);
                Image photoJupiterThreeImage = new Image(photoJupiterThreeFile.toURI().toString());
                photoSpace.setImage(photoJupiterThreeImage);
                break;
            }
            case "Saturn": {
                String saturnPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\solarsystem\\saturn\\3.jpg";
                File photoSaturnThreeFile = new File(saturnPhotoThreePath);
                Image photoSaturnThreeImage = new Image(photoSaturnThreeFile.toURI().toString());
                photoSpace.setImage(photoSaturnThreeImage);
                break;
            }
            default: {
                System.out.println("No photo");
            }
        }
    }
}

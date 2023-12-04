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
            default: {
                System.out.println("No photo");
            }
        }
    }
}

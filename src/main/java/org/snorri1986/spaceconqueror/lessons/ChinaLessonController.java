package org.snorri1986.spaceconqueror.lessons;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ChinaLessonController implements Initializable  {
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
        fileChooserEN.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\china\\en"));
        fileChooserUA.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\china\\ua"));
        fileChooserDK.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\china\\dk"));
    }

    @FXML
    protected void showPhotoOne() {
        Stage stage = (Stage) btnClose.getScene().getWindow();
        String title = stage.getTitle();
        switch(title) {
            case "PRJ9211": {
                String prj9211PhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\china\\prj9211\\1.jpg";
                File photoPrj9211OneFile = new File(prj9211PhotoOnePath);
                Image photoPrj9211OneImage = new Image(photoPrj9211OneFile.toURI().toString());
                photoSpace.setImage(photoPrj9211OneImage);
                break;
            }
            case "PRJ9212": {
                String prj9212PhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\china\\prj9212\\1.jpg";
                File photoPrj9212OneFile = new File(prj9212PhotoOnePath);
                Image photoPrj9212OneImage = new Image(photoPrj9212OneFile.toURI().toString());
                photoSpace.setImage(photoPrj9212OneImage);
                break;
            }
            case "PRJ9213": {
                String prj9213PhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\china\\prj9213\\1.jpg";
                File photoPrj9213OneFile = new File(prj9213PhotoOnePath);
                Image photoPrj9213OneImage = new Image(photoPrj9213OneFile.toURI().toString());
                photoSpace.setImage(photoPrj9213OneImage);
                break;
            }
            case "Lunar": {
                String lunarPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\china\\lunar\\1.jpg";
                File photoLunarOneFile = new File(lunarPhotoOnePath);
                Image photoLunarOneImage = new Image(photoLunarOneFile.toURI().toString());
                photoSpace.setImage(photoLunarOneImage);
                break;
            }
            case "Interplanets": {
                String interplanetsPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\china\\Interplanets\\1.jpg";
                File photoInterplanetsOneFile = new File(interplanetsPhotoOnePath);
                Image photoInterplanetsOneImage = new Image(photoInterplanetsOneFile.toURI().toString());
                photoSpace.setImage(photoInterplanetsOneImage);
                break;
            }
        }
    }

    @FXML
    protected void showPhotoTwo() {
        Stage stage = (Stage) btnClose.getScene().getWindow();
        String title = stage.getTitle();
        switch(title) {
            case "PRJ9211": {
                String prj9211PhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\china\\prj9211\\2.jpg";
                File photoPrj9211TwoFile = new File(prj9211PhotoTwoPath);
                Image photoPrj9211TwoImage = new Image(photoPrj9211TwoFile.toURI().toString());
                photoSpace.setImage(photoPrj9211TwoImage);
                break;
            }
            case "PRJ9212": {
                String prj9212PhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\china\\prj9212\\2.jpg";
                File photoPrj9212TwoFile = new File(prj9212PhotoTwoPath);
                Image photoPrj9212TwoImage = new Image(photoPrj9212TwoFile.toURI().toString());
                photoSpace.setImage(photoPrj9212TwoImage);
                break;
            }
            case "PRJ9213": {
                String prj9213PhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\china\\prj9213\\2.jpg";
                File photoPrj9213TwoFile = new File(prj9213PhotoTwoPath);
                Image photoPrj9213TwoImage = new Image(photoPrj9213TwoFile.toURI().toString());
                photoSpace.setImage(photoPrj9213TwoImage);
                break;
            }
            case "Lunar": {
                String lunarPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\china\\lunar\\2.jpg";
                File photoLunarTwoFile = new File(lunarPhotoTwoPath);
                Image photoLunarTwoImage = new Image(photoLunarTwoFile.toURI().toString());
                photoSpace.setImage(photoLunarTwoImage);
                break;
            }
            case "Interplanets": {
                String interplanetsPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\china\\Interplanets\\2.jpg";
                File photoInterplanetsTwoFile = new File(interplanetsPhotoTwoPath);
                Image photoInterplanetsTwoImage = new Image(photoInterplanetsTwoFile.toURI().toString());
                photoSpace.setImage(photoInterplanetsTwoImage);
                break;
            }
        }
    }

    @FXML
    protected void showPhotoThree() {
        Stage stage = (Stage) btnClose.getScene().getWindow();
        String title = stage.getTitle();
        switch(title) {
            case "PRJ9211": {
                String prj9211PhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\china\\prj9211\\3.jpg";
                File photoPrj9211ThreeFile = new File(prj9211PhotoThreePath);
                Image photoPrj9211ThreeImage = new Image(photoPrj9211ThreeFile.toURI().toString());
                photoSpace.setImage(photoPrj9211ThreeImage);
                break;
            }
            case "PRJ9212": {
                String prj9212PhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\china\\prj9212\\3.jpg";
                File photoPrj9212ThreeFile = new File(prj9212PhotoThreePath);
                Image photoPrj9212ThreeImage = new Image(photoPrj9212ThreeFile.toURI().toString());
                photoSpace.setImage(photoPrj9212ThreeImage);
                break;
            }
            case "PRJ9213": {
                String prj9213PhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\china\\prj9213\\3.jpg";
                File photoPrj9213ThreeFile = new File(prj9213PhotoThreePath);
                Image photoPrj9213ThreeImage = new Image(photoPrj9213ThreeFile.toURI().toString());
                photoSpace.setImage(photoPrj9213ThreeImage);
                break;
            }
            case "Lunar": {
                String lunarPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\china\\lunar\\3.jpg";
                File photoLunarThreeFile = new File(lunarPhotoThreePath);
                Image photoLunarThreeImage = new Image(photoLunarThreeFile.toURI().toString());
                photoSpace.setImage(photoLunarThreeImage);
                break;
            }
            case "Interplanets": {
                String interplanetsPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\china\\Interplanets\\3.jpg";
                File photoInterplanetsThreeFile = new File(interplanetsPhotoThreePath);
                Image photoInterplanetsThreeImage = new Image(photoInterplanetsThreeFile.toURI().toString());
                photoSpace.setImage(photoInterplanetsThreeImage);
                break;
            }
        }
    }
}

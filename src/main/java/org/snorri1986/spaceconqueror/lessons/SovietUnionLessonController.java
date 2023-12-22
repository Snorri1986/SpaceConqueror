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

public class SovietUnionLessonController implements Initializable  {
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
        fileChooserEN.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\sovietunion\\en"));
        fileChooserUA.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\sovietunion\\ua"));
        fileChooserDK.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\sovietunion\\dk"));
    }
    @FXML
    protected void showPhotoOne() {
        Stage stage = (Stage) btnClose.getScene().getWindow();
        String title = stage.getTitle();
        switch(title) {
            case "Vostok": {
                String vostokPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\sovietunion\\vostok\\1.jpg";
                File photoVostokOneFile = new File(vostokPhotoOnePath);
                Image photoVostokOneImage = new Image(photoVostokOneFile.toURI().toString());
                photoSpace.setImage(photoVostokOneImage);
                break;
            }
            case "Voshod": {
                String voshodPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\sovietunion\\voshod\\1.jpg";
                File photoVoshodOneFile = new File(voshodPhotoOnePath);
                Image photoVoshodOneImage = new Image(photoVoshodOneFile.toURI().toString());
                photoSpace.setImage(photoVoshodOneImage);
                break;
            }
            case "Soyuz": {
                String soyuzPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\sovietunion\\soyuz\\1.jpg";
                File photoSoyuzOneFile = new File(soyuzPhotoOnePath);
                Image photoSoyuzOneImage = new Image(photoSoyuzOneFile.toURI().toString());
                photoSpace.setImage(photoSoyuzOneImage);
                break;
            }
        }
    }
    @FXML
    protected void showPhotoTwo() {
        Stage stage = (Stage) btnClose.getScene().getWindow();
        String title = stage.getTitle();
        switch(title) {
            case "Vostok": {
                String vostokPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\sovietunion\\vostok\\2.jpg";
                File photoVostokTwoFile = new File(vostokPhotoTwoPath);
                Image photoVostokTwoImage = new Image(photoVostokTwoFile.toURI().toString());
                photoSpace.setImage(photoVostokTwoImage);
                break;
            }
            case "Voshod": {
                String voshodPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\sovietunion\\voshod\\2.jpg";
                File photoVoshodTwoFile = new File(voshodPhotoTwoPath);
                Image photoVostokTwoImage = new Image(photoVoshodTwoFile.toURI().toString());
                photoSpace.setImage(photoVostokTwoImage);
                break;
            }
            case "Soyuz": {
                String soyuzPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\sovietunion\\soyuz\\2.jpg";
                File photoSoyuzTwoFile = new File(soyuzPhotoTwoPath);
                Image photoSoyuzTwoImage = new Image(photoSoyuzTwoFile.toURI().toString());
                photoSpace.setImage(photoSoyuzTwoImage);
                break;
            }
        }
    }
    @FXML
    protected void showPhotoThree() {
        Stage stage = (Stage) btnClose.getScene().getWindow();
        String title = stage.getTitle();
        switch(title) {
            case "Vostok": {
                String vostokPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\sovietunion\\vostok\\3.jpg";
                File photoVostokThreeFile = new File(vostokPhotoThreePath);
                Image photoVostokThreeImage = new Image(photoVostokThreeFile.toURI().toString());
                photoSpace.setImage(photoVostokThreeImage);
                break;
            }
            case "Voshod": {
                String voshodPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\sovietunion\\voshod\\3.jpg";
                File photoVoshodThreeFile = new File(voshodPhotoThreePath);
                Image photoVoshodThreeImage = new Image(photoVoshodThreeFile.toURI().toString());
                photoSpace.setImage(photoVoshodThreeImage);
                break;
            }
            case "Soyuz": {
                String soyuzPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\sovietunion\\soyuz\\3.jpg";
                File photoSoyuzThreeFile = new File(soyuzPhotoThreePath);
                Image photoSoyuzThreeImage = new Image(photoSoyuzThreeFile.toURI().toString());
                photoSpace.setImage(photoSoyuzThreeImage);
                break;
            }
        }
    }
}

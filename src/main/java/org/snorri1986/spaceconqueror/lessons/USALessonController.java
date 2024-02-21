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

public class USALessonController implements Initializable  {
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
        fileChooserEN.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\usa\\en"));
        fileChooserUA.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\usa\\ua"));
        fileChooserDK.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\usa\\dk"));
    }

    @FXML
    protected void showPhotoOne() {
        Stage stage = (Stage) btnClose.getScene().getWindow();
        String title = stage.getTitle();
        switch(title) {
            case "Mercury Project": {
                String mercuryPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\mercury\\1.jpg";
                File photoMercuryOneFile = new File(mercuryPhotoOnePath);
                Image photoMercuryOneImage = new Image(photoMercuryOneFile.toURI().toString());
                photoSpace.setImage(photoMercuryOneImage);
                break;
            }
            case "Gemini Program": {
                String geminiPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\gemini\\1.jpg";
                File photoGeminiOneFile = new File(geminiPhotoOnePath);
                Image photoGeminiOneImage = new Image(photoGeminiOneFile.toURI().toString());
                photoSpace.setImage(photoGeminiOneImage);
                break;
            }
            case "Apollo Program": {
                String apolloPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\apollo\\1.jpg";
                File photoApolloOneFile = new File(apolloPhotoOnePath);
                Image photoApolloOneImage = new Image(photoApolloOneFile.toURI().toString());
                photoSpace.setImage(photoApolloOneImage);
                break;
            }
            case "Soyuz Apollo Program": {
                String soyuzApolloProgramPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\soyuz-apollo\\1.jpg";
                File photoSoyuzApolloProgramOneFile = new File(soyuzApolloProgramPhotoOnePath);
                Image photoSoyuzApolloProgramOneImage = new Image(photoSoyuzApolloProgramOneFile.toURI().toString());
                photoSpace.setImage(photoSoyuzApolloProgramOneImage);
                break;
            }
            case "ISS": {
                String issPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\iss\\1.jpg";
                File photoISSOneFile = new File(issPhotoOnePath);
                Image photoISSOneImage = new Image(photoISSOneFile.toURI().toString());
                photoSpace.setImage(photoISSOneImage);
                break;
            }


        }

    }

    @FXML
    protected void showPhotoTwo() {
        Stage stage = (Stage) btnClose.getScene().getWindow();
        String title = stage.getTitle();
        switch(title) {
            case "Mercury Project": {
                String mercuryPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\mercury\\2.jpg";
                File photoMercuryTwoFile = new File(mercuryPhotoTwoPath);
                Image photoMercuryTwoImage = new Image(photoMercuryTwoFile.toURI().toString());
                photoSpace.setImage(photoMercuryTwoImage);
                break;
            }
            case "Gemini Program": {
                String geminiPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\gemini\\2.jpg";
                File photoGeminiTwoFile = new File(geminiPhotoTwoPath);
                Image photoGeminiTwoImage = new Image(photoGeminiTwoFile.toURI().toString());
                photoSpace.setImage(photoGeminiTwoImage);
                break;
            }
            case "Apollo Program": {
                String apolloPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\apollo\\2.jpg";
                File photoApolloTwoFile = new File(apolloPhotoTwoPath);
                Image photoApolloTwoImage = new Image(photoApolloTwoFile.toURI().toString());
                photoSpace.setImage(photoApolloTwoImage);
                break;
            }
            case "Soyuz Apollo Program": {
                String soyuzApolloProgramPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\soyuz-apollo\\2.jpg";
                File photoSoyuzApolloProgramTwoFile = new File(soyuzApolloProgramPhotoTwoPath);
                Image photoSoyuzApolloProgramTwoImage = new Image(photoSoyuzApolloProgramTwoFile.toURI().toString());
                photoSpace.setImage(photoSoyuzApolloProgramTwoImage);
                break;
            }
            case "ISS": {
                String issPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\iss\\2.jpg";
                File photoISSTwoFile = new File(issPhotoTwoPath);
                Image photoISSTwoImage = new Image(photoISSTwoFile.toURI().toString());
                photoSpace.setImage(photoISSTwoImage);
                break;
            }

        }

    }

    @FXML
    protected void showPhotoThree() {
        Stage stage = (Stage) btnClose.getScene().getWindow();
        String title = stage.getTitle();
        switch(title) {
            case "Mercury Project": {
                String mercuryPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\mercury\\3.jpg";
                File photoMercuryThreeFile = new File(mercuryPhotoThreePath);
                Image photoMercuryThreeImage = new Image(photoMercuryThreeFile.toURI().toString());
                photoSpace.setImage(photoMercuryThreeImage);
                break;
            }
            case "Gemini Program": {
                String geminiPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\gemini\\3.jpg";
                File photoGeminiThreeFile = new File(geminiPhotoThreePath);
                Image photoGeminiThreeImage = new Image(photoGeminiThreeFile.toURI().toString());
                photoSpace.setImage(photoGeminiThreeImage);
                break;
            }
            case "Apollo Program": {
                String apolloPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\apollo\\3.jpg";
                File photoApolloThreeFile = new File(apolloPhotoThreePath);
                Image photoApolloThreeImage = new Image(photoApolloThreeFile.toURI().toString());
                photoSpace.setImage(photoApolloThreeImage);
                break;
            }
            case "Soyuz Apollo Program": {
                String soyuzApolloProgramPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\soyuz-apollo\\3.jpg";
                File photoSoyuzApolloProgramThreeFile = new File(soyuzApolloProgramPhotoThreePath);
                Image photoSoyuzApolloProgramThreeImage = new Image(photoSoyuzApolloProgramThreeFile.toURI().toString());
                photoSpace.setImage(photoSoyuzApolloProgramThreeImage);
                break;
            }
            case "ISS": {
                String issPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\iss\\3.jpg";
                File photoISSThreeFile = new File(issPhotoThreePath);
                Image photoISSThreeImage = new Image(photoISSThreeFile.toURI().toString());
                photoSpace.setImage(photoISSThreeImage);
                break;
            }

        }

    }
}

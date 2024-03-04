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
            case "Space Shuttle Program": {
                String spaceShuttleProgramPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\space_shuttle\\1.jpg";
                File spaceShuttleProgramOneFile = new File(spaceShuttleProgramPhotoOnePath);
                Image photoSpaceShuttleProgramOneImage = new Image(spaceShuttleProgramOneFile.toURI().toString());
                photoSpace.setImage(photoSpaceShuttleProgramOneImage);
                break;
            }
            case "USA Cosmodroms": {
                String usaCosmodromsProgramPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\cosmodroms\\1.jpg";
                File usaCosmodromsProgramOneFile = new File(usaCosmodromsProgramPhotoOnePath);
                Image photoUsaCosmodromsProgramOneImage = new Image(usaCosmodromsProgramOneFile.toURI().toString());
                photoSpace.setImage(photoUsaCosmodromsProgramOneImage);
                break;
            }
            case "USA Peoples": {
                String usaPeoplesProgramPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\people\\1.jpg";
                File usaPeoplesProgramOneFile = new File(usaPeoplesProgramPhotoOnePath);
                Image photoUsaPeoplesProgramOneImage = new Image(usaPeoplesProgramOneFile.toURI().toString());
                photoSpace.setImage(photoUsaPeoplesProgramOneImage);
                break;
            }
            case "NASA": {
                String nasaPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\nasa\\1.jpg";
                File nasaOneFile = new File(nasaPhotoOnePath);
                Image nasaOneImage = new Image(nasaOneFile.toURI().toString());
                photoSpace.setImage(nasaOneImage);
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
            case "Space Shuttle Program": {
                String spaceShuttleProgramPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\space_shuttle\\2.jpg";
                File spaceShuttleProgramTwoFile = new File(spaceShuttleProgramPhotoTwoPath);
                Image photoSpaceShuttleProgramTwoImage = new Image(spaceShuttleProgramTwoFile.toURI().toString());
                photoSpace.setImage(photoSpaceShuttleProgramTwoImage);
                break;
            }
            case "USA Cosmodroms": {
                String usaCosmodromsProgramPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\cosmodroms\\2.jpg";
                File usaCosmodromsProgramTwoFile = new File(usaCosmodromsProgramPhotoTwoPath);
                Image photoUsaCosmodromsProgramTwoImage = new Image(usaCosmodromsProgramTwoFile.toURI().toString());
                photoSpace.setImage(photoUsaCosmodromsProgramTwoImage);
                break;
            }
            case "USA Peoples": {
                String usaPeoplesProgramPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\people\\2.jpg";
                File usaPeoplesProgramTwoFile = new File(usaPeoplesProgramPhotoTwoPath);
                Image photoUsaPeoplesProgramTwoImage = new Image(usaPeoplesProgramTwoFile.toURI().toString());
                photoSpace.setImage(photoUsaPeoplesProgramTwoImage);
                break;
            }
            case "NASA": {
                String nasaPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\nasa\\2.jpg";
                File nasaTwoFile = new File(nasaPhotoTwoPath);
                Image nasaTwoImage = new Image(nasaTwoFile.toURI().toString());
                photoSpace.setImage(nasaTwoImage);
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
            case "Space Shuttle Program": {
                String spaceShuttleProgramPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\space_shuttle\\3.jpg";
                File spaceShuttleProgramThreeFile = new File(spaceShuttleProgramPhotoThreePath);
                Image photoSpaceShuttleProgramThreeImage = new Image(spaceShuttleProgramThreeFile.toURI().toString());
                photoSpace.setImage(photoSpaceShuttleProgramThreeImage);
                break;
            }
            case "USA Cosmodroms": {
                String usaCosmodromsProgramPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\cosmodroms\\3.jpg";
                File usaCosmodromsProgramThreeFile = new File(usaCosmodromsProgramPhotoThreePath);
                Image photoUsaCosmodromsProgramThreeImage = new Image(usaCosmodromsProgramThreeFile.toURI().toString());
                photoSpace.setImage(photoUsaCosmodromsProgramThreeImage);
                break;
            }
            case "USA Peoples": {
                String usaPeoplesProgramPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\people\\3.jpg";
                File usaPeoplesProgramThreeFile = new File(usaPeoplesProgramPhotoThreePath);
                Image photoUsaPeoplesProgramThreeImage = new Image(usaPeoplesProgramThreeFile.toURI().toString());
                photoSpace.setImage(photoUsaPeoplesProgramThreeImage);
                break;
            }
            case "NASA": {
                String nasaPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\usa\\nasa\\3.jpg";
                File nasaThreeFile = new File(nasaPhotoThreePath);
                Image nasaThreeImage = new Image(nasaThreeFile.toURI().toString());
                photoSpace.setImage(nasaThreeImage);
                break;
            }
        }

    }
}

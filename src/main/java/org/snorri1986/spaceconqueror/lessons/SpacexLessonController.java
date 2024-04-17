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

public class SpacexLessonController implements Initializable  {
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
        fileChooserEN.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\spacex\\en"));
        fileChooserUA.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\spacex\\ua"));
        fileChooserDK.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\spacex\\dk"));
    }

    @FXML
    protected void showPhotoOne() {
        Stage stage = (Stage) btnClose.getScene().getWindow();
        String title = stage.getTitle();
        switch (title) {
            case "Falcon One": {
                String falconOnePhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\spacex\\falcon1\\1.jpg";
                File photoFalconOneFile = new File(falconOnePhotoOnePath);
                Image photoFalconOneImage = new Image(photoFalconOneFile.toURI().toString());
                photoSpace.setImage(photoFalconOneImage);
                break;
            }
            case "Falcon Nine": {
                String falconNinePhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\spacex\\falcon9\\1.jpg";
                File photoFalconNineFileOne = new File(falconNinePhotoOnePath);
                Image photoFalconNineImageOne = new Image(photoFalconNineFileOne.toURI().toString());
                photoSpace.setImage(photoFalconNineImageOne);
                break;
            }
            case "Dragon": {
                String dragonPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\spacex\\dragon\\1.jpg";
                File photoDragonFileOne = new File(dragonPhotoOnePath);
                Image photoDragonImageOne = new Image(photoDragonFileOne.toURI().toString());
                photoSpace.setImage(photoDragonImageOne);
                break;
            }
            case "Falcon Heavy": {
                String falconHeavyPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\spacex\\falconheavy\\1.jpg";
                File photoFalconHeavyFileOne = new File(falconHeavyPhotoOnePath);
                Image photoFalconHeavyImageOne = new Image(photoFalconHeavyFileOne.toURI().toString());
                photoSpace.setImage(photoFalconHeavyImageOne);
                break;
            }
            case "Starship": {
                String starShipPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\spacex\\starship\\1.jpg";
                File photoStarShipFileOne = new File(starShipPhotoOnePath);
                Image photoStarShipImageOne = new Image(photoStarShipFileOne.toURI().toString());
                photoSpace.setImage(photoStarShipImageOne);
                break;
            }
            case "Starlink": {
                String startLinkPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\spacex\\starlink\\1.jpg";
                File photoStarLinkFileOne = new File(startLinkPhotoOnePath);
                Image photoStarLinkImageOne = new Image(photoStarLinkFileOne.toURI().toString());
                photoSpace.setImage(photoStarLinkImageOne);
                break;
            }
        }
    }

    @FXML
    protected void showPhotoTwo() {
        Stage stage = (Stage) btnClose.getScene().getWindow();
        String title = stage.getTitle();
        switch (title) {
            case "Falcon One": {
                String falconOnePhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\spacex\\falcon1\\2.jpg";
                File photoFalconOneFileTwo = new File(falconOnePhotoTwoPath);
                Image photoFalconOneImageTwo = new Image(photoFalconOneFileTwo.toURI().toString());
                photoSpace.setImage(photoFalconOneImageTwo);
                break;
            }
            case "Falcon Nine": {
                String falconNinePhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\spacex\\falcon9\\2.jpg";
                File photoFalconNineFileTwo = new File(falconNinePhotoTwoPath);
                Image photoFalconNineImageTwo = new Image(photoFalconNineFileTwo.toURI().toString());
                photoSpace.setImage(photoFalconNineImageTwo);
                break;
            }
            case "Dragon": {
                String dragonPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\spacex\\dragon\\2.jpg";
                File photoDragonFileTwo = new File(dragonPhotoTwoPath);
                Image photoDragonImageTwo = new Image(photoDragonFileTwo.toURI().toString());
                photoSpace.setImage(photoDragonImageTwo);
                break;
            }
            case "Falcon Heavy": {
                String falconHeavyPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\spacex\\falconheavy\\2.jpg";
                File photoFalconHeavyFileTwo = new File(falconHeavyPhotoTwoPath);
                Image photoFalconHeavyImageTwo = new Image(photoFalconHeavyFileTwo.toURI().toString());
                photoSpace.setImage(photoFalconHeavyImageTwo);
                break;
            }
            case "Starship": {
                String starShipPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\spacex\\starship\\2.jpg";
                File photoStarShipFileTwo = new File(starShipPhotoTwoPath);
                Image photoStarShipImageTwo = new Image(photoStarShipFileTwo.toURI().toString());
                photoSpace.setImage(photoStarShipImageTwo);
                break;
            }
            case "Starlink": {
                String startLinkPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\spacex\\starlink\\2.jpg";
                File photoStarLinkFileTwo = new File(startLinkPhotoTwoPath);
                Image photoStarLinkImageTwo = new Image(photoStarLinkFileTwo.toURI().toString());
                photoSpace.setImage(photoStarLinkImageTwo);
                break;
            }
        }
    }

    @FXML
    protected void showPhotoThree() {
        Stage stage = (Stage) btnClose.getScene().getWindow();
        String title = stage.getTitle();
        switch (title) {
            case "Falcon One": {
                String falconOnePhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\spacex\\falcon1\\3.jpg";
                File photoFalconOneFileThree = new File(falconOnePhotoThreePath);
                Image photoFalconOneImageThree = new Image(photoFalconOneFileThree.toURI().toString());
                photoSpace.setImage(photoFalconOneImageThree);
                break;
            }
            case "Falcon Nine": {
                String falconNinePhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\spacex\\falcon9\\3.jpg";
                File photoFalconNineFileThree = new File(falconNinePhotoThreePath);
                Image photoFalconNineImageThree = new Image(photoFalconNineFileThree.toURI().toString());
                photoSpace.setImage(photoFalconNineImageThree);
                break;
            }
            case "Dragon": {
                String dragonPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\spacex\\dragon\\3.jpg";
                File photoDragonFileThree = new File(dragonPhotoThreePath);
                Image photoDragonImageThree = new Image(photoDragonFileThree.toURI().toString());
                photoSpace.setImage(photoDragonImageThree);
                break;
            }
            case "Falcon Heavy": {
                String falconHeavyPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\spacex\\falconheavy\\3.jpg";
                File photoFalconHeavyFileThree = new File(falconHeavyPhotoThreePath);
                Image photoFalconHeavyImageThree = new Image(photoFalconHeavyFileThree.toURI().toString());
                photoSpace.setImage(photoFalconHeavyImageThree);
                break;
            }
            case "Starship": {
                String starShipPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\spacex\\starship\\3.jpg";
                File photoStarShipFileThree = new File(starShipPhotoThreePath);
                Image photoStarShipImageThree = new Image(photoStarShipFileThree.toURI().toString());
                photoSpace.setImage(photoStarShipImageThree);
                break;
            }
            case "Starlink": {
                String startLinkPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\spacex\\starlink\\3.jpg";
                File photoStarLinkFileThree = new File(startLinkPhotoThreePath);
                Image photoStarLinkImageThree = new Image(photoStarLinkFileThree.toURI().toString());
                photoSpace.setImage(photoStarLinkImageThree);
                break;
            }
        }
    }
}

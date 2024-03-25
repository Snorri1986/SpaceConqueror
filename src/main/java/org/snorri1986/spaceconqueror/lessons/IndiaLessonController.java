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

public class IndiaLessonController implements Initializable  {
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
        fileChooserEN.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\india\\en"));
        fileChooserUA.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\india\\ua"));
        fileChooserDK.setInitialDirectory(new File("D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\text\\india\\dk"));
    }
    @FXML
    protected void showPhotoOne() {
        Stage stage = (Stage) btnClose.getScene().getWindow();
        String title = stage.getTitle();
        switch(title) {
            case "Satellites": {
                String satellitesPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\india\\satellites\\1.jpg";
                File photoSatellitesOneFile = new File(satellitesPhotoOnePath);
                Image photoSatellitesOneImage = new Image(photoSatellitesOneFile.toURI().toString());
                photoSpace.setImage(photoSatellitesOneImage);
                break;
            }
            case "GAGAN": {
                String gaganPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\india\\gagan\\1.jpg";
                File photoGaganOneFile = new File(gaganPhotoOnePath);
                Image photoGaganOneImage = new Image(photoGaganOneFile.toURI().toString());
                photoSpace.setImage(photoGaganOneImage);
                break;
            }
            case "IRNSS": {
                String irnssPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\india\\irnss\\1.jpg";
                File photoIrnssOneFile = new File(irnssPhotoOnePath);
                Image photoIrnssOneImage = new Image(photoIrnssOneFile.toURI().toString());
                photoSpace.setImage(photoIrnssOneImage);
                break;
            }
            case "Chandrayaan-1": {
                String chandrayaan1PhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\india\\chandrayaan1\\1.jpg";
                File photoChandrayaan1OneFile = new File(chandrayaan1PhotoOnePath);
                Image photoChandrayaan1OneImage = new Image(photoChandrayaan1OneFile.toURI().toString());
                photoSpace.setImage(photoChandrayaan1OneImage);
                break;
            }
            case "Mars Orbiter": {
                String marsOrbiterPhotoOnePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\india\\marsorbiter\\1.jpg";
                File photoMarsOrbiterOneFile = new File(marsOrbiterPhotoOnePath);
                Image photoMarsOrbiterOneImage = new Image(photoMarsOrbiterOneFile.toURI().toString());
                photoSpace.setImage(photoMarsOrbiterOneImage);
                break;
            }
        }
    }
    @FXML
    protected void showPhotoTwo() {
        Stage stage = (Stage) btnClose.getScene().getWindow();
        String title = stage.getTitle();
        switch(title) {
            case "Satellites": {
                String satellitesPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\india\\satellites\\2.jpg";
                File photoSatellitesTwoFile = new File(satellitesPhotoTwoPath);
                Image photoSatellitesTwoImage = new Image(photoSatellitesTwoFile.toURI().toString());
                photoSpace.setImage(photoSatellitesTwoImage);
                break;
            }
            case "GAGAN": {
                String gaganPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\india\\gagan\\2.jpg";
                File photoGaganTwoFile = new File(gaganPhotoTwoPath);
                Image photoGaganTwoImage = new Image(photoGaganTwoFile.toURI().toString());
                photoSpace.setImage(photoGaganTwoImage);
                break;
            }
            case "IRNSS": {
                String irnssPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\india\\irnss\\2.jpg";
                File photoIrnssTwoFile = new File(irnssPhotoTwoPath);
                Image photoIrnssTwoImage = new Image(photoIrnssTwoFile.toURI().toString());
                photoSpace.setImage(photoIrnssTwoImage);
                break;
            }
            case "Chandrayaan-1": {
                String chandrayaan1PhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\india\\chandrayaan1\\2.jpg";
                File photoChandrayaan1TwoFile = new File(chandrayaan1PhotoTwoPath);
                Image photoChandrayaan1TwoImage = new Image(photoChandrayaan1TwoFile.toURI().toString());
                photoSpace.setImage(photoChandrayaan1TwoImage);
                break;
            }
            case "Mars Orbiter": {
                String marsOrbiterPhotoTwoPath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\india\\marsorbiter\\2.jpg";
                File photoMarsOrbiterTwoFile = new File(marsOrbiterPhotoTwoPath);
                Image photoMarsOrbiterTwoImage = new Image(photoMarsOrbiterTwoFile.toURI().toString());
                photoSpace.setImage(photoMarsOrbiterTwoImage);
                break;
            }
        }
    }
    @FXML
    protected void showPhotoThree() {
        Stage stage = (Stage) btnClose.getScene().getWindow();
        String title = stage.getTitle();
        switch(title) {
            case "Satellites": {
                String satellitesPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\india\\satellites\\3.jpg";
                File photoSatellitesThreeFile = new File(satellitesPhotoThreePath);
                Image photoSatellitesThreeImage = new Image(photoSatellitesThreeFile.toURI().toString());
                photoSpace.setImage(photoSatellitesThreeImage);
                break;
            }
            case "GAGAN": {
                String gaganPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\india\\gagan\\3.jpg";
                File photoGaganThreeFile = new File(gaganPhotoThreePath);
                Image photoGaganThreeImage = new Image(photoGaganThreeFile.toURI().toString());
                photoSpace.setImage(photoGaganThreeImage);
                break;
            }
            case "IRNSS": {
                String irnssPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\india\\irnss\\3.jpg";
                File photoIrnssThreeFile = new File(irnssPhotoThreePath);
                Image photoIrnssThreeImage = new Image(photoIrnssThreeFile.toURI().toString());
                photoSpace.setImage(photoIrnssThreeImage);
                break;
            }
            case "Chandrayaan-1": {
                String chandrayaan1PhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\india\\chandrayaan1\\3.jpg";
                File photoChandrayaan1ThreeFile = new File(chandrayaan1PhotoThreePath);
                Image photoChandrayaan1ThreeImage = new Image(photoChandrayaan1ThreeFile.toURI().toString());
                photoSpace.setImage(photoChandrayaan1ThreeImage);
                break;
            }
            case "Mars Orbiter": {
                String marsOrbiterPhotoThreePath = "D:\\Applications\\SpaceConqueror\\src\\main\\resources\\org\\snorri1986\\spaceconqueror\\content\\photos\\india\\marsorbiter\\3.jpg";
                File photoMarsOrbiterThreeFile = new File(marsOrbiterPhotoThreePath);
                Image photoMarsOrbiterThreeImage = new Image(photoMarsOrbiterThreeFile.toURI().toString());
                photoSpace.setImage(photoMarsOrbiterThreeImage);
                break;
            }
        }
    }
}

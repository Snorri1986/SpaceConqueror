package org.snorri1986.spaceconqueror.lessons;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.io.*;
import java.net.URISyntaxException;
import java.util.Objects;


public class MercuryLectionController {

    @FXML
    VBox mercuryLection;

    @FXML
    Button btnLocalEn;

    @FXML
    protected void onBtnLocalEnClick() throws URISyntaxException {
        String lessonText = Objects.requireNonNull(getClass().getResourceAsStream("src/main/resources/org/snorri1986/spaceconqueror/content/text/en/mercury_en.txt")).toString();
        Label textLabel = new Label(lessonText);
        mercuryLection.getChildren().add(textLabel);
    }

}

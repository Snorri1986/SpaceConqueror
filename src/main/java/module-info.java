module org.snorri1986.spaceconqueror {
    requires javafx.controls;
    requires javafx.fxml;
    requires log4j;


    opens org.snorri1986.spaceconqueror to javafx.fxml;
    opens org.snorri1986.spaceconqueror.buttons to javafx.fxml;
    exports org.snorri1986.spaceconqueror;
    exports org.snorri1986.spaceconqueror.buttons;
}
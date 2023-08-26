module org.snorri1986.spaceconqueror {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.snorri1986.spaceconqueror to javafx.fxml;
    exports org.snorri1986.spaceconqueror;
}
module org.snorri1986.spaceconqueror {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.slf4j;


    opens org.snorri1986.spaceconqueror to javafx.fxml;
    exports org.snorri1986.spaceconqueror;
    exports org.snorri1986.spaceconqueror.buttons;
}
module com.algotube.algotube {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.algotube.gui to javafx.fxml;
    exports com.algotube.gui;
}

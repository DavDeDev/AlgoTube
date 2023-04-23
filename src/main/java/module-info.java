module com.algotube.algotube {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.algotube.gui to javafx.fxml;
    exports com.algotube.controllers;
    opens com.algotube.controllers to javafx.fxml;
    exports com.algotube;
    opens com.algotube to javafx.fxml;
}

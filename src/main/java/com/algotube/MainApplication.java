package com.algotube;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

/**
 * @author : David
 * @mailto : pietrocoladavid@gmail.com
 * @created : 4/22/2023, Saturday
 * <p>
 * Description : *****
 **/
public class MainApplication extends Application {

    // Create a HashMap to store the pages
    static public HashMap<String, AnchorPane> pages = new HashMap<>();

    // Set the directory path where the FXML files are located
    String directoryPath = "src/main/resources/com/algotube/gui/tabs";

    // Get a list of all the FXML files in the directory
    File directory = new File(directoryPath);
    File[] fxmlFiles = directory.listFiles((dir, name) -> name.endsWith(".fxml"));

    // Store the root
    static AnchorPane root;


    @Override
    public void start(Stage stage) throws IOException {
        for (File file : fxmlFiles) {
            System.out.println(file.getName());
            try {
                AnchorPane page = FXMLLoader.load(file.toURI().toURL());
                pages.put(file.getName(), page);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        root =FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/algotube/gui/root.fxml")));
        root.getChildren().add(pages.get("menu-view.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("AlgoTube");
        stage.setScene(scene);

        stage.show();


    }

    public void menu_pane() {
        root.getChildren().clear();
        root.getChildren().add(pages.get("menu-view.fxml"));
    }

    public static void change_pane(String fxml) {
        root.getChildren().clear();
        root.getChildren().add(pages.get(fxml));
        Stage stage = (Stage) root.getScene().getWindow();
        stage.setTitle("New Title"); // change the title here
    }

    public static void main(String[] args) {
        launch(args);
    }
}

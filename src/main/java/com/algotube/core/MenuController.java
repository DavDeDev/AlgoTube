package com.algotube.core;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

/**
 * @author : David
 * @mailto : pietrocoladavid@gmail.com
 * @created : 4/22/2023, Saturday
 * <p>
 * Description : *****
 **/
public class MenuController {
    public Button sortBtn;
    public AnchorPane root;

    @FXML
    private Button searchBtn;


    public void onSearchBtnClicked(ActionEvent actionEvent) {
        searchBtn.setText("GOOO");
    }

    public void onSortBtnClicked(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("tabs/sorting.fxml"));
        Parent newPage = loader.load();
        root.getChildren().setAll(newPage);

    }
}

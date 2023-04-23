package com.algotube.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * @author : David
 * @mailto : pietrocoladavid@gmail.com
 * @created : 4/22/2023, Saturday
 * <p>
 * Description : *****
 **/
public class MenuController {
    @FXML
    private Button searchBtn;


    public void onSearchBtnClicked(ActionEvent actionEvent) {
        searchBtn.setText("GOOO");
    }
}

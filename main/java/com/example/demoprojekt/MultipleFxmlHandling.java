package com.example.demoprojekt;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MultipleFxmlHandling implements Initializable {


    public Button button_scene1;
    public Button button_scene2;
    public Button button_scene3;
    public Button button_scene4;
    public Button button_scene5;
    public BorderPane mainPane;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    public void handleButton1Action(ActionEvent event) {
        AnchorPane view = null;
        try {
            view = FXMLLoader.load(getClass().getResource("Screen1.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        mainPane.setCenter(view);
    }
    public void handleButton2Action(ActionEvent event) {
        AnchorPane view = null;
        try {
            view = FXMLLoader.load(getClass().getResource("screen2.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        mainPane.setCenter(view);
    }
    public void handleButton3Action(ActionEvent event) {
        AnchorPane view = null;
        try {
            view = FXMLLoader.load(getClass().getResource("screen3.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        mainPane.setCenter(view);
    }
    public void handleButton4Action(ActionEvent event) {
        AnchorPane view = null;
        try {
            view = FXMLLoader.load(getClass().getResource("screen4.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        mainPane.setCenter(view);
    }
    public void handleButton5Action(ActionEvent event) {
        AnchorPane view = null;
        try {
            view = FXMLLoader.load(getClass().getResource("screen5.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        mainPane.setCenter(view);

    }
}

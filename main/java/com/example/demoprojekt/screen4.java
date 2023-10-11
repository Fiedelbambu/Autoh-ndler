package com.example.demoprojekt;


import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;



public class screen4 implements Initializable {

    public WebView internet;
    public Button button_load;
    public TextField textfield_adresse;

    private WebEngine engine;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

    engine = internet.getEngine();
    loadPage();

    }

    public void loadPage() {

        engine.load("http://google.com");
    }

}

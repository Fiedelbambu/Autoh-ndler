package com.example.demoprojekt;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;


import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class screen5 implements Initializable {


    @FXML
    public MediaView mediaView01;
    private Button Button_play;
    public Button Button_pause;
    private Button Button_reset;

    private File file ;
    private Media media;
    private MediaPlayer mediaPlayer;


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {


        file = new File("Umschulung.mp4");
        media = new Media(getClass().getResource("/Umschulung.mp4").toString());

     //   media = new Media(file.toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaView01.setMediaPlayer(mediaPlayer);
    }

    public void playMedia(){

    }
    public void pauseMedia(){

    }
    public void resetMedia(){

    }

    public Button getButton_play() {
        return Button_play;
    }

    public void setButton_play(Button button_play) {
        Button_play = button_play;
    }

    public Button getButton_reset() {
        return Button_reset;
    }

    public void setButton_reset(Button button_reset) {
        Button_reset = button_reset;
    }
}

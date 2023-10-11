module com.example.demoprojekt {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.media;
    requires javafx.web;


    opens com.example.demoprojekt to javafx.fxml;
    exports com.example.demoprojekt;
    exports com.example.demoprojekt.Object_3d;

}
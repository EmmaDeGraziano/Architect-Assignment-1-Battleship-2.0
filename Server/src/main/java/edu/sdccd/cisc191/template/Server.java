package edu.sdccd.cisc191.template;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;

public class Server extends Application{

    private final MenuController menuController = new MenuController();
    private final Scene scene = new Scene( menuController.setupRoot(), 600, 600 );

    public static void main(String[] args) { launch(); }

    public void start(Stage stage) {
        stage.setTitle("Battleship 2.0!");
        stage.setScene(scene);
        stage.show();
    }



}



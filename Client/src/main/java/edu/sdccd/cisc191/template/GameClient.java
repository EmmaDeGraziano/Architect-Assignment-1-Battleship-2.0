package edu.sdccd.cisc191.template;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
public class GameClient {
    private TextField hostName = new TextField();
    private TextField portName = new TextField();
    private HBox buttons = new HBox(30, hostName, portName);

    public GameClient() {
        buttons.setAlignment(Pos.CENTER);
    }

    public HBox getHBox() {
        return buttons;
    }
}
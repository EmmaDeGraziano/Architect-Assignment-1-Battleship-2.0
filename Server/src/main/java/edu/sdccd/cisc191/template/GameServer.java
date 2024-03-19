package edu.sdccd.cisc191.template;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javafx.scene.control.Label;

public class GameServer {
    private final int PORT = (int)(Math.random()*(65535-1025)+1025);
    private ServerSocket listener = new ServerSocket();
    private Socket connection;
    private Label message = new Label("Server is listening on port " + PORT + "...");

    public GameServer() throws IOException {
        message.setStyle("-fx-font-size: 20px");

        try {
            // Server listening
            listener = new ServerSocket(PORT);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Label getPortMessage() {
        return message;
    }
}

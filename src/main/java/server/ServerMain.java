package server;

import shared.Player;
import shared.Room;

import java.io.IOException;


public class ServerMain {

    ServerConfiguration serverConfiguration = new ServerConfiguration();

    public static void main(String[] args) throws IOException {

        System.out.println("Server is running...");

        Room room = new Room();

        System.out.println(room.roomState.board);

    }


}

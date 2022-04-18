package server;

import shared.Player;
import shared.Room;
import shared.State;

import java.io.IOException;
import java.security.PKCS12Attribute;


public class ServerMain {

    ServerConfiguration serverConfiguration = new ServerConfiguration();

    public static void main(String[] args) throws IOException {

        System.out.println("Server is running...");

        Room room = new Room();


        Player P1 = new Player("matthadd", 0);
        Player P2 = new Player("matthadd", 2);
        Player P3 = new Player("matthadd", 3);



        room.roomState.addPlayers(P1, P2, P3);

    }


}

package server;

import shared.Player;
import shared.Room;

import java.io.IOException;


public class ServerMain {

    ServerConfiguration serverConfiguration = new ServerConfiguration();

    public static void main(String[] args) throws IOException {

        System.out.println("Server is running...");

        Room room = new Room();


        Player P1 = new Player("garan", 0);
        Player P2 = new Player("matthadd", 2);
        Player P3 = new Player("matthadd", 3);


        room.roomState.addPlayers(P1, P2, P3);
        Player P4 = new Player("hugo", 3);
        room.roomState.addPlayers(P4);
        room.roomState.deletePlayers(P2);
        System.out.println();
        for (Player p : room.roomState.players) {
            System.out.println(p);
        }
        System.out.println(room.roomState.board);

    }


}

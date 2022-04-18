package shared;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class State {
    public Board board;
    List<Player> players = new ArrayList<>();


    public State() throws IOException {
        Board board = new Board();
    }

    public void addPlayers(Player...players){
        for(Player p : players) {
            System.out.println(p);
        }
    }

    public int toTest() {
        return 0;
    }


}

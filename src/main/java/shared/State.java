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

    public int toTest() {
        return 0;
    }


}

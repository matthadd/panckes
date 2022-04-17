package shared;

import java.io.IOException;

public class State {

    public Board board;

    public State() throws IOException {
        Board board = new Board();
        board.init();
    }

    public int toTest() {
        return 0;
    }


}

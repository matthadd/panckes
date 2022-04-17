package shared;

import org.json.simple.parser.ParseException;

import java.io.IOException;

public class State {

    public Board board;

    public State() {
        Board board = new Board();
        board.init();
    }

    public int toTest() {
        return 0;
    }


}

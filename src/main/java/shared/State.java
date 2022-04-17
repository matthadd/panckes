package shared;

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

package shared;

import java.io.IOException;

public class Room {
    public int id;
    public State roomState;

    public Room() throws IOException {
        roomState = new State();
    }
}

package shared;

import java.io.IOException;

public class Room {
    public int id;
    public State roomState;

    public Room() throws IOException {
        this.roomState = new State();
    }
}

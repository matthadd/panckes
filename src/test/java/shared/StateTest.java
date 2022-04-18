package shared;

import junit.framework.TestCase;

import java.io.IOException;

public class StateTest extends TestCase {

    public void testAddPlayers() throws IOException {

        State state = new State();

        Player P1 = new Player("garacoul", 0);
        Player P2 = new Player("matthadd", 2);
        Player P3 = new Player("hugonoel", 3);

        state.addPlayers(P1, P2);

        assertEquals(2, state.players.size());

        state.addPlayers(P3);

        assertEquals(3, state.players.size());

        state.deletePlayers(P1);
        assertEquals(2, state.players.size());


    }

    public void testDeletePlayers() {
    }
}
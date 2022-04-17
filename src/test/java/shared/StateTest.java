package shared;

import junit.framework.TestCase;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class StateTest extends TestCase {

    public void testStateToTest() throws IOException, ParseException {
        State state = new State();
        assertEquals(0, state.toTest());
    }

}
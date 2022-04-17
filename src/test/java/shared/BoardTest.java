package shared;

import com.fasterxml.jackson.databind.ObjectMapper;
import junit.framework.TestCase;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BoardTest extends TestCase {

    Board board = new Board();

    public BoardTest() throws IOException {
    }

    public void testBoard() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        BoardComponent[] asArray = mapper.readValue(Files.readString(Path.of("res/boardComponents.json")), BoardComponent[].class);
        for (BoardComponent boardComponent : asArray) {
            //assertThat(boardComponent, instanceOf(BoardComponent.class));
            System.out.println(boardComponent);
        }

    }


}
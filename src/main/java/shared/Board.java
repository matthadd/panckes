package shared;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class Board {
    List<BoardComponent> boardComponents = new ArrayList<>();

    public Board() throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        BoardComponent[] asArray = mapper.readValue(Files.readString(Path.of("res/boardComponents.json")), BoardComponent[].class);

        // only for tests purpose
        for(BoardComponent boardComponent : asArray)
        {
            assertThat(boardComponent, instanceOf(BoardComponent.class));
            System.out.println(boardComponent);
        }

    }

    public void init() {
    }

    public int size() {
        return boardComponents.size();
    }


}

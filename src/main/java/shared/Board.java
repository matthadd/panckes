package shared;

import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Board {
    List<BoardComponent> boardComponents = new ArrayList<BoardComponent>();

    public Board() {
    }

    public void init() {
    }

    public int size() {
        return boardComponents.size();
    }


}

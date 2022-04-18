package shared;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Board {
    List<BoardComponent> boardComponents = new ArrayList<>();

    public Board() throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        // read the json from the array in the res file
        BoardComponent[] allComponents = mapper.readValue(Files.readString(Path.of("res/boardComponents.json")), BoardComponent[].class);

        // while the board is not complete
        while (this.boardComponents.size() < 10) {
            // we shuffle the list of possibilities
            this.shuffle(allComponents);
            // we choose the first possibility if random < weight (if weight is big, probability to choose it is big)
            if (new Random().nextInt(100) < allComponents[0].weight) this.boardComponents.add(allComponents[0]);
        }

        System.out.println(this);
    }

    public int size() {
        // return the board size (obviously)
        return boardComponents.size();
    }

    public void shuffle(BoardComponent[] allComponents) {
        // shuffle the BoardComponents[] list via permutation (boring math, it works)
        Random rand = new Random();
        for (int i = 0; i < allComponents.length; i++) {
            int randomIndexToSwap = rand.nextInt(allComponents.length);
            BoardComponent temp = allComponents[randomIndexToSwap];
            allComponents[randomIndexToSwap] = allComponents[i];
            allComponents[i] = temp;
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (BoardComponent boardComponent : this.boardComponents) {
            res.append(boardComponent.name).append(",");
        }
        return "Board{" +
                "boardComponents.name=" + res +
                '}';
    }
}

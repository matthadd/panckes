package shared;

public class Player {

    public String name;
    public int x;
    public int y;

    public int score;

    public Player(String name, int score) {
        System.out.println("New char");
        this.name = "name";
        this.score = 0;

        this.x = 0;
        this.y = 0;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[CHARACTER] " + name + " " + score;
    }
}

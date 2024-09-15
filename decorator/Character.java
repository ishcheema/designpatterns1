import java.util.ArrayList;

public class Character {
    protected ArrayList<String> lines;
    private final String name;

    public Character(ArrayList<String> lines, String name) {
        this.lines = lines;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String line : lines) {
            sb.append(line).append("\n");
        }
        return sb.toString();
    }
}
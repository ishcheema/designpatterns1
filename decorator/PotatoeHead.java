import java.util.ArrayList;

public class PotatoeHead extends Character {

    public PotatoeHead(String name) {
        super(new ArrayList<>(), name);
        // Initialize potato head base
        lines.add("              ._____.      ");
        lines.add("           ./'.== ==.`\\.   ");
        lines.add("          :             :  ");
        lines.add("         :               : ");
        lines.add("        /                 \\");
        lines.add("      _.|                 |._");
        lines.add("    .'.-|                 |-.`.");
        lines.add("   //'  |                 |  `\\\\ ");
        lines.add("  ||    |                 |    ||");
        lines.add("  ||     \\.             ./     ||");
        lines.add("  ||       '-._     _.-'       ||");
        lines.add(" /  \\       _/ `~:~` \\_       /  \\");
        lines.add("||||\\)   .-'    / \\    `-.   (/||||");
        lines.add("\\|||    (`.___.')-(`.___.')    |||/");
        lines.add("  '\"' jgs `-----'   `-----'     '\"'");
    }
}
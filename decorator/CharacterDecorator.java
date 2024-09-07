import java.util.ArrayList;

public abstract class CharacterDecorator extends Character {
    protected Character character;

    public CharacterDecorator(Character character) {
        super(new ArrayList<>(character.lines), character.getName());
        this.character = character;
    }

    protected void integrateDecor(ArrayList<String> decor) {
        for (int i = 0; i < decor.size(); i++) {
            if (i < lines.size()) {
                lines.set(i, lines.get(i) + decor.get(i));  // Overlay ASCII art
            }
        }
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

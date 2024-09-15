import java.util.ArrayList;

public class Ears extends CharacterDecorator {

    public Ears(Character character) {
        super(character);
        FileReader reader = new FileReader();
        ArrayList<String> ears = reader.getLines("ears.txt");
        integrateDecor(ears);
    }
}
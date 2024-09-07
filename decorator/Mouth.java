import java.util.ArrayList;

public class Mouth extends CharacterDecorator {

    public Mouth(Character character) {
        super(character);
        FileReader reader = new FileReader();
        ArrayList<String> mouth = reader.getLines("mouth.txt");
        integrateDecor(mouth);
    }
}

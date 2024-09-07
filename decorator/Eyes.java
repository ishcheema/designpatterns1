import java.util.ArrayList;

public class Eyes extends CharacterDecorator {

    public Eyes(Character character) {
        super(character);
        FileReader reader = new FileReader();
        ArrayList<String> eyes = reader.getLines("eyes.txt");
        integrateDecor(eyes);
    }
}

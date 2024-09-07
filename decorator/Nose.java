import java.util.ArrayList;

public class Nose extends CharacterDecorator {

    public Nose(Character character) {
        super(character);
        FileReader reader = new FileReader();
        ArrayList<String> nose = reader.getLines("nose.txt");
        integrateDecor(nose);
    }
}

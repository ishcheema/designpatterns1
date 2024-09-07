import java.util.ArrayList;

public class Hat extends CharacterDecorator {

    public Hat(Character character) {
        super(character);
        FileReader reader = new FileReader();
        ArrayList<String> hat = reader.getLines("hat.txt");
        integrateDecor(hat);
    }
}

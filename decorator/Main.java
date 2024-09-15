public class Main {
    public static void main(String[] args) {
        // Create the base PotatoHead character
        Character potatoHead = new PotatoeHead("Mr. PotatoHead");

        // Add features using decorators
        potatoHead = new Hat(potatoHead);
        potatoHead = new Eyes(potatoHead);
        potatoHead = new Nose(potatoHead);
        potatoHead = new Mouth(potatoHead);
        potatoHead = new Ears(potatoHead);

        // Print the final decorated character
        System.out.println(potatoHead.toString());
    }
}

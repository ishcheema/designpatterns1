public class PotatoeDriver {

    public static void main(String[] args) {
        Character potatoe = new PotatoeHead("Mr. Potato Head");

        potatoe = new Hat(potatoe);
        potatoe = new Ears(potatoe);
        potatoe = new Eyes(potatoe);
        potatoe = new Nose(potatoe);
        potatoe = new Mouth(potatoe);

        System.out.println(potatoe);
    }
}

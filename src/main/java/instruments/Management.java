package instruments;

public class Management {
    protected static void init() {

        Stringed guitar  = new Stringed();
        guitar.name = "Feder";
        guitar.price = 150.0;
        guitar.play();

        Wind flute = new Wind();
        flute.name = "Magic";
        flute.price = 20.0;
        flute.play();

        Percussion.playStatic();
    }
}
package instruments;

public class Management {
    protected static void init() {

        Stringed guitar  = new Stringed("Feder", 150.0);

        guitar.play();

        Wind flute = new Wind("Magic",20.2);

        flute.play();

        new Percussion("drums",120.0).play();

    }
}
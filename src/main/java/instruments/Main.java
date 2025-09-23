package instruments;

public class Main {
    public static void main(String[] args) {

        Stringed guitar  = new Stringed();
        guitar.name = "Feder";
        guitar.price = 150.0;
        guitar.play();

        Wind flute = new Wind();
        flute.name = "Magic";
        flute.price = 20.0;
        flute.play();

        //Calling a static method to implements the inherit class.
        Percussion.playStatic();

    }
}

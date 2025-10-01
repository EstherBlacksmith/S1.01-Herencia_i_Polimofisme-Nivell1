package instruments;

public class Percussion extends Instrument {
    static {
        System.out.println("Initializing Percussion class");
    }

    public static final String MESSAGE ="It's playing a percussion instrument";

    public Percussion(String name, Double price) throws Exception {
        super(name, price);
    }


    @Override
    public void play() {
        System.out.println(MESSAGE);
    }
}

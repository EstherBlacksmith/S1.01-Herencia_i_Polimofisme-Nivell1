package instruments;

public class Stringed extends Instrument {
    public static final String MESSAGE ="It's playing a stringed instrument";

    public Stringed(String name, Double price) throws Exception {
        super(name, price);
    }


    @Override
    public void play() {
        System.out.println(MESSAGE);
    }
}

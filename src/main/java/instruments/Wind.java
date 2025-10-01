package instruments;

public class Wind extends Instrument {
    public static final String MESSAGE ="It's playing a wind instrument";

    public Wind(String name, Double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println(MESSAGE);
    }

}
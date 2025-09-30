package instruments;

public class Stringed extends Instrument {
    public static final String message ="It's playing a stringed instrument";

    public Stringed(String name, Double price) {
        super(name, price);
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public void play() {
        System.out.println(message);
    }
}

package instruments;

public class Wind extends Instrument {
    public static final String message ="It's playing a wind instrument";

    public Wind(String name, Double price) {
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
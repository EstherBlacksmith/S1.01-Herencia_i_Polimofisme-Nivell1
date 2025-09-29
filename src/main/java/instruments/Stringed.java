package instruments;

public class Stringed extends Instrument {
    public static final String message ="It's playing a stringed instrument";

    public Stringed() {
    }

    @Override
    public void play() {
        System.out.println(message);
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public Double getPrice() {
        return price;
    }
    @Override
    public void setPrice(Double price) {
        this.price = price;
    }

}

package instruments;

public class Stringed extends Instrument {
    public static String message ="It's playing a stringed instrument";

    public Stringed() {
    }

    public void play() {
        System.out.println(message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}

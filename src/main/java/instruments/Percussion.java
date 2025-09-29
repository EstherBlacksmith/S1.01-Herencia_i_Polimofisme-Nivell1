package instruments;

public class Percussion extends Instrument {
    static {
        System.out.println("Initializing Percussion class");
    }

    public static final String message ="It's playing a percussion instrument";

    public Percussion() {
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
    public static void playStatic() {
        System.out.println(message);

    }

    @Override
    public void play() {

    }
}

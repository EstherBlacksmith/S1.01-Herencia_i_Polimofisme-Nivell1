package instruments;

public class Percussion extends Instrument {
    static {
        System.out.println("Initializing Percussion class");
    }

    public static final String message ="It's playing a percussion instrument";

    public Percussion(String name, Double price) {
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

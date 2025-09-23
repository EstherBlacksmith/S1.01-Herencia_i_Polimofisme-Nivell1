package instruments;

public class Percussion extends Instruments {
    static {
        System.out.println("Initializing Percussion class");
    }
    public static String message ="It's playing a percussion instrument";

    public Percussion() {
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

    public static void playStatic() {
        System.out.println(message);

    }

    @Override
    public void play() {

    }
}

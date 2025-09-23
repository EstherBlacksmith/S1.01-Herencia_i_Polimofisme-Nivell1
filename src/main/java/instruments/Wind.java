package instruments;

public class Wind extends Instruments {
    public static String message ="It's playing a wind instrument";

    public Wind() {
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
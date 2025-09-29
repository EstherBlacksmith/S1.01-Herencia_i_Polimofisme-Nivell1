package instruments;

public class Wind extends Instrument {
    public static final String message ="It's playing a wind instrument";

    public Wind() {
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
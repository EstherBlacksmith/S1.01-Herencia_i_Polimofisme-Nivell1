package instruments;

public abstract class Instrument {
    private final String name;
    private final Double price;
    
    public Instrument(String name, Double price) {
        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Name can not be null or empty");
        }

        if (price == null || price < 0) {
            throw new RuntimeException("Entered price is not a valid one");
        }

        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public abstract void play();
}

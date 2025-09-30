package instruments;

public abstract class Instrument {
    String name;
    Double price;

    public Instrument(String name, Double price) {
        this.name = name;
        this.price = price;
    }


    protected abstract String getName() ;
    protected abstract Double getPrice() ;
    public abstract void play() ;
}

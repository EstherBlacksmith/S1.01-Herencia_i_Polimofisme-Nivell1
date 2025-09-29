package instruments;

public abstract class Instrument {
    String name;
    Double price;

    protected abstract String getName() ;
    protected abstract void setName(String name) ;
    protected abstract Double getPrice() ;
    protected abstract void setPrice(Double price);
    protected abstract void play() ;
}

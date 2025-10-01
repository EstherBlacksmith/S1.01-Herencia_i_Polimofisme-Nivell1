package instruments;

public abstract class Instrument {
    private final String name;
    private final Double price;

    public Instrument(String name,Double price) throws Exception{
        if (name == null || name.isEmpty()){
            throw new Exception("Name can not be null or empty");
        }

        if (price == null || price < 0 ){
            throw new Exception("Entered price is not a valid one");
        }

        this.name = name;
        this.price = price;
    }

    public abstract void play() ;
}

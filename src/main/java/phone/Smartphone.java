package phone;

public class Smartphone extends Phone implements Camera,Watch{
    public Smartphone(String band, String model) {
        super();
        this.band = band;
        this.model = model;
    }

}

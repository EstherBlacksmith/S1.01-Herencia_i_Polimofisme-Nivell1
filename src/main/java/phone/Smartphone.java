package phone;

public class Smartphone extends Phone implements Camera,Watch{
    public Smartphone(String band, String model) throws Exception {
        super(band,model);
    }

}

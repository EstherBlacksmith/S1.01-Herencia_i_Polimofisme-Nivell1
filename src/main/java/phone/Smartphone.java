package phone;

public class Smartphone extends Phone implements Camera,Watch{

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void takingPhoto() {
        System.out.println("Taking a photography with " + this.getBrand() + " " + this.getModel() );
    }

    @Override
    public void alarm() {
        System.out.println("The alarm is ringing with " + this.getBrand() + " " + this.getModel() );
    }
}

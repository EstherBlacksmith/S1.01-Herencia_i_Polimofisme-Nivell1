package phone;

public class Phone {
    private String band;
    private String model;

    public Phone(String band, String model) {
        this.band = band;
        this.model = model;
    }


    void calling(String phoneNumber) {
        System.out.println("Calling the number " + phoneNumber);
    }
}

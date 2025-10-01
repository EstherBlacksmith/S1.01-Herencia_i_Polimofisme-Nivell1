package phone;

public class Phone {
    private final String brand;
    private final String model;

    public Phone(String brand, String model) {
        if ( brand == null ||brand.isEmpty() ){
            throw new RuntimeException("Brand can not be empty or null");
        }
        if (model == null || model.isEmpty() ){
            throw new RuntimeException("Model can not be empty or null");
        }

        this.brand = brand;
        this.model = model;
    }

    protected String getBrand() {
        return brand;
    }

    protected String getModel() {
        return model;
    }

    void calling(String phoneNumber)  {
        if (phoneNumber == null || phoneNumber.isEmpty() ){
            throw new RuntimeException("Phone number can not be empty or null");
        }

        if (phoneNumber.length() < 9){
            throw new RuntimeException("Phone number is too short");
        }

        if (!phoneNumber.matches("\\d+")){
            throw new RuntimeException("Phone number hasn't a valid format");
        }

        System.out.println("Calling the number " + phoneNumber);
    }

}

package phone;

public class Phone {
    private String brand;
    private String model;

    public Phone(String brand, String model) throws Exception {
        if ( brand == null ||brand.isEmpty() ){
            throw new Exception("Brand can not be empty or null");
        }
        if (model == null || model.isEmpty() ){
            throw new Exception("Model can not be empty or null");
        }

        this.brand = brand;
        this.model = model;
    }


    void calling(String phoneNumber) throws Exception {
        if (phoneNumber == null || phoneNumber.isEmpty() ){
            throw new Exception("Phone number can not be empty or null");
        }

        if (phoneNumber.length() < 9){
            throw new Exception("Phone number is too short");
        }

        if (!phoneNumber.matches("\\d+")){
            throw new Exception("Phone number hasn't a valid format");
        }

        System.out.println("Calling the number " + phoneNumber);
    }
}

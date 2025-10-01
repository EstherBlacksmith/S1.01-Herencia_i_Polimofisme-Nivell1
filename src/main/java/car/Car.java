package car;

public class Car {
    public final static String BRAND = "Fiat";
    public static String model;
    public final int power = 200;

    public Car(String model) {
        if (model == null || model.isEmpty() ){
            throw new RuntimeException("Model can not be empty or null");
        }
        Car.model = model;
    }

    public static void slowDown(){
        System.out.println("The vehicle is slowing down");
    }

    public void speedUp(){
        System.out.println("The vehicle is speeding up");
    }

}

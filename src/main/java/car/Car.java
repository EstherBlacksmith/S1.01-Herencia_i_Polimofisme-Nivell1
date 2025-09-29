package car;

public class Car {
    public final static String brand = "Fiat";
    public static String model;
    public final int power = 200;

    static{
        model = "Stylo";
    }

    public Car() {}

    public static void slowDown(){
        System.out.println("The vehicle is slowing down");
    }
    public void speedUp(){
        System.out.println("The vehicle is speeding up");
    }

}

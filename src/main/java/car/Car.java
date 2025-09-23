package car;

public class Car {
    public final static String brand = "Fiat";
    public static String model;
    public final int power = 200;

    public Car() {
        //Only the static property can be initialized in the constructor.
        //The final and the final static properties must be initialized in the definition itself.
        model = "Stylo";
    }
    public static void slowDown(){
        System.out.println("The vehicle is slowing down");
    }
    public void speedUp(){
        System.out.println("The vehicle is speeding up");

    }

    public static void main(String[] args) {
        //Calling a static method without initializing the class specifically.
        Car.slowDown();

        Car car = new Car();
        //Calling a non-static method with the instance we have already created.
        car.speedUp();
    }
}

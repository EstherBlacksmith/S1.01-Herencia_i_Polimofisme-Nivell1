package car;

class Management {
    protected static void init() {
        Car.slowDown();
        Car car = new Car("Stylo");
        car.speedUp();
    }
}

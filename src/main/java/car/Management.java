package car;

class Management {
    protected static void init() throws Exception {
        Car.slowDown();
        Car car = new Car("Stylo");
        car.speedUp();
    }
}

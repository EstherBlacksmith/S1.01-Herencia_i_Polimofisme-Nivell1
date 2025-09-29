package phone;

public class Management {
    protected static void init() {
        Smartphone smartphone = new Smartphone("Xiaomi","Ultra Pro");
        smartphone.calling("60542290");
        smartphone.takingPhoto();
        smartphone.alarm();
    }


}
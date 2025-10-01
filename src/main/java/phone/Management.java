package phone;

public class Management {
    protected static void init()  {
        Smartphone smartphone = new Smartphone("Xioami","Ultra Pro");
        smartphone.calling("605422909");
        smartphone.takingPhoto();
        smartphone.alarm();
    }
}
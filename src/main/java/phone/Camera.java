package phone;

public interface Camera {
    default void takingPhoto(){
        System.out.println("Taking a photography");
    }
}

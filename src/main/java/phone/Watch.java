package phone;

public interface Watch {
    default void alarm(){
        System.out.println("The alarm is ringing");
    }
}

package instruments;

public class Main {
    public static void main(String[] args) {
        try {
            Management.init();
        } catch (Exception e) {
            throw new RuntimeException(e. getMessage());
        }
    }
}

package singleton;

public class LazyRegisteryWithIODH {

    private LazyRegisteryWithIODH() {
    }

    private static class RegisteryHolder {
        static LazyRegisteryWithIODH INSTANCE = new LazyRegisteryWithIODH();
    }

    public static LazyRegisteryWithIODH getInstance() {
        return RegisteryHolder.INSTANCE;
    }
}

package singleton;

// Double Checked Looking or "classic" singletone.

public class LazyRegisteryWithDCL {

    private LazyRegisteryWithDCL() {
    }

    private static volatile LazyRegisteryWithDCL INSTANCE;

    public static LazyRegisteryWithDCL getInstance() {
        if (INSTANCE == null) {
            synchronized (LazyRegisteryWithDCL.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazyRegisteryWithDCL();
                }
            }
        }
        return INSTANCE;
    }
}

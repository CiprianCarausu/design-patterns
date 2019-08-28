package singleton;

public class EagerRegistery {

    private EagerRegistery() {
    }

    private static final EagerRegistery INSTANCE = new EagerRegistery();

    public static EagerRegistery getInstance() {
        return INSTANCE;
    }
}

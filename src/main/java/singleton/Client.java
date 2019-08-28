package singleton;

public class Client {

    public static void main(String[] args) {

        EagerRegistery registery = EagerRegistery.getInstance();
        EagerRegistery registery2 = EagerRegistery.getInstance();

        System.out.println(registery == registery2);

        LazyRegisteryWithDCL lazySingleton = LazyRegisteryWithDCL.getInstance();
        LazyRegisteryWithDCL lazySingleton2 = LazyRegisteryWithDCL.getInstance();

        System.out.println(lazySingleton == lazySingleton2);
    }
}

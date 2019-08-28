package singleton;

public class Client {

    public static void main(String[] args) {

        EagerRegistery registery = EagerRegistery.getInstance();
        EagerRegistery registery2 = EagerRegistery.getInstance();

        System.out.println(registery == registery2);

    }
}

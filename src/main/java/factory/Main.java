package factory;

public class Main {

    public static void main(String[] args){
        OperatingSystemFactory factory = new OperatingSystemFactory();
        Os os = factory.getInstance("Openn");
        os.spec();
    }
}

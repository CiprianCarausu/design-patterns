package factory;

public class OperatingSystemFactory {
    public Os getInstance(String text) {
        if (text.equals("Open")) {
            return new Android();
        } else if (text.equals("Closed")) {
            return new Ios();
        } else {
            return new Windows();
        }
    }
}

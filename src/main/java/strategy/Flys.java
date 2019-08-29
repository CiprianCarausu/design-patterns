package strategy;

public interface Flys {
    String fly();

    class itFlys implements Flys {

        public String fly() {
            return "Flying High";
        }
    }

    class cannotFly implements Flys {
        public String fly() {
            return "I can not fly";
        }
    }
}

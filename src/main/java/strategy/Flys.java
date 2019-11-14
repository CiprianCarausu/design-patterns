package strategy;

public interface Flys {
    String fly();
}

class itFlys implements Flys {

    public String fly() {
        return "I can fly all day long.";
    }
}

class cannotFly implements Flys {
    public String fly() {
        return "Sadly, I can not fly.";
    }
}


package strategy;

public class Bird extends Animal {

    public Bird() {
        super();

        setSound("ChipChip");

        flyingType = new Flys.itFlys();
    }

}

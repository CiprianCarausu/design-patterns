package strategy;

public class AnimaPlay {

    public static void main(String[] args) {

        Animal cuteBoy = new Dog();
        Animal annoyingChip = new Bird();

        System.out.println("Dog: " + cuteBoy.tryToFly());
        System.out.println("Bird: " + annoyingChip.tryToFly());

        cuteBoy.setFlyingAbilities(new itFlys());

        System.out.println("Dog: " + cuteBoy.tryToFly());
    }
}

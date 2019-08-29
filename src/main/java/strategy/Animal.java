package strategy;

public class Animal {
    private String name;
    private double height;
    private int weight;
    private String favFood;
    private double speed;
    private String sound;

    public Flys flyingType;

    public void setname(String newName) {
        name = newName;
    }

    public String getname() {
        return name;
    }

    public void setHeight(double newHeight) {
        height = newHeight;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(int newWeight) {
        if (weight > 0) {
            weight = newWeight;
        } else {
            System.out.println("The weight must be higher than 0.");
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setFavFood(String newFavFood) {
        favFood = newFavFood;
    }

    public String getFavFood() {
        return favFood;
    }

    public void setSpeed(double newSpeed) {
        speed = newSpeed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSound(String newSound) {
        sound = newSound;
    }

    public String getSound() {
        return sound;
    }

    public String tryToFly(){
        return flyingType.fly();
    }

    public void setFlyingAbilities(Flys newFlyType){
        flyingType = newFlyType;
    }


}

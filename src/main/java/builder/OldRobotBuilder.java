package builder;

public class OldRobotBuilder implements RobotBuilder {

    private Robot robot;

    public OldRobotBuilder() {
        this.robot = new Robot();
    }

    public void buildRobotHead() {
        robot.setRobotHead("Metal Head");
    }

    public void buildRobotTorso() {
        robot.setRobotTorso("Metal Torso");
    }

    public void buildRobotArms() {
        robot.setRobotArms("Metal Arms");
    }

    public void buildRobotLegs() {
        robot.setRobotLegs("Metal Legs");
    }

    public Robot getRobot() {
        return this.robot;
    }
}



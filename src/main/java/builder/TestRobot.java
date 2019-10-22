package builder;

public class TestRobot {
    public static void main(String[] args) {


        RobotBuilder robotStyle = new OldRobotBuilder();
        RobotDirector director = new RobotDirector(robotStyle);

        director.makeRobot();

        Robot firstRobot = director.getRobot();


        System.out.println("Robot Head Type:" + firstRobot.getRobotHead());
        System.out.println("Robot Torso Type:" + firstRobot.getRobotTorso());
        System.out.println("Robot Arms Type:" + firstRobot.getRobotArms());
        System.out.println("Robot Legs Type:" + firstRobot.getRobotLegs());
    }
}
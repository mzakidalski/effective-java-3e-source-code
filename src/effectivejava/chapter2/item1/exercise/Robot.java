package effectivejava.chapter2.item1.exercise;

public class Robot implements  Robotized {
    private SoulState soulState;
    private String name;

    public Robot(String name, SoulState soulState) {
        this.name = name;
        this.soulState = soulState;
    }

    @Override
    public void obeyAsimovLawsTwo() {
        Robotized.advertiseRobots();
    }

    @Override
    public void obeyAsimovLawsThree() {
        Robotized.advertiseRobots();
    }

    public static void main(String[] args) {
        Robot robot = new Robot("Marek", SoulState.EVIL);
        Robotized.advertiseRobots();
    }

    public SoulState getSoulState() {
        return soulState;
    }

    public String getName() {
        return name;
    }

    public Robot newInstance() {
        double result = Math.random();
        if (result < 0.5) {
            return new BadRobot("name");
        } else {
            return new Robot("name", SoulState.GOOD);
        }
    }
}

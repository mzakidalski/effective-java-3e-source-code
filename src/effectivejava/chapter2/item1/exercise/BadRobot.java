package effectivejava.chapter2.item1.exercise;

public class BadRobot extends Robot {
    public BadRobot(String name) {
        super(name, SoulState.EVIL);
    }
}

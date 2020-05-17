package effectivejava.chapter2.item3.staticfactory;

import java.util.function.Supplier;

public class Robot {
    private static final Robot INSTANCE = new Robot();
    private Robot() {}
    public static Robot getInstance() {return INSTANCE;}

    public void sayHi() { System.out.println("Hi, people!");}

    public static void main(String[] args) {
        Robot.getInstance().sayHi();
        serve(Robot::getInstance);
    }

    public static void serve(Supplier<Robot> supplier) {
        supplier.get().sayHi();
    }
}

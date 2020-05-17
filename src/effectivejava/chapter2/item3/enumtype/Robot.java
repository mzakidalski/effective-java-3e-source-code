package effectivejava.chapter2.item3.enumtype;

public enum Robot {
    INSTANCE;

    public void sayHi() { System.out.println("Hi People!");}

    public static void main(String[] args) {
        Robot robot = Robot.INSTANCE;
        robot.sayHi();
    }

}

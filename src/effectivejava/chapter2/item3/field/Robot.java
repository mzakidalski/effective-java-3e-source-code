package effectivejava.chapter2.item3.field;

public class Robot {
    public static final Robot INSTANCE = new Robot();

    private Robot() {}

    public void sayHi() {System.out.println("Hi, people!");}

    public static void main(String[] args) {
        Robot.INSTANCE.sayHi();
    }
}

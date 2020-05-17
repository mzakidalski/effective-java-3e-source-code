package effectivejava.chapter2.item4;

public class NonInstantiableRobot {
    private NonInstantiableRobot() {
        throw new AssertionError();
    }
}

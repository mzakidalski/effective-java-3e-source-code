package effectivejava.chapter2.item1.exercise;

public interface Robotized {

    default void obeyAsimovLawsOne() {
        System.out.println("I am obeying Law One.");
        saySth("Something!");
    }

    private void saySth(String sth) {
        System.out.println(sth);
    }

    public static void advertiseRobots() {
        sayAdvertisement("Robots are great!!!!");
    }

    private static void sayAdvertisement(String advertisement) {
        System.out.println("Advertisement: " + advertisement);
    }

    void obeyAsimovLawsTwo();

    void obeyAsimovLawsThree();

    default void obeyAsimovLawsFour() {
        System.out.println("Obeying law four");
    }

}

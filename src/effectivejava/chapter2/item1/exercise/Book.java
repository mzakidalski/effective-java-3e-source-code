package effectivejava.chapter2.item1.exercise;

public class Book {
    private String title;
    private static final Book INSTANCE = new Book("Instance book");

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public static Book from(Robot robot) {
        return new Book("Book about "+robot.getName());
    }

    public static Book of(String phraseOne, String phraseTwo) {
        return new Book("Book about " + phraseOne + " and " + phraseTwo);
    }

    public static Book instance() {
        return INSTANCE;
    }

    public static Book newInstance() {
        return new Book("My book newInstance");
    }

    public Robot getRobot() {
        return new Robot("Robot named after book: " + title,
                SoulState.GOOD);
    }

    public static void main(String[] args) {
        Robot robot = new Robot("Name", SoulState.GOOD);
        robot.obeyAsimovLawsThree();
        robot.obeyAsimovLawsFour();
    }

}

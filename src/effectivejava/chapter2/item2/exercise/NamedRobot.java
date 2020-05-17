package effectivejava.chapter2.item2.exercise;

public class NamedRobot extends Robot {

    private String name;
    NamedRobot(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    static class Builder extends Robot.Builder<Builder>  {

        public String name;

        @Override
        NamedRobot build() {
            return new NamedRobot(this);
        }

        public Builder name(String name) {
            this.name = name;
            return self();
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    @Override
    public String toString() {
        return "NamedRobot{" +
                "name='" + name + '\'' +
                ", state=" + state +
                '}';
    }

    public static void main(String[] args) {
        NamedRobot.Builder builder = new NamedRobot.Builder();
        System.out.println(builder.soulState(SoulState.GOOD).name("R2D2").build());
    }
}

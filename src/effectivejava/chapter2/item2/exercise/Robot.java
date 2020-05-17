package effectivejava.chapter2.item2.exercise;

public class Robot {
    public enum SoulState {GOOD, EVIL}

    protected SoulState state;

    abstract static class Builder<T extends Builder<T>> {
        protected SoulState state;

        public T soulState(SoulState state) {
            this.state = state;
            return self();
        }
        abstract Robot build();

        protected abstract T self();
    }

    Robot(Builder<?> builder) {
        this.state = builder.state;
    }


}

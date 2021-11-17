package racingcargamefinal.domain;

public class Position {

    public static final Position ZERO = new Position(0);
    private static final int MIN_VALUE = 0;

    private final int value;

    public Position() {
        this(0);
    }

    public Position(int position) {
        validate(position);
        this.value = position;
    }

    private void validate(int position) {
        if (position < MIN_VALUE) {
            throw new IllegalArgumentException("위치는 음수일 수 없습니다.");
        }
    }

    public Position move() {
        return new Position(value + 1);
    }

    public Position getBigger(Position other) {
        return this.value > other.value ? this : other;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position position1 = (Position) o;

        return value == position1.value;
    }

    @Override
    public int hashCode() {
        return value;
    }

}

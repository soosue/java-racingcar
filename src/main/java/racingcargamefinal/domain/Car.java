package racingcargamefinal.domain;

import java.util.Objects;

public class Car implements Comparable<Car> {

    private final Name name;
    private final Position position;
    private final MovingStrategy movingStrategy;

    public Car(String name) {
        this(name, new RandomMovingStrategy());
    }

    public Car(String name, int value) {
        this(new Name(name), new Position(value), new RandomMovingStrategy());
    }

    public Car(String name, MovingStrategy movingStrategy) {
        this(new Name(name), Position.ZERO, movingStrategy);
    }

    public Car(Name name, Position position, MovingStrategy movingStrategy) {
        this.name = name;
        this.position = position;
        this.movingStrategy = movingStrategy;
    }

    public Car move() {
        if (movingStrategy.canMove()) {
            return new Car(name, position.move(), this.movingStrategy);
        }
        return this;
    }

    public boolean isSamePosition(Car other) {
        return isSamePosition(other.position);
    }

    public boolean isSamePosition(Position maxPosition) {
        return position.equals(maxPosition);
    }

    public Name getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(position, car.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }

    @Override
    public int compareTo(Car o) {
        return this.position.compareTo(o.position);
    }

}

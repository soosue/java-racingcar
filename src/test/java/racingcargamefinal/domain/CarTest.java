package racingcargamefinal.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    private final Car car = new Car("pobi");
    private final Car carCanMove = new Car("pobi", new MovingStrategy.CanMove());
    private final Car carCanNotMove = new Car("pobi", new MovingStrategy.CanNotMove());

    @Test
    void move() {
        Car movedCar = carCanMove.move();
        assertThat(movedCar).isEqualTo(new Car("pobi", 1));
    }

    @Test
    void moveFail() {
        Car unmovedCar = carCanNotMove.move();
        assertThat(unmovedCar).isEqualTo(new Car("pobi", 0));
    }

    @Test
    void isSamePositionByPosition() {
        assertThat(car.isSamePosition(new Position(0))).isTrue();
        assertThat(car.isSamePosition(new Position(1))).isFalse();
    }

    @Test
    void isSamePositionByCar() {
        assertThat(car.isSamePosition(new Car("pobi", 0))).isTrue();
        assertThat(car.isSamePosition(new Car("pobi", 1))).isFalse();
    }

    @Test
    void equals() {
        assertThat(car).isEqualTo(new Car("pobi", 0));
        assertThat(car).isNotEqualTo(new Car("pobi", 1));
        assertThat(car).isNotEqualTo(new Car("crong", 0));
    }

    @ParameterizedTest
    @MethodSource(value = "provideCar")
    void compareTo(Car other, int expected) {
        assertThat(new Car("pobi", 3).compareTo(other)).isEqualTo(expected);
    }

    private static Stream<Arguments> provideCar() {
        String name = "pobi";
        return Stream.of(
                Arguments.of(new Car(name, 2), 1),
                Arguments.of(new Car(name, 3), 0),
                Arguments.of(new Car(name, 4), -1)
        );
    }

}

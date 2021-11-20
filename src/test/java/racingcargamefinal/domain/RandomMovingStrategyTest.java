package racingcargamefinal.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class RandomMovingStrategyTest {

    private final RandomMovingStrategy strategy = new RandomMovingStrategy();

    @Test
    void canMove() {
        MovingStrategy movingStrategy = strategy;
        assertDoesNotThrow(() -> {
            assertThat(movingStrategy.canMove());
        });
    }

    @Test
    void canMoveHasValue() {
        assertThat(strategy.canMove(4)).isTrue();
    }

    @Test
    void canMoveHasValueFail() {
        assertThat(strategy.canMove(3)).isFalse();
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 9})
    void validateMoveValue(int value) {
        assertDoesNotThrow(() -> {
            strategy.canMove(value);
        });
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 10})
    void validateMoveValueFail(int value) {
        assertThatThrownBy(() -> {
            strategy.canMove(value);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("move value 는 0 ~ 9입니다.");
    }

}
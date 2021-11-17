package racingcargamefinal.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WinnersTest {

    @Test
    void findWinners() {
        Car pobi = new Car("pobi", 3);
        Car crong = new Car("crong", 1);
        Car honux = new Car("honux", 3);

        Cars cars = new Cars(List.of(pobi, crong, honux));

        assertThat(Winners.findWinners(cars).getCars()).containsExactly(pobi, honux);
    }

}

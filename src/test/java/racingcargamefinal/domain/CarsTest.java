package racingcargamefinal.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    void create() {
        String carNames = "pobi,crong,honux";
        int carCount = 3;
        Cars cars = new Cars(carNames);

        assertThat(cars.getCars().size()).isEqualTo(carCount);
    }

}

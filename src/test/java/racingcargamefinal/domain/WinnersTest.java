package racingcargamefinal.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class WinnersTest {

    private final Car pobi = new Car("pobi", 3);
    private final Car crong = new Car("crong", 1);
    private final Car honux = new Car("honux", 3);

    private final Winners winners = new Winners(Arrays.asList(pobi, honux));

    @Test
    void getWinnersString() {
        assertThat(winners.getWinnersString()).isEqualTo("pobi,honux");
    }

    @Test
    void equals() {
        assertThat(winners).isEqualTo(new Winners(Arrays.asList(pobi, honux)));
    }

}

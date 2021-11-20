package racingcargamefinal.domain;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Winners {
    
    private final List<Car> winners;

    public Winners(List<Car> winners) {
        this.winners = winners;
    }

    public String getWinnersString() {
        return getWinners().stream()
                .map(winner -> winner.getName().getValue())
                .collect(Collectors.joining(","));
    }

    public List<Car> getWinners() {
        return Collections.unmodifiableList(winners);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Winners winners1 = (Winners) o;

        return winners != null ? winners.equals(winners1.winners) : winners1.winners == null;
    }

    @Override
    public int hashCode() {
        return winners != null ? winners.hashCode() : 0;
    }

}

package racingcargamefinal.domain;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Winners {
    
    private final List<Car> winners;

    public Winners(List<Car> cars) {
        this.winners = cars;
    }

    public static Winners findWinners(Cars cars) {
        return new Winners(findWinners(cars, findMaxPosition(cars)));
    }

    private static Position findMaxPosition(Cars cars) {
        Position maxPosition = Position.ZERO;
        for (Car car : cars.getCars()) {
            maxPosition = car.findMaxPosition(maxPosition);
        }
        return maxPosition;
    }

    private static List<Car> findWinners(Cars cars, Position maxPosition) {
        return cars.getCars().stream()
                .filter(car -> car.isWinner(maxPosition))
                .collect(Collectors.toList());
    }
    
    public List<Car> getCars() {
        return Collections.unmodifiableList(winners);
    }
    
}

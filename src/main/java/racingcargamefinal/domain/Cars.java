package racingcargamefinal.domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private final List<Car> cars;

    public Cars(String carNames) {
        this(Arrays.stream(carNames.split(","))
                .map(Car::new)
                .collect(Collectors.toList()));
    }

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public Cars move() {
        return new Cars(cars.stream()
                .map(Car::move)
                .collect(Collectors.toList()));
    }

    public Winners findWinners() {
        return new Winners(findWinners(findWinnerCar()));
    }

    private Car findWinnerCar() {
        return cars.stream()
                .max(Car::compareTo)
                .orElse(new Car("zero"));
    }

    private List<Car> findWinners(Car winnerCar) {
        return cars.stream()
                .filter(car -> car.isSamePosition(winnerCar))
                .collect(Collectors.toList());
    }

    public List<Car> getCars() {
        return Collections.unmodifiableList(cars);
    }

}

package racingcargamefinal.domain;

import racingcargamefinal.utils.RandomUtils;

public class RandomMovingStrategy implements MovingStrategy {

    private static final int MOVE_BOUND = 4;

    @Override
    public boolean canMove() {
        return canMove(RandomUtils.getRandomValue());
    }

    public boolean canMove(int moveValue) {
        validate(moveValue);
        return moveValue >= MOVE_BOUND;
    }

    private void validate(int value) {
        if (value < 0 || value > 9) {
            throw new IllegalArgumentException("move value 는 0 ~ 9입니다.");
        }
    }

}

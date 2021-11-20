package racingcargamefinal.domain;

public interface MovingStrategy {

    boolean canMove();

    final class CanMove implements MovingStrategy {
        @Override
        public boolean canMove() {
            return true;
        }
    }

    final class CanNotMove implements MovingStrategy {
        @Override
        public boolean canMove() {
            return false;
        }
    }

}

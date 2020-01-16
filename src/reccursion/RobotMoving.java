package reccursion;

public class RobotMoving {


    public int robotMoveTo(int x, int y, int targetX, int targetY) {
        if (x == targetX && y == targetY) {
            return 1;
        }

        if (x >= targetX) {
            return robotMoveTo(x, y + 1, targetX, targetY);
        }

        if (y >= targetY) {
            return robotMoveTo(x + 1, y, targetX, targetY);
        }

        return robotMoveTo(x, y + 1, targetX, targetY) + robotMoveTo(x + 1, y, targetX, targetY);
    }
}

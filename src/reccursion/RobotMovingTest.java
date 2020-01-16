package reccursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RobotMovingTest {

    private final RobotMoving robotMoving = new RobotMoving();

    @Test
    void testReccur_ok() {
        assertEquals(1, robotMoving.robotMoveTo(0, 0, 0, 0));
        assertEquals(2, robotMoving.robotMoveTo(0, 0, 1, 1));
        assertEquals(6, robotMoving.robotMoveTo(0, 0, 2, 2));
    }

}
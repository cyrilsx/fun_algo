package dynamics;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ChildRunningTest {

    private final ChildRunning childRunning = new ChildRunning();

    @Test
    void nbWaysToGoUp() {
        Assertions.assertEquals(childRunning.nbWaysToGoUp(3), 4);
    }
}

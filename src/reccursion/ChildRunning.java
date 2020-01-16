package reccursion;

import java.util.stream.IntStream;

public class ChildRunning {

    int nbWaysToGoUp(int nbSteps) {
        if (nbSteps == 0) {
            return 1;
        }

        if (nbSteps < 0) {
            return 0;
        }

        return IntStream.range(1, 4)
                .map(n -> nbWaysToGoUp(nbSteps - n))
                .reduce(Integer::sum).orElse(0);
    }

    public static void main(String[] args) {
        ChildRunning childRunning = new ChildRunning();
        System.out.println("nb ways to go up for 23: " + childRunning.nbWaysToGoUp(23));
    }


}

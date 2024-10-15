package dynamics;

import java.util.stream.IntStream;

public class ChildRunning {

    private int[] memo = new int[50];

    int nbWaysToGoUp(int nbSteps) {
        if (memo[nbSteps] != 0) {
            return memo[nbSteps];
        }

        if (nbSteps == 0) {
            memo[0] = 0;
            return 0;
        }

        if (nbSteps == 1) {
            memo[1] = 1;
            return 1;
        }

        if (nbSteps == 2) {
            memo[2] = 2;
            return 2;
        }

        int wayOne = nbWaysToGoUp(nbSteps - 1);
        int wayTwo = nbWaysToGoUp(nbSteps - 2);
        int resultN = wayOne + wayTwo;
        memo[nbSteps] = resultN;
        return resultN;
    }


    // 4
    // 3                2
    // 2    1

    // 1 1 1 1
    // 1 1 2
    // 1 2 1
    // 2 1 1
    // 2 2



    public static void main(String[] args) {
        ChildRunning childRunning = new ChildRunning();
        System.out.printf("nb ways to go up for 3: %d\n", childRunning.nbWaysToGoUp(5));
       // System.out.println("nb ways to go up for 23: " + childRunning.nbWaysToGoUp(23));
    }


}

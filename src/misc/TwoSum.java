package misc;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; i < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        TwoSum sum = new TwoSum();
        System.out.println(Arrays.toString(sum.twoSum(new int[] {2, 7, 11, 15}, 9)));
    }
}

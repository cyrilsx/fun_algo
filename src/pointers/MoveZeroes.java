package pointers;

import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                for (int j = i; nums[j] != 0 ;j--) {
                    if (j == 0 || nums[j-1] != 0) {
                        break;
                    }
                    swap(nums, j-1, j);
                }
            }
        }
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        //int[] nums = {1, 0, 3, 0, 4};
        //int[] nums = {0,1,0,3,12};
        int[] nums = {1, 0, 0, 0, 3, 12};
        new MoveZeroes().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}

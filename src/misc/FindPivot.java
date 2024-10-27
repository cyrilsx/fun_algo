package misc;

public class FindPivot {

    public int pivotIndex(int[] nums) {
        int[] rightSum = new int[nums.length];
        int[] leftSum = new int[nums.length];
        for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {
            rightSum[i] = i == 0 ? nums[i] : rightSum[i - 1] + nums[i];
            leftSum[i] = i == 0 ? nums[j] : leftSum[i - 1] + nums[j];
        }
        for (int i = 0; i < nums.length; i++) {
            if (rightSum[i] == leftSum[nums.length - i - 1]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new FindPivot().pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
        System.out.println(new FindPivot().pivotIndex(new int[]{1, 2, 3}));
        System.out.println(new FindPivot().pivotIndex(new int[]{2, 1, -1}));
        System.out.println(new FindPivot().pivotIndex(new int[]{-1, -1, -1, -1, -1, 0}));
        System.out.println(new FindPivot().pivotIndex(new int[]{-1, -1, -1, 1, 1, 1})); // -1
        System.out.println(new FindPivot().pivotIndex(new int[]{-1, -1, 0, 1, 1, 0})); // -1
    }

}

package arrays;

public class ProductExceptSelf {
    // too slow
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            answer[i] = product(nums, 0, i -1) * product(nums, i + 1, nums.length-1);
        }
        return answer;
    }

    private int product(int[] nums, int from, int to) {
        if (from < 0 || to >= nums.length) {
            return 1;
        }
        int res = 1;
        for(int i = from; i <= to; i++) {
            res *= nums[i];
        }
        return res;
    }



    public int[] productExceptSelf2(int[] nums) {
        int[] answer = new int[nums.length];
        int[] all = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            all[i] = answer(i-1, all) * nums[i];
            answer[i] = answer(i, answer) * answer(i-1, answer);
            System.out.println("all " + all[i] + " answer " + answer[i]);
        }
        return answer;
    }

    int answer(int index, int[] currentAnswer) {
        if(index < 0 || index >= currentAnswer.length || currentAnswer[index] == 0) {
            return 1;
        }
        return currentAnswer[index];
    }

    public static void main(String[] args) {
        int[] result = new ProductExceptSelf().productExceptSelf(new int[]{1, 2, 3, 4});
        for (int i : result) {
            System.out.println(i);
        }
    }
}

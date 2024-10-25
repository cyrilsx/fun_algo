package misc;

public class FindPivot {

    public int pivotIndex(int[] nums) {
        int i = 0, j = nums.length - 1;
        int rightSide = 0;
        int leftSide = 0;
        while(i < j) {
            if(leftSide > rightSide) {
                rightSide += nums[i++];
            } else {
                leftSide += nums[j--];
            }
        }

        if (leftSide ==0 || rightSide == 0) {
            return 0;
        }

        return leftSide == rightSide ? i: -1;
    }

    public static void main(String[] args) {
//        System.out.println(new FindPivot().pivotIndex(new int[]{ 1,7,3,6,5,6 }));
//        System.out.println(new FindPivot().pivotIndex(new int[]{ 1,2,3 }));
//        System.out.println(new FindPivot().pivotIndex(new int[]{ 2,1,-1 }));
        System.out.println(new FindPivot().pivotIndex(new int[]{-1,-1,-1,-1,-1,0 }));
    }

}

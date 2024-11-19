package misc;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int currentContainer = 0;
        for(int i = 0, j = height.length - 1; i < j;) {
            int currentArea = Math.min(height[i], height[j]) * (j - i);
            if (currentArea > currentContainer) {
                currentContainer = currentArea;
            }
            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }
        return currentContainer;
    }

    public static void main(String[] args) {
        System.out.println(new ContainerWithMostWater().maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

}

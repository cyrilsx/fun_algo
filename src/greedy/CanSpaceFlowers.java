package greedy;

public class CanSpaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n == 0 || flowerbed.length == 1 && flowerbed[0] == 0 && n == 1) {
            return true;
        }
        for (int i = 0; i < flowerbed.length; i++) {
            if (canPlacePot(i, flowerbed)) {
                flowerbed[i] = 1;
                n--;
                if (n == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean canPlacePot(int index , int[] flowerbed) {
        return flowerbed[index] == 0 && (index == 0 && (flowerbed.length > 1 && flowerbed[index + 1] == 0) // beginning
                || (index == flowerbed.length -1 && ((flowerbed.length > 1 && flowerbed[index - 1] == 0))) // end
                || index != 0 && flowerbed[index - 1] == 0 && flowerbed.length > index+1 && flowerbed[index + 1] == 0); // middle;

    }

    public static void main(String[] args) {
        System.out.println(new CanSpaceFlowers().canPlaceFlowers(new int[] {1, 0}, 1));
    //    System.out.println(new CanSpaceFlowers().canPlaceFlowers(new int[] {1,0,0,0,1}, 1));
    //    System.out.println(new CanSpaceFlowers().canPlaceFlowers(new int[] {1,0,0,0,0,1}, 2));
    //   System.out.println(new CanSpaceFlowers().canPlaceFlowers(new int[] {1,0,0,0,1,0,0}, 2));
    }
}

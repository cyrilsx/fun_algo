package arrays;

public class ReverseWordString {

    public String reverseWords(String s) {
        String[] wordInOrder = s.trim().split("\\s+");
        String res = "";
        for (int i = wordInOrder.length - 1; i >= 0; i--) {
            res += wordInOrder[i];
            if(i != 0) {
                res += " ";
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseWordString().reverseWords("the   sky is blue"));
    }
}

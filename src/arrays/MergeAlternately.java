package arrays;

public class MergeAlternately {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        String res = "";
        while (i < word1.length() && i < word2.length()) {
            res = res + word1.charAt(i) + word2.charAt(i);
            i++;
        }
        return word1.length() == i ? res + word2.substring(i) : res + word1.substring(i);
    }
}

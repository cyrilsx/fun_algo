package arrays;

public class GCDSString {
    public String gcdOfStrings(String str1, String str2) {
        if (str1.equals(str2)) {
            return str2;
        }

        if (str1.length() < str2.length()) {
            return gcdOfStrings(str2, str1);
        }

        if (str1.startsWith(str2)) {
            String substringCandidate = str1.substring(str2.length());
            return gcdOfStrings(substringCandidate, str2);
        }

        return "";
    }

    public static void main(String[] args) {
        System.out.println("res " + new GCDSString().gcdOfStrings("ABCABC", "ABC"));
        System.out.println("res " + new GCDSString().gcdOfStrings("ABABAB", "ABAB"));
        System.out.println("res " + new GCDSString().gcdOfStrings("LEET", "CODE"));
    }
}

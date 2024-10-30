package misc;

public class ReverseVowels {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int forward = 0;
        int backward = chars.length - 1;
        while (forward < backward) {
            if (!isVowel(chars[forward])) {
                forward++;
                continue;
            }
            if (!isVowel(chars[backward])) {
                backward--;
                continue;
            }
            char temp = chars[forward];
            boolean isVowelLowercaseFoward = isVoweLowercase(temp);
            boolean isVowelLowercaseBackward = isVoweLowercase(chars[backward]);
            chars[forward] = isVowelLowercaseFoward ? toLowercase(chars[backward]) : toUppercase(chars[backward]);
            chars[backward] = isVowelLowercaseBackward ? toLowercase(temp) : toUppercase(temp);
            forward++;
            backward--;
        }
        return new String(chars);
    }

    private boolean isVowel(char aChar) {
        return isVoweLowercase(aChar)
                || isVowelUppercase(aChar);
    }

    private static boolean isVoweLowercase(char aChar) {
        return aChar == 'a' || aChar == 'e' || aChar == 'i' || aChar == 'o' || aChar == 'u' || aChar == 'y';
    }

    private static boolean isVowelUppercase(char aChar) {
        return aChar == 'A' || aChar == 'E' || aChar == 'I' || aChar == 'O' || aChar == 'U' || aChar == 'Y';
    }

    private static char toUppercase(char aChar) {
        switch (aChar) {
            case 'a':
                return 'A';
            case 'e':
                return 'E';
            case 'i':
                return 'I';
            case 'o':
                return 'O';
            case 'u':
                return 'U';
            case 'y':
                return 'Y';
            default:
                return aChar;
        }
    }

    private static char toLowercase(char aChar) {
        switch (aChar) {
            case 'A':
                return 'a';
            case 'E':
                return 'e';
            case 'I':
                return 'i';
            case 'O':
                return 'o';
            case 'U':
                return 'u';
            case 'Y':
                return 'y';
            default:
                return aChar;
        }
    }



    public static void main(String[] args) {
        System.out.println(new ReverseVowels().reverseVowels("hello"));
        System.out.println(new ReverseVowels().reverseVowels("a a"));
        System.out.println(new ReverseVowels().reverseVowels("leetcode"));
    }
}


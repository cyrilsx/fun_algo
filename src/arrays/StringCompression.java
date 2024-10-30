package arrays;

import java.util.Arrays;

public class StringCompression {
    public int compress(char[] chars) {
        if (chars.length == 0) {
            return 0;
        }
        if(chars.length == 1) {
            return 1;
        }
        char current = chars[0];
        int count = 0;
        int occ = 0;
        int start = 0;
        for(int i = 0; i < chars.length; i++) {
            if(current != chars[i]) {
                chars[start] = current;
                count++;
                current = chars[i];
                if (occ == 1) {
                    start++;
                 } else {
                    int sizeWritten = write(chars, occ, start + 1);
                    count += sizeWritten;
                    start = start + sizeWritten + 1;

                    System.out.println("count " + count + " start " + start + " i " + i);
                }
                occ = 1;
            } else {
                occ++;
            }

        }
        chars[start] = current;
        count++;
        if (occ != 1) {
            count += write(chars, occ, start+1);
        }
        return count;
    }

    private int write(char[] chars, int occ, int index) {
        char[] occChar = String.valueOf(occ).toCharArray();
        for (int i = 0; i < occChar.length; i++) {
            chars[index + i] = occChar[i];
        }
        return occChar.length;

    }

    public static void main(String[] args) {
       // char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        //char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        //char[] chars = {'a','b','c'};
        //char[] chars = {'a','a'};
        char[] chars = {'a','a','a','a','a','a','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','c','c','c','c','c','c','c','c','c','c','c','c','c','c'};
        int compress = new StringCompression().compress(chars);
        System.out.println(compress);
        System.out.println(Arrays.toString(chars));
    }
}


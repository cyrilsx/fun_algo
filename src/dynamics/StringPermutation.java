package dynamics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class StringPermutation {

    public List<String> allPermutationOf(String permu) {
        if (Objects.isNull(permu) || permu.isEmpty()) {
            return Collections.emptyList();
        }

        List<String> permutations = new ArrayList<>();
        if (permu.length() == 1) {
            permutations.add(permu);
            return permutations;
        }


        char currentChar = permu.charAt(0);
        String remainder = permu.substring(1);

        List<String> permutationFound = allPermutationOf(remainder);
        for (String str : permutationFound) {
            for (int i = 0; i <= str.length(); i++) {
                permutations.add(insertCharInIndex(currentChar, i, str));
            }
        }
        return permutations;
    }

    private String insertCharInIndex(char currentChar, int i, String str) {
        return str.substring(0, i) + currentChar + str.substring(i);
    }
}

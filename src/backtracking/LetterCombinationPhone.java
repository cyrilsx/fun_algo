package backtracking;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class LetterCombinationPhone {

    private static final Map<Integer, String> KEYPAD = Map.of(
        0, "0",
        1, "1",
        2, "abc",
        3, "def",
        4, "ghi",
        5, "jkl",
        6, "mno",
        7, "pqrs",
        8, "tuv",
        9, "wxyz"
    );

    public List<String> letterCombinations(String digits, List<String> currentList, int index) {
        if (Objects.isNull(digits) || digits.isEmpty() || index > digits.length() - 1) {
            return currentList;
        }
        char currentChar = digits.charAt(index);
        String letters = KEYPAD.get(Character.getNumericValue(currentChar));
        if (currentList.isEmpty()) {
            currentList.addAll(Arrays.asList(letters.split("")));
        } else {
            currentList.forEach(str -> {
                currentList.remove(str);
                Arrays.stream(letters.split("")).sequential().forEach(letter -> {
                        currentList.add(str + letter);
                    });

            });
        }

        return letterCombinations(digits, currentList, index + 1);
    }

}

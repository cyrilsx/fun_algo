package backtracking;

import org.junit.jupiter.api.Test;

import java.util.concurrent.CopyOnWriteArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LetterCombinationPhoneTest {

    private final LetterCombinationPhone letterCombinationPhone = new LetterCombinationPhone();

    @Test
    void testLetterCombinations_ok() {
        assertEquals(9, letterCombinationPhone.letterCombinations("23", new CopyOnWriteArrayList<>(), 0).size());
        assertEquals(27, letterCombinationPhone.letterCombinations("234", new CopyOnWriteArrayList<>(), 0).size());
    }


}
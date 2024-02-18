package dynamics;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class StringPermutationTest {

    private final StringPermutation stringPermutation = new StringPermutation();

    @Test
    void test_success() {
        assertTrue(stringPermutation.allPermutationOf("a").containsAll(Arrays.asList("a")));
        assertTrue(stringPermutation.allPermutationOf("ab").containsAll(Arrays.asList("ab", "ba")));
        List<String> abc = stringPermutation.allPermutationOf("abc");
        assertTrue(abc.containsAll(Arrays.asList("abc", "bac", "cab", "cba", "acb", "bca")));

    }

}
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    void filterAndMapTest() {
        List<String> listStr = Arrays.asList("apple", "banana", "cat", "dog", "elephant");
        List<String> expected = Arrays.asList("BANANA", "ELEPHANT");
        assertEquals(expected, Main.filterAndMap(listStr));
    }
}

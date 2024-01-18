package seminars.five.number;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxNumberModuleTest {
    @Test
    void maxNumberListTest() {
        List<Integer> ints = new ArrayList<>(Arrays.asList(30, 3, 78, 12, 135));
        MaxNumberModule maxNumberModule = new MaxNumberModule();

        Integer result = maxNumberModule.getMax(ints);

        Integer expected = Collections.max(ints);

        assertEquals(expected, result);
    }
}
package seminars.five.number;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberTest{
    @Test
    void integrationTest() {
        RandomNumberModule randomNumberModule = new RandomNumberModule();
        MaxNumberModule maxNumberModule = new MaxNumberModule();

        List<Integer> randomList = randomNumberModule.getRandom(7);
        Integer result = maxNumberModule.getMax(randomList);

        assertEquals(Collections.max(randomList), result);
    }
}
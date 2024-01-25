package gb.karpenka;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AverageNumberModuleTest{
    @Test
    void AverageNumberModuleTest() {
        List<Integer> ints = new ArrayList<>(Arrays.asList(1, 2, 3, 121, 50));
        AverageNumberModule averageNumberModule = new AverageNumberModule();

        double result = averageNumberModule.getAverage(ints);

        double expected = ints.stream().mapToInt(e->e).average().getAsDouble();

        assertEquals(expected, result);
    }






}
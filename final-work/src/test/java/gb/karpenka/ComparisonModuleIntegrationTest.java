package gb.karpenka;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

class ComparisonModuleIntegrationTest {
    List<Integer> list1 = Arrays.asList(1,2,3);
    List<Integer> list2 = Arrays.asList(1,3,5);

    @Test
    void CompareAveragesOfTwoListOfNumbersTestFirstBigger() {
        String result = new ComparisonModule().compareAveragesOfTwoListOfNumbers(list2, list1);

        assertEquals("Первый список имеет большее среднее значение", result);
    }

    @Test
    void CompareAveragesOfTwoListOfNumbersTestSecondBigger() {
        String result = new ComparisonModule().compareAveragesOfTwoListOfNumbers(list1, list2);

        assertEquals("Второй список имеет большее среднее значение", result);
    }

    @Test
    void CompareAveragesOfTwoListOfNumbersTestEquals() {
        String result = new ComparisonModule().compareAveragesOfTwoListOfNumbers(list1, list1);

        assertEquals("Средние значения равны", result);
    }

}
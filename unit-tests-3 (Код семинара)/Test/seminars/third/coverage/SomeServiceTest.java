package seminars.third.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SomeServiceTest {


    SomeService someService;

    @BeforeEach
    void setUp() {
        someService = new SomeService();
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9})
    void multipleThreeNotFiveReturnsFizz(int n) {
        assertEquals("Fizz", someService.fizzBuzz(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20})
    void multipleFiveNotThreeReturnsBuzz(int n) {
        assertEquals("Buzz", someService.fizzBuzz(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45})
    void multipleFiveAndThreeReturnsFizzBuzz(int n) {
        assertEquals("FizzBuzz", someService.fizzBuzz(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4})
    void notMultipleFiveAndThreeReturnsString(int n) {
        assertEquals(((Integer) n).toString(), someService.fizzBuzz(n));
    }

    @Test
    void first6ReturnsTrue() {
        assertTrue(someService.firstLast6(new int[]{6, 1, 5, 12, 2, 3, 1}));
    }

    @Test
    void last6ReturnsTrue() {
        assertTrue(someService.firstLast6(new int[]{1, 5, 12, 2, 3, 1, 6}));
    }

    @Test
    void firstAndLastNot6ReturnsFalse() {
        assertFalse(someService.firstLast6(new int[]{1, 6, 12, 6, 6, 1}));
    }


    @Test
    void calculatingDiscount() {
    }

    @ParameterizedTest
    @CsvSource({
            "50, 1000.0",
            "100, 0.0",
            "0, 2000.0"
    })
    void normalDiscount(int i, double res) {
        assertEquals(res, someService.calculatingDiscount(2000.0, i), 0.0001);
    }

    @ParameterizedTest
    @ValueSource(ints = {101, -1})
    void notNormalDiscount(int i) {

        assertThatThrownBy(() ->
                someService.calculatingDiscount(2000.0, 101))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%");


    }

    @ParameterizedTest
    @CsvSource({
            "1, 1, 1, 3",
            "13, 1, 1, 2",
            "1, 13, 1, 2",
            "1, 1, 13, 2",
            "13, 13, 13, 26"
    })
    void insufficientCoverageTest(int a, int b, int c, int res) {
        assertEquals(res, someService.sumWitout13(a, b, c));
    }
}


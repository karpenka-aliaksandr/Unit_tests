package seminars.third.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {
    MainHW mainHW;
    @BeforeEach
    void setup() {
        mainHW = new MainHW();
    }

    @Test
    void evenOddNumberReturnTrue() {
        assertTrue(mainHW.evenOddNumber(50));
    }
    @Test
    void evenOddNumberReturnFalse() {
        assertFalse(mainHW.evenOddNumber(51));
    }

    @ParameterizedTest
    @ValueSource(ints = {26,50,99})
    void numberInIntervalReturnTrue(int n) {
        assertTrue(mainHW.numberInInterval(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {20,25,100,150,-50})
    void numberInIntervalReturnFalse(int n) {
        assertFalse(mainHW.numberInInterval(n));
    }
}
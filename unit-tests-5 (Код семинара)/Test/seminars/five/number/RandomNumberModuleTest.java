package seminars.five.number;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumberModuleTest {
    @Test
    void RandomNumberModuleTest(){
        RandomNumberModule randomNumberModule = new RandomNumberModule();
        int size = 10;
        List<Integer> result = randomNumberModule.getRandom(size);

        assertEquals(size, result.size());
    }

}
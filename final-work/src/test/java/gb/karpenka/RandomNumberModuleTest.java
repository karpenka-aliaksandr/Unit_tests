package gb.karpenka;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RandomNumberModuleTest {
    @Test
    void RandomNumberModuleTest(){
        RandomNumberModule randomNumberModule = new RandomNumberModule();
        int size = 10;
        int bound = 10;
        List<Integer> result = randomNumberModule.getListRandomInteger(size, bound);

        assertEquals(size, result.size());
    }
}

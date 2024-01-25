package gb.karpenka;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberModule {
    private Random rnd = new Random();
    public List<Integer> getListRandomInteger(int size, int bound) {
        List<Integer> ints = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            ints.add(rnd.nextInt(bound));
        }
        return ints;
    }
}
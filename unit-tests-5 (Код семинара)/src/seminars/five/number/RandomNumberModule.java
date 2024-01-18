package seminars.five.number;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomNumberModule {
    public List<Integer> getRandom(int size){
        List<Integer> ints = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            ints.add(rnd.nextInt());
        }
        return ints;
    }
}

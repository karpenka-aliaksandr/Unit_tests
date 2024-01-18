package seminars.five.number;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxNumberModule {
    public Integer getMax(List<Integer> ints){
        return ints.stream().max(Comparator.comparing(Integer::valueOf)).orElse(null);
    }
}

package gb.karpenka;

import java.util.List;

public class AverageNumberModule {
    public double getAverage(List<Integer> list){
        double sum = 0;
        int count = list.size();
        for (int i = 0; i < count; i++) {
            sum = sum + list.get(i);
        }
        return sum/count;
    }
}

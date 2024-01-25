package gb.karpenka;

import java.util.List;

public class ComparisonModule {
    private AverageNumberModule averageNumberModule = new AverageNumberModule();

    public String compareAveragesOfTwoListOfNumbers(List<Integer> list1, List<Integer> list2) {
        double avgList1 = averageNumberModule.getAverage(list1);
        double avgList2 = averageNumberModule.getAverage(list2);
        String result = "";
        if (avgList1 > avgList2) {result = "Первый список имеет большее среднее значение";}
            else if (avgList1 < avgList2) {result = "Второй список имеет большее среднее значение";}
            else {result = "Средние значения равны";}
        return result;
    }
}

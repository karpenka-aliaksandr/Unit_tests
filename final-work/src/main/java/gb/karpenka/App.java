package gb.karpenka;

import java.util.List;


public class App {
    private static final int SIZE = 2;
    private static final int BOUND = 2;
    public static void main(String[] args) {
        List<Integer> ints1 = new RandomNumberModule().getListRandomInteger(SIZE, BOUND);
        List<Integer> ints2 = new RandomNumberModule().getListRandomInteger(SIZE, BOUND);
        System.out.println(new ComparisonModule().compareAveragesOfTwoListOfNumbers(ints1, ints2));
    }
}

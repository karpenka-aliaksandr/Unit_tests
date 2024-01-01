package seminars.third.coverage;

import java.util.Arrays;

public class SomeService {

    /**
     * 3.1. Метод возвращает Fizz для чисел кратных 3, Buzz для кратных 5, и FizzBuzz для кратных 3 и 5 одновременно
     */
    public String fizzBuzz(int i) {
        if (i % 5 == 0 && i % 3 == 0) {
            return "FizzBuzz";
        }
        else
        if (i % 5 == 0) {
            return "Buzz";
        }
        else
        if (i % 3 == 0) {
            return "Fizz";
        }
        else
        return ((Integer)i).toString();
    }

    /**
     * 3.2. Метод возвращает true для массивов, которые начинаются или заканчиваются 6, и false - если 6 нет ни в начале ни в конце массива
     */
    public boolean firstLast6(int[] nums) {
        if (nums.length > 0 && nums[0] == 6) return true;
        if (nums.length > 0 && nums[nums.length-1] == 6) return true;
        return false;
    }


    /**
     * 3.3. Метод подсчета скидки
     */
    public double calculatingDiscount(double purchaseAmount, int discountAmount) throws ArithmeticException{
        if (discountAmount < 0 || discountAmount > 100) {
            throw new ArithmeticException("Скидка должна быть в диапазоне от 0 до 100%");
        }
        return purchaseAmount * (1-discountAmount/100.0);
    }


    /**
     * 3.4. Метод принимает на вход 3 числа (int a, b, c). Нужно вернуть их сумму. Однако, если одно из значений равно 13,
     * то оно не учитывается в сумме. Так, например, если b равно 13, то считается сумма только a и c.
     */

    public int sumWitout13(int a, int b, int c){
    int sum = a + b + c;
    if (a == 13 || b == 13 || c == 13) {sum -= 13;}
    return sum;
    }

}
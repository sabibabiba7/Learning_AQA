package lesson8;

import java.util.Arrays;
import java.util.Random;

public class One {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];
        int evenCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100) + 1;
            if (numbers[i] % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("Случайно сгенерированные числа: " + Arrays.toString(numbers));
        System.out.println("Количество четных чисел: " + evenCount);
    }
}
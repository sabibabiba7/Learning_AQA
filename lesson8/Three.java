package lesson8;

import java.util.Arrays;

public class Three {
    public static void main(String[] args) {
        String[] collection = {"f10", "f15", "f2", "f4", "f4"};
        Arrays.sort(collection);

        System.out.println("Отсортированные строки: " + Arrays.toString(collection));
    }
}
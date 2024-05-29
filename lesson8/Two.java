package lesson8;

import java.util.ArrayList;
import java.util.Arrays;

public class Two {
    public static void main(String[] args) {
        ArrayList<String> collection = new ArrayList<>(Arrays.asList("Highload", "High", "Load", "Highload"));

        long highCount = collection.stream().filter(s -> s.equals("High")).count();
        System.out.println("Количество объектов 'High': " + highCount);

        String firstElement = collection.isEmpty() ? "0" : collection.get(0);
        System.out.println("Первый элемент коллекции: " + firstElement);

        String lastElement = collection.isEmpty() ? "0" : collection.get(collection.size() - 1);
        System.out.println("Последний элемент коллекции: " + lastElement);
    }
}

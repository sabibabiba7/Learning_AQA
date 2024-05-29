package lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

    public class lesson7 {
        public static void main(String[] args) {

            List<String> wordList = new ArrayList<>(Arrays.asList(
                    "яблоко",
                    "банан",
                    "арбуз",
                    "яблоко",
                    "кошка",
                    "собака",
                    "собака"
                    )
            );

            HashSet<String> uniqWords = new HashSet<>(wordList);
            System.out.println(uniqWords);

            for(String val : uniqWords) {
                System.out.printf("%s: %d\n", val, wordList.stream().filter(s -> s.equals(val)).count());
            }

            Catalog catalog = new Catalog();

            catalog.add("Рыжов", "123456");
            catalog.add("Рыжов", "123456");
            catalog.add("Краснов", "987563");
            catalog.add("Полежайкин", "5214455");


            System.out.println(catalog.get("Рыжов"));
            System.out.println(catalog.get("Краснов"));
            System.out.println(catalog.get("Полежайкин"));
        }
    }
}

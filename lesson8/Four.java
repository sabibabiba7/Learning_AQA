package lesson8;

import java.util.List;
import java.util.stream.Collectors;

public class Four {
    private String name;
    private int age;
    private String gender;

    public Object getGender() {
    }

    public Object getAge() {
    }
}

public class Main {
    public static void main(String[] args) {
        List<Four> students = List.of();
        double averageAge = students.stream()
                .filter(s -> s.getGender().equals("male"))
                .mapToInt(Four::getAge)
                .average()
                .orElse(0);

        System.out.println("Средний возраст студентов мужского пола: " + averageAge);

        // 4.2. Определение студентов, которым грозит получение повестки
        List<Four> studentsForDraft = students.stream()
                .filter(s -> s.getAge() >= 18 && s.getAge() <= 27)
                .collect(Collectors.toList());

        System.out.println("Студенты, которым грозит получение повестки: " + studentsForDraft);
    }
}


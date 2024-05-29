package lesson8;

import java.util.ArrayList;
import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> logins = new ArrayList<>();

        while (true) {
            System.out.println("Введите логин:");
            String login = scanner.nextLine();

            if (login.isEmpty()) {
                break;
            }

            logins.add(login);
        }

        logins.stream()
                .filter(login -> login.startsWith("f"))
                .forEach(System.out::println);
    }
}


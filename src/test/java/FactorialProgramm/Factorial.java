package FactorialProgramm;

public class Factorial {
        public static void main(String[] args) {
            int number = 5;
            System.out.println("Факториал числа " + number + " равен " + factorial(number));
        }
        public static long factorial(int n) {
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}

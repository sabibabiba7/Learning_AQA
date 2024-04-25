package lesson2;

import java.util.Arrays;

public class lesson2 {
    public static void main(String[] args) {
        Task4();
        Task1();
        Task2();
        Task3();
        Task5();
        Task6();
        Task7();
        Task9();
        Task8();
        Task10();
    }

    private static void Task1() {
        int a = 20;
        int b = 20;
        int c = a + b;
        if (c >= 10 && c <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

    private static void Task2() {
        int a = 50;
        if (a < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }

    private static void Task3() {
        int a = 10;
        if (a < 0) {
            System.out.println(true);
        } else {
            System.out.println("false");
        }

    }

    private static void Task4() {
        for (int a = 0; a < 10; a++) {
            System.out.println("Привет");
        }
    }

    private static void Task5() {
        int year = 2010;
        if ((year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    private static void Task6() {
        int[] array = {0, 0, 1, 1};
        for (int i = 0; i < array.length; i++)
            array[i] = 1 - array[i];
        System.out.println(Arrays.toString(array));
    }

    private static void Task7() {
        int[] arr = new int[101];
        for (int i = 0; i < arr.length; i++)
            arr[i] = i;
        System.out.println(Arrays.toString(arr));
    }

    private static void Task9() {
        int[][] table = new int[10][10];
        for (int i = 0; i < table.length; i++) {
            table[i][table.length - 1] = 1;
            for (int j = 0; j < table.length; j++) {
                table[i][i] = 1;
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void Task8() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i]*=2;
            System.out.print(arr[i] + " ");
            }
        }
        private static void Task10() {
        int len=5;
        int initialValue=8;
            int[] arr= new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" +i + "] "+arr[i]+" ");
        }
        }
    }














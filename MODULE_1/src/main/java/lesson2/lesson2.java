package lesson2;

public class lesson2 {
    public static void main(String[] args) {
        printTrue();
        Task1();
        Task2();
        Task3();
    }

    private static void Task1() {
        int a=20;
        int b=20;
        int c=a+b;
        if (c>=10 && c<=20) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
    private static void Task2(){
        int a=50;
        if (a<0) {
            System.out.println("Число отрицательное");}
        else {
            System.out.println("Число положительное");
        }
    }

    private static void Task3(){
        int a=10;
        int b=30;
        if (a>b) {
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<=b");
        }

    }
    private static void printTrue() {
        System.out.println("orange");
        System.out.println("banana");
        System.out.println("apple");
    }
}


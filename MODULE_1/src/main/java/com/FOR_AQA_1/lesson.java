package com.FOR_AQA_1;

public class lesson {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColour();
        compareNumbers();
    }

    private static void checkSumSign() {
        int a=20;
        int b=20;
        int c=a+b;
        if (c>=0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }

    }
    private static void printColour(){
        int value=50;
        if (value<=0) {
            System.out.println("Красный");}
        if (value>0 && value<=100) {
            System.out.println("Желтый");}
        if (value>100) {
            System.out.println("Зеленый");}
         }

    private static void compareNumbers(){
        int a=10;
        int b=30;
        if (a>b) {
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<=b");
        }

    }
    private static void printThreeWords() {
        System.out.println("orange");
        System.out.println("banana");
        System.out.println("apple");
    }
}
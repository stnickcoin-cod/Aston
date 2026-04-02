package org.example;

import java.util.Arrays;


public class Lesson1 {
    public static void printThreeWords() {

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 2, b = 5;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 34;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers() {
        int a = 5, b = 10;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    public static boolean checkRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void positivelyOrNegatively(int n) {
        if (n >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean trueOrFalse(int a) {
        return a < 0;
    }

    public static void cycleLine(String t, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(t);
        }
    }

    public static boolean leapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void replacement(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Исходный массив: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println("Изменённый массив: " + Arrays.toString(array));
    }

    public static void fillInTheArray(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println("Заполненный массив: " + Arrays.toString(array));

    }

    public static void lessThanSixX2(String[] args) {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный массив: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println("Изменённый массив: " + Arrays.toString(array));
    }

    public static void squareArray(String[] args) {
        int size = 5;
        int[][] square = new int[size][size];
        for (int i = 0; i < size; i++) {
            square[i][i] = 1;
        }
        System.out.println("Квадратный массив с заполненной главной диагональю:");
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(square[i]));
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }

        return array;
    }


    public static void main(String[] args) {
        printThreeWords();
        printColor();
        compareNumbers();
        System.out.println(checkRange(3, 6));
        positivelyOrNegatively(5);
        System.out.println(trueOrFalse(0));
        cycleLine("test", 5);
        System.out.println(leapYear(2026));
        replacement(args);
        fillInTheArray(args);
        lessThanSixX2(args);
        squareArray(args);
        int[] arr1 = createArray(6, 8);
        System.out.println("Массив длиной 6, заполненный 8: " + java.util.Arrays.toString(arr1));
    }
}
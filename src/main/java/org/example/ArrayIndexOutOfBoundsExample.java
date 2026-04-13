package org.example;

public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        // Создаём массив из 3 элементов (индексы: 0, 1, 2)
        int[] numbers = {10, 20, 30};

        try {
            // Попытка обратиться к элементу с индексом 5 — это вызовет ArrayIndexOutOfBoundsException
            System.out.println("Попытка доступа к numbers[5]: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Перехват и обработка исключения
            System.out.println("Поймано исключение: " + e.getMessage());
            System.out.println("Сообщение об ошибке: Индекс массива выходит за допустимые границы");
        } finally {
            // Блок finally выполняется всегда — независимо от того, было ли исключение
            System.out.println("Программа продолжает работу после обработки исключения");
        }

        System.out.println("Выполнение программы завершено.");
    }
}
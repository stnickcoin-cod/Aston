package org.example;

public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        try {
            System.out.println("Попытка доступа к numbers[5]: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
            System.out.println("Сообщение об ошибке: Индекс массива выходит за допустимые границы");
        } finally {
            System.out.println("Программа продолжает работу после обработки исключения");
        }
        System.out.println("Выполнение программы завершено.");
    }
}
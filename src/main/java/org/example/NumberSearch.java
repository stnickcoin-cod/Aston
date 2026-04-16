package org.example;

public class NumberSearch {
    public static void main(String[] args) {
        PhoneDirectory directory = new PhoneDirectory();
        directory.add("Иванов", "8-699-113-45-67");
        directory.add("Петров", "8-487-654-32-10");
        directory.add("Сидоров", "8-912-345-67-89");
        directory.add("Иванов", "8-955-555-55-55");
        directory.add("Смирнов", "8-907-111-22-33");
        directory.add("Иванов", "8-933-343-44-55");
        directory.printAll();

        System.out.println("\n--- Поиск по фамилиям ---");

        System.out.println("Номера для 'Иванов': " + directory.get("Иванов"));
        System.out.println("Номера для 'Петров': " + directory.get("Петров"));
        System.out.println("Номера для 'Смирнов': " + directory.get("Смирнов")); // Не существует
    }
}
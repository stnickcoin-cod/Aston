package org.example;
import java.util.*;
import java.util.stream.Collectors;

public class PhoneDirectory {
    private Map<String, String> phoneToSurname;
    public PhoneDirectory() {
        this.phoneToSurname = new HashMap<>();
    }
    public void add(String surname, String phoneNumber) {
        if (surname == null || phoneNumber == null) {
            throw new IllegalArgumentException("Фамилия и номер телефона не могут быть null");
        }
        phoneToSurname.put(phoneNumber, surname);
    }
    public List<String> get(String surname) {
        if (surname == null) {
            return Collections.emptyList();
        }
    return phoneToSurname.entrySet().stream()
                .filter(entry -> surname.equals(entry.getValue()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
    public void printAll() {
        System.out.println("Телефонный справочник:");
        phoneToSurname.forEach((phone, surname) ->
                System.out.println(phone + " -> " + surname));
    }
}
package org.example;

public class Lesson2 {
    public static void main(String[] args) {
        Product product1 = new Product(
                "Смартфон  Galaxy S9",
                "22.11.2025",
                "Samsung Electronics",
                "Южная Корея",
                54000,
                false);
        product1.getInfo();
        Massiv massiv = new Massiv();
        massiv.productArray();
        massiv.displayAllProducts();
        Park park = new Park("Лунопарк", "09:00 - 22:00");
        park.addAttraction("Русские горки", "10:00 - 20:00", 500.0);
        park.addAttraction("Колесо обозрения", "09:00 - 22:00", 300.0);
        park.addAttraction("Карусель Осминог", "11:00 - 19:00", 200.0);
        park.addAttraction("Тир", "10:00 - 18:00", 150.0);

        park.displayAllAttractions();
    }
}
package org.example;
import java.util.Arrays;

class Products {
    private String name;
    private String productionDate;
    private String manufacturer;
    private String countryOfOrigin;
    private int price;
    private boolean booking;

    public Products(String name, String productionDate, String manufacturer,
                   String countryOfOrigin, int price, boolean booking) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.booking = booking;
    }

    public void getInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + countryOfOrigin);
        System.out.println("Цена: " + price + " руб.");
        System.out.println("Состояние бронирования: " +
                (booking ? "Забронирован" : "Свободен"));
        System.out.println("---");
    }
}

class Massiv {
    Product[] productArray = new Product[5];

    public Massiv() {
        productArray[0] = new Product("Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599, true);
        productArray[1] = new Product("Samsung S7", "04.07.2025",
                "Samsung Corp.", "Korea", 7899, true);
        productArray[2] = new Product("Samsung a24", "01.07.2025",
                "Samsung Corp.", "Korea", 10599, true);
        productArray[3] = new Product("Samsung a4", "11.02.2025",
                "Samsung Corp.", "Korea", 16599, true);
        productArray[4] = new Product("Samsung z9", "01.12.2025",
                "Samsung Corp.", "Korea", 19599, true);
    }

    public void printProducts() {
        System.out.println("Массив товаров:");
        for (int i = 0; i < productArray.length; i++) {
            System.out.println("Товар " + (i + 1) + ":");

            }
        }
    }







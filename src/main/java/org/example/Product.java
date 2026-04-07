package org.example;

public class Product {
    private String name;
    private String releaseDate;
    private String manufacturer;
    private String country;
    private int price;
    private boolean inStock;

      public Product(String name, String releaseDate, String manufacturer,
                   String country, int price, boolean inStock) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.inStock = inStock;
    }

       public void getInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата выпуска: " + releaseDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна: " + country);
        System.out.println("Цена: " + price + " руб.");
        System.out.println("В наличии: " + (inStock ? "Да" : "Нет"));
        System.out.println("------------------------");
    }
}
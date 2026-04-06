package org.example;

public class Product {
    private String name;
    private String productiondate;
    private String manufacturer;
    private String countryoforigin;
    private int price;
    private Boolean booking;

    public Product(String name, String productiondate, String manufacturer, String countryoforigin, int price, Boolean booking) {
        this.name = name;
        this.productiondate = productiondate;
        this.manufacturer = manufacturer;
        this.countryoforigin = countryoforigin;
        this.price = price;
        this.booking = booking;
    }

    public void getinfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productiondate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + countryoforigin);
        System.out.println("Цена: " + price + " руб.");
        System.out.println("Состояние бронирования: " +
                (booking? "Забронирован":"Свободен"));
    }
}
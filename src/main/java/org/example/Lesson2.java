package org.example;

public class Product {
    private String name;
    private String productiondate;
    private String manufacturer;
    private String countryoforigin;
    private int price;
    private Boolean booking;

    Product(String name, String productiondate, String manufacturer, String countryoforigin, int price, Boolean booking){
        this.name = name;
        this.productiondate = productiondate;
        this.manufacturer = manufacturer;
        this.countryoforigin = countryoforigin;
        this.price = price;
        this.booking = booking;
    }

    public void getinfo(){
        System.out.println();
    }
}

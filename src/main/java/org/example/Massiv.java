
package org.example;

class Massiv {
    Product[] productsArray = new Product[5];

       public void productArray() {
        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("Samsung S7", "04.07.2025",
                "Samsung Corp.", "Korea", 7899, true);
        productsArray[2] = new Product("Samsung a24", "01.07.2025",
                "Samsung Corp.", "Korea", 10599, true);
        productsArray[3] = new Product("Samsung a4", "11.02.2025",
                "Samsung Corp.", "Korea", 16599, true);
        productsArray[4] = new Product("Samsung z9", "01.12.2025",
                "Samsung Corp.", "Korea", 19599, true);
    }

    public void displayAllProducts() {
        System.out.println("Массив товаров:");
        for (int i = 0; i < productsArray.length; i++) {
            System.out.println("Товар №" + (i + 1) + ":");
            productsArray[i].getInfo();
        }
    }
}





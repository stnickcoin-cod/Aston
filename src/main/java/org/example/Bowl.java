package org.example;

public class Bowl {
    private int foodAmount;
    public Bowl(int initialFood) {
        if (initialFood < 0) {
            throw new IllegalArgumentException("Количество еды не может быть отрицательным");
        }
        this.foodAmount = initialFood;
    }
    public boolean takeFood(int amount) {
        if (amount < 0) {
            System.out.println("Нельзя взять отрицательное количество еды: " + amount);
            return false;
        }
        if (amount <= foodAmount) {
            foodAmount -= amount;
            return true;
        } else {
            return false;
        }
    }
    public void addFood(int amount) {
        if (amount < 0) {
            System.out.println("Нельзя добавить отрицательное количество еды: " + amount);
            return;
        }
        foodAmount += amount;
        System.out.println("В миску добавлено " + amount + " единиц еды. Теперь в миске: " + foodAmount);
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}
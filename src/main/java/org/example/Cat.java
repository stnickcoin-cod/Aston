package org.example;

public class Cat extends Animal {
    private boolean isFull;
    private static int catCount = 0;

    public Cat(String name) {
        super(name, 200, 0); // Кот: бег 200 м, плавание 0 м
        this.isFull = false;
        catCount++;
    }
    public void eat(Bowl bowl, int foodAmount) {
        if (foodAmount < 0) {
            System.out.println(name + " не может съесть отрицательное количество еды: " + foodAmount);
            return;
        }
        if (bowl.takeFood(foodAmount)) {
            isFull = true;
            System.out.println(name + " поел и теперь сыт.");
        } else {
            System.out.println(name + " не смог поесть — недостаточно еды в миске.");
        }
    }
    public boolean isFull() {
        return isFull;
    }
    public String getName() {
        return name;
    }
    public static int getCatCount() {
        return catCount;
    }
}
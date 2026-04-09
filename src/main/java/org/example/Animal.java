package org.example;

public abstract class Animal {
    protected String name;
    protected int maxRunDistance;
    protected int maxSwimDistance;
    private static int animalCount = 0;

    public Animal(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        animalCount++;
    }
        public void run(int distance) {
        if (distance < 0) {
            System.out.println(name + " не может пробежать отрицательное расстояние: " + distance + " м.");
            return;
        }
        if (distance <= maxRunDistance) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance +
                    " м. (максимум: " + maxRunDistance + " м.)");
        }
    }
       public void swim(int distance) {
        if (distance < 0) {
            System.out.println(name + " не может проплыть отрицательное расстояние: " + distance + " м.");
            return;
        }
        if (maxSwimDistance > 0 && distance <= maxSwimDistance) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else if (maxSwimDistance == 0) {
            System.out.println(name + " не умеет плавать!");
        } else {
            System.out.println(name + " не может проплыть " + distance +
                    " м. (максимум: " + maxSwimDistance + " м.)");
        }
    }
        public static int getAnimalCount() {
        return animalCount;
    }
}
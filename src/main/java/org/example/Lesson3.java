package org.example;

public class Lesson3 {
    public static void main(String[] args) {

        Dog dogBobik = new Dog("Бобик");
        Cat catMurzik = new Cat("Мурзик");
        Cat catBarsik = new Cat("Барсик");

        System.out.println("=== ТЕСТИРОВАНИЕ ДЕЙСТВИЙ ЖИВОТНЫХ ===");
        dogBobik.run(150);
        dogBobik.swim(5);
        catMurzik.run(100);
        catBarsik.swim(3);
        dogBobik.run(-50);
        catMurzik.swim(-10);
        System.out.println("\n=== СТАТИСТИКА СОЗДАННЫХ ЖИВОТНЫХ ===");
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Котов: " + Cat.getCatCount());
        System.out.println("Собак: " + Dog.getDogCount());

        System.out.println("\n=== ТЕСТИРОВАНИЕ МИСКИ И КОТОВ ===");
        Bowl bowl = new Bowl(15);

        Cat[] cats = {catMurzik, catBarsik, new Cat("Васька")};

        for (Cat cat : cats) {
            cat.eat(bowl, 10);
        }
        System.out.println("\n=== ИНФОРМАЦИЯ О СЫТОСТИ КОТОВ ===");
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " сыт: " + cat.isFull());
        }
        System.out.println("\n=== ДОБАВЛЕНИЕ ЕДЫ В МИСКУ ===");
        bowl.addFood(20);
        cats[2].eat(bowl, 15);
        System.out.println(cats[2].getName() + " сыт: " + cats[2].isFull());
    }
}

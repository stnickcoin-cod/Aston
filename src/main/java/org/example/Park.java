package org.example;

import java.util.ArrayList;
import java.util.List;

public class Park {
    private String name;
    private List<Attraction> attractions;

    public Park(String name) {
        this.name = name;
        this.attractions = new ArrayList<>();
    }

    public class Attraction {
        private String attractionName;
        private String workingHours;
        private double cost;

        public Attraction(String attractionName, String workingHours, double cost) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void printInfo() {
            System.out.println("Название аттракциона: " + attractionName);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + cost + " руб.");
            System.out.println("---");
        }

        public String getAttractionName() {
            return attractionName;
        }
        public String getWorkingHours() {
            return workingHours;
        }
        public double getCost() {
            return cost;
        }
    }

    public void addAttraction(String name, String hours, double cost) {
        Attraction attraction = new Attraction(name, hours, cost);
        attractions.add(attraction);
    }

    public void displayAllAttractions() {
        System.out.println("Парк: " + name);
        System.out.println("Список аттракционов:");
        System.out.println("=================");

        if (attractions.isEmpty()) {
            System.out.println("В парке пока нет аттракционов.");
        } else {
            for (int i = 0; i < attractions.size(); i++) {
                System.out.println("Аттракцион №" + (i + 1) + ":");
                attractions.get(i).printInfo();
            }
        }
    }
}
package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat("Barsik", 90);


        Cat cat1 = new Cat("Барсик", 35);
        Cat cat2 = new Cat("Пушок", 50);
        Cat cat3 = new Cat("Персик", 35);
        Cat cat4 = new Cat("Черныш", 10);
        Cat cat5 = new Cat("Рыжик", 70);

        List<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);

        List<Cat> hungryCats = new ArrayList<>();
        List<Cat> newHungryCats = new ArrayList<>();

        Plate plate = new Plate(100);


        plate.info();

        checkCats(cats, hungryCats, plate);
        plate.info();
        plate.plateIncrease(100);
        plate.info();
        checkCats(hungryCats, newHungryCats, plate);
////        System.out.println(hungryCats);
//            for (Cat catt : hungryCats) {
//                System.out.println(catt.getName());
//            }
        plate.info();
    }

    private static void checkCats(List<Cat> cats, List<Cat> hungryCats, Plate plate) {
        for (Cat cat : cats) {
//            System.out.println(cat.printCat(cat.getName(), cat.isSatiety()));
            if (!cat.isSatiety() && plate.getFood() >= cat.getAppetite()) {
                cat.eat(plate);
            } else {
                hungryCats.add(cat);
            }
            System.out.println(cat.printCat());
        }
    }
}

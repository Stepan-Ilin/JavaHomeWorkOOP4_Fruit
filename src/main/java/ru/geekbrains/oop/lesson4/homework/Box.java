package ru.geekbrains.oop.lesson4.homework;

import java.util.ArrayList;
import java.util.Comparator;

public class Box<T extends Fruit> {

    private final ArrayList<T> fruits = new ArrayList<>();


    public float getBoxWeight() {
        float totalWeight = 0;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public boolean compare(Box<?> otherBox) {
        return this.getBoxWeight() == otherBox.getBoxWeight();
    }
    public void transferFruitsTo(Box<T> otherBox) {
        for (T fruit : fruits) {
            otherBox.addFruit(fruit);
        }
        fruits.clear();
    }

}

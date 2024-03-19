package ru.geekbrains.oop.lesson4.homework;

public abstract class Fruit implements Comparable<Fruit>{

    protected float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Fruit o) {
        if(this.weight == o.weight) return 0;
        else if (this.weight > o.weight) return 1;
        else return -1;
    }
}

package ru.geekbrains.oop.lesson4.homework;

public class Program {

    /**
     Домашняя работа, задача:
     ========================

     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
     */
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<>();
        fruitBox.addFruit(new Apple());
        fruitBox.addFruit(new Orange());
        fruitBox.addFruit(new Orange());

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        Box<Orange> orangeOtherBox = new Box<>();
        orangeOtherBox.addFruit(new Orange());
        orangeOtherBox.addFruit(new Orange());
        orangeOtherBox.addFruit(new Orange());

        System.out.println("Вес ящика яблок: " + appleBox.getBoxWeight());
        System.out.println("Вес ящика фруктов: " + fruitBox.getBoxWeight());
        System.out.println("Вес ящика апельсинов: " + orangeBox.getBoxWeight());
        System.out.println("Вес другого ящика апельсинов: " + orangeOtherBox.getBoxWeight());

        System.out.println("Результат сравнения весов ящиков с апельсинов и с яблоками: " + (orangeBox.compare(appleBox) ? " равны" : "не равны"));
        System.out.println("Результат сравнения весов ящиков с фруктами и с яблоками: " + (fruitBox.compare(appleBox) ? " равны" : "не равны"));

        orangeBox.transferFruitsTo(orangeOtherBox);
        System.out.println("Пересыпаем апельсины из ящика в другой ящик");


        System.out.println("Вес ящика апельсинов: " + orangeBox.getBoxWeight());
        System.out.println("Вес другого ящика апельсинов: " + orangeOtherBox.getBoxWeight());

    }




}

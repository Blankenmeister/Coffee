package org.example;

public class Main {
    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();

        Coffee espresso = coffeeFactory.createCoffee("espresso");
        System.out.println(espresso.makeCoffee());

        Coffee latteCoffee = coffeeFactory.createCoffee("latte");
        System.out.println(latteCoffee.makeCoffee());

    }
}
package org.example;

public class CoffeeFactory {

    public Coffee createCoffee(String type)  {
        if (type.equalsIgnoreCase("espresso")) {
            return new Espresso();
        } else if (type.equalsIgnoreCase("latte")) {
            return new LatteCoffee();
        } else {
            throw new IllegalArgumentException("Unknown coffee type: " + type);

        }
    }

}

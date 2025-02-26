package dev.coffee;

import org.example.Coffee;
import org.example.CoffeeFactory;
import org.example.Espresso;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoffeeFactoryTest {

    @Test
    public void testCreateEspresso() {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee coffee = coffeeFactory.createCoffee("espresso");

        assertNotNull(coffee, "L'objet Coffee ne doit pas être null");
        assertInstanceOf(Espresso.class, coffee, "L'objet doit être une instance de Espresso");
        assertEquals("The espresso is ready", coffee.makeCoffee(), "Le message doit correspondre");
    }

    @Test
    public void testInvalidCoffeeType() {
        CoffeeFactory coffeeFactory = new CoffeeFactory();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            coffeeFactory.createCoffee("cream"); // Type inconnu
        });

        assertEquals("Unknown coffee type: cream", exception.getMessage(), "Le message d'erreur doit être correct");
    }


}

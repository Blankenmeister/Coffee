package dev.coffee;
import org.example.CoffeeManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;


public class CoffeeManagerTest {

    @Test
    public void testSingletonSingleInstance() {
        CoffeeManager instance1 = CoffeeManager.getInstance();
        CoffeeManager instance2 = CoffeeManager.getInstance();

        // Vérifie que les deux références pointent vers la même instance
        assertSame(instance1, instance2, "Les instances doivent être identiques");
    }

    @Test
    public void testSingletonNotNull() {
        CoffeeManager instance = CoffeeManager.getInstance();

        // Vérifie que getInstance() ne retourne jamais null
        assertNotNull(instance, "L'instance ne doit pas être null");
    }
}

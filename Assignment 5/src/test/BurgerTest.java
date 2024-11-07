package test;

import restaurant.Burger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BurgerTest {
    @Test
    public void testBurgerCost() {
        Burger burger = new Burger();
        assertEquals(6.50, burger.getCost(), 0.01);
    }
}

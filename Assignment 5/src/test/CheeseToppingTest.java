package test;

import restaurant.Burger;
import restaurant.CheeseTopping;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheeseToppingTest {
    @Test
    public void testCheeseTopping() {
        CheeseTopping burgerWithCheese = new CheeseTopping(new Burger());
        assertEquals(7.50, burgerWithCheese.getCost(), 0.01);
    }
}

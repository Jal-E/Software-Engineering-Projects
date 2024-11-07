package test;

import restaurant.Fries;
import restaurant.ChickenTopping;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChickenToppingTest {
    @Test
    public void testChickenTopping() {
        ChickenTopping FriesWithChicken = new ChickenTopping(new Fries());
        assertEquals(6.00, FriesWithChicken.getCost(), 0.01);
    }
}

package test;

import restaurant.Fries;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FriesTest {
    @Test
    public void testFriesCost() {
        Fries fries = new Fries();
        assertEquals(3.50, fries.getCost(), 0.01);
    }
}

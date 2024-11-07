package test;

import restaurant.HotDog;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HotDogTest {
    @Test
    public void testHotDogCost() {
        HotDog hotDog = new HotDog();
        assertEquals(3.50, hotDog.getCost(), 0.01);
    }
}

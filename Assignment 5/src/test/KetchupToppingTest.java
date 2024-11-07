package test;

import restaurant.HotDog;
import restaurant.KetchupTopping;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KetchupToppingTest {
    @Test
    public void testKetchupTopping() {
        KetchupTopping hotDogWithKetchup = new KetchupTopping(new HotDog());
        assertEquals(3.75, hotDogWithKetchup.getCost(), 0.01);
    }
}

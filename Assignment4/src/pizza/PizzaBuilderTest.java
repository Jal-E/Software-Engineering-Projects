package pizza;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PizzaBuilderTest {

    @Test
    public void testSetSize() {
        Pizza pizza = new Pizza.PizzaBuilder().setSize("Medium").build();
        assertEquals("Medium", pizza.getSize());
    }

    @Test
    public void testAddTopping() {
        Pizza pizza = new Pizza.PizzaBuilder().setSize("Small").addTopping("Pepperoni").build();
        assertTrue(pizza.getToppings().contains("Pepperoni"));
    }

    @Test
    public void testBuild() {
        Pizza pizza = new Pizza.PizzaBuilder().setSize("Large").addTopping("Mushrooms").build();
        assertEquals("Large", pizza.getSize());
        assertTrue(pizza.getToppings().contains("Mushrooms"));
    }
}

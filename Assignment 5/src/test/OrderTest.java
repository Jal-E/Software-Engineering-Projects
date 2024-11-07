package test;

import restaurant.Burger;
import restaurant.Fries;
import restaurant.Order;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {
    @Test
    public void testTotalCost() {
        Order order = new Order();
        order.addItem(new Burger());
        order.addItem(new Fries());
        assertEquals(10.00, order.getTotalCost(), 0.01);
    }
}

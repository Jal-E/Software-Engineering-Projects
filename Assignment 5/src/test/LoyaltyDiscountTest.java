package test;

import restaurant.LoyaltyDiscount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoyaltyDiscountTest {
    @Test
    public void testApplyDiscount() {
        LoyaltyDiscount discount = new LoyaltyDiscount();
        assertEquals(8.50, discount.applyDiscount(10.00, "GOLD"), 0.01);
        assertEquals(9.00, discount.applyDiscount(10.00, "SILVER"), 0.01);
    }
}

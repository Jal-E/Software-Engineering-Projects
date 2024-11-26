import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DriverTest {
    private Driver driver;

    @BeforeEach
    void setup() {
        // Initialize Driver and add snacks
        driver = new Driver();
        driver.addSnack(new Snack("Coke", 1.5, 5));
        driver.addSnack(new Snack("Pepsi", 1.5, 5));
        driver.addSnack(new Snack("Cheetos", 2.0, 5));
        driver.addSnack(new Snack("Doritos", 2.0, 5));
        driver.addSnack(new Snack("KitKat", 1.0, 5));
        driver.addSnack(new Snack("Snickers", 1.5, 1)); // Only 1 Snickers available
    }

    @Test
    void testDispenseSnackSuccessfully() {
        // Select Coke and insert exact money
        driver.selectSnack("Coke");
        driver.insertMoney(1.5);
        driver.handleSnackRequest("Coke");

        // Verify Coke quantity decreased
        assertEquals(4, driver.getSelectedSnack().getQuantity());
        // Verify money reset after transaction
        assertEquals(0, driver.getInsertedMoney());
    }

    @Test
    void testOutOfStockScenario() {
        // Select and dispense the last Snickers
        driver.selectSnack("Snickers");
        driver.insertMoney(1.5);
        driver.handleSnackRequest("Snickers");

        // Try to dispense Snickers again (should fail)
        driver.selectSnack("Snickers");
        driver.insertMoney(1.5);
        driver.handleSnackRequest("Snickers");

        // Verify Snickers quantity is 0
        assertEquals(0, driver.getSelectedSnack().getQuantity());
        // Verify money is refunded
        assertEquals(0, driver.getInsertedMoney());
    }

    @Test
    void testInsufficientFunds() {
        // Select Cheetos but insert less money
        driver.selectSnack("Cheetos");
        driver.insertMoney(1.0); // Price is 2.0
        driver.handleSnackRequest("Cheetos");

        // Verify quantity remains unchanged
        assertEquals(5, driver.getSelectedSnack().getQuantity());
        // Verify money is still stored
        assertEquals(1.0, driver.getInsertedMoney());
    }
}

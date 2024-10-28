package Meal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MealFactoryTest {

    @Test
    public void testCreateCarb() {
        Carbs carb = (Carbs) MealFactory.getInstance().createCarb("No Restriction");
        assertNotNull(carb);
        assertTrue(carb.getFood() != null && !carb.getFood().isEmpty());
    }

    @Test
    public void testCreateProtein() {
        Protein protein = (Protein) MealFactory.getInstance().createProtein("No Restriction");
        assertNotNull(protein);
        assertTrue(protein.getFood() != null && !protein.getFood().isEmpty());
    }

    @Test
    public void testCreateFat() {
        Fats fat = (Fats) MealFactory.getInstance().createFat("No Restriction");
        assertNotNull(fat);
        assertTrue(fat.getFood() != null && !fat.getFood().isEmpty());
    }

    @Test
    public void testSingletonInstance() {
        MealFactory instance1 = MealFactory.getInstance();
        MealFactory instance2 = MealFactory.getInstance();
        assertEquals(instance1, instance2);
    }
}

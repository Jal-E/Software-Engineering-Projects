package Meal;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CarbFactory {
    private static final List<String> CARBS = Arrays.asList("Bread", "Pasta", "Rice", "Potato", "Pistachio");

    public Carbs createCarb(String dietPlan) {
        Random random = new Random();
        String carb = "";

        switch (dietPlan) {
            case "Paleo":
                carb = "Pistachio"; // Only allowed carb for Paleo
                break;
            case "Nut Allergy":
                carb = CARBS.stream().filter(c -> !c.equals("Pistachio")).findAny().orElse("Potato");
                break;
            default:
                carb = CARBS.get(random.nextInt(CARBS.size()));
                break;
        }
        return new Carbs(carb);
    }
}

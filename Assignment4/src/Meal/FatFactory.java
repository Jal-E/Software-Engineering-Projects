package Meal;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FatFactory {
    private static final List<String> FATS = Arrays.asList("Avocado", "Cheese", "Sour cream", "Peanuts");

    public Fats createFat(String dietPlan) {
        Random random = new Random();
        String fat = "";

        switch (dietPlan) {
            case "Vegan":
            case "Paleo":
                fat = FATS.stream().filter(f -> !f.equals("Cheese") && !f.equals("Sour cream")).findAny().orElse("Avocado");
                break;
            case "Nut Allergy":
                fat = FATS.stream().filter(f -> !f.equals("Peanuts")).findAny().orElse("Avocado");
                break;
            default:
                fat = FATS.get(random.nextInt(FATS.size()));
                break;
        }
        return new Fats(fat);
    }
}

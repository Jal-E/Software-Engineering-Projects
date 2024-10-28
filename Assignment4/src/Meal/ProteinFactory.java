package Meal;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ProteinFactory {
    private static final List<String> PROTEINS = Arrays.asList("Chicken", "Beef", "Fish", "Tofu", "Lentils");

    public Protein createProtein(String dietPlan) {
        Random random = new Random();
        String protein = "";

        switch (dietPlan) {
            case "Vegan":
                protein = PROTEINS.stream().filter(p -> !p.equals("Chicken") && !p.equals("Beef") && !p.equals("Fish")).findAny().orElse("Lentils");
                break;
            case "Paleo":
                protein = PROTEINS.stream().filter(p -> !p.equals("Tofu")).findAny().orElse("Chicken");
                break;
            default:
                protein = PROTEINS.get(random.nextInt(PROTEINS.size()));
                break;
        }
        return new Protein(protein);
    }
}

package Meal;

import java.util.Random;

public class MealDriver {
    public static void main(String[] args) {
        MealFactory mealFactory = MealFactory.getInstance();
        String[] dietPlans = {"No Restriction", "Paleo", "Vegan", "Nut Allergy"};
        Random random = new Random();

        // Generate meals for 6 customers
        for (int customer = 1; customer <= 6; customer++) {
            // Randomly select a diet plan for the customer
            String dietPlan = dietPlans[random.nextInt(dietPlans.length)];
            System.out.println("\nCustomer " + customer + " - Diet Plan: " + dietPlan);

            // Create a meal based on the selected diet plan
            Macronutrients carb = mealFactory.createCarb(dietPlan);
            Macronutrients protein = mealFactory.createProtein(dietPlan);
            Macronutrients fat = mealFactory.createFat(dietPlan);

            // Display the meal components
            System.out.println("Carb: " + carb.getFood());
            System.out.println("Protein: " + protein.getFood());
            System.out.println("Fat: " + fat.getFood());
        }
    }
}

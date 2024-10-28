package Meal;

import java.util.Random;

public class MealDriver {
    public static void main(String[] args) {
        MealFactory mealFactory = MealFactory.getInstance();
        String[] dietPlans = {"No Restriction", "Paleo", "Vegan", "Nut Allergy"};
        Random random = new Random();

        for (int customer = 1; customer <= 6; customer++) {
            String dietPlan = dietPlans[random.nextInt(dietPlans.length)];
            System.out.println("\nCustomer " + customer + " - Diet Plan: " + dietPlan);

            Macronutrients carb = mealFactory.createCarb(dietPlan);
            Macronutrients protein = mealFactory.createProtein(dietPlan);
            Macronutrients fat = mealFactory.createFat(dietPlan);

            System.out.println("Carb: " + carb.getFood());
            System.out.println("Protein: " + protein.getFood());
            System.out.println("Fat: " + fat.getFood());
        }
    }
}

package Meal;

public class MealFactory {
    private static MealFactory instance;

    private CarbFactory carbFactory = new CarbFactory();
    private ProteinFactory proteinFactory = new ProteinFactory();
    private FatFactory fatFactory = new FatFactory();

    private MealFactory() {}

    public static MealFactory getInstance() {
        if (instance == null) {
            instance = new MealFactory();
        }
        return instance;
    }

    public Macronutrients createCarb(String dietPlan) {
        return carbFactory.createCarb(dietPlan);
    }

    public Macronutrients createProtein(String dietPlan) {
        return proteinFactory.createProtein(dietPlan);
    }

    public Macronutrients createFat(String dietPlan) {
        return fatFactory.createFat(dietPlan);
    }
}

package Meal;

public class Carbs extends Macronutrients {
    private String food;

    public Carbs(String food) {
        this.food = food;
    }

    @Override
    public String getFood() {
        return food;
    }
}

package Meal;

public class Fats extends Macronutrients {
    private String food;

    public Fats(String food) {
        this.food = food;
    }

    @Override
    public String getFood() {
        return food;
    }
}

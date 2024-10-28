package Meal;

public class Protein extends Macronutrients {
    private String food;

    public Protein(String food) {
        this.food = food;
    }

    @Override
    public String getFood() {
        return food;
    }
}

package restaurant;

public class CheeseTopping implements FoodItem {
    private FoodItem foodItem;

    public CheeseTopping(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    @Override
    public double getCost() {
        return foodItem.getCost() + 1.00; // Extra cost for cheese
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription() + ", Cheese";
    }
}

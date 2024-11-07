package restaurant;

public class KetchupTopping implements FoodItem {
    private FoodItem foodItem;

    public KetchupTopping(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    @Override
    public double getCost() {
        return foodItem.getCost() + 0.25; // Extra cost for ketchup
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription() + ", Ketchup";
    }
}

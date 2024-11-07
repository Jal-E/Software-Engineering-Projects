package restaurant;

public class ChickenTopping implements FoodItem {
    private FoodItem foodItem;

    public ChickenTopping(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    @Override
    public double getCost() {
        return foodItem.getCost() + 2.50; // Extra cost for Chicken
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription() + ", Chicken";
    }
}

package restaurant;

public class Fries implements FoodItem {
    @Override
    public double getCost() {
        return 3.50; // Base price for fries
    }

    @Override
    public String getDescription() {
        return "Fries";
    }
}

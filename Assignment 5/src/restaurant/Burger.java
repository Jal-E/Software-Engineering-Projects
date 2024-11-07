package restaurant;

public class Burger implements FoodItem {
    @Override
    public double getCost() {
        return 6.50; // Base price for a burger
    }

    @Override
    public String getDescription() {
        return "Burger";
    }
}

package restaurant;

public class LoyaltyDiscount {
    public double applyDiscount(double totalCost, String loyaltyLevel) {
        switch (loyaltyLevel) {
            case "GOLD":
                return totalCost * 0.85; // 15% discount for GOLD members
            case "SILVER":
                return totalCost * 0.90; // 10% discount for SILVER members
            default:
                return totalCost; // No discount
        }
    }
}

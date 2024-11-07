package restaurant;

import java.text.DecimalFormat;

public class RestaurantApp {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");

        // Create a few sample orders
        System.out.println("Customer 1 Order:");
        Order order1 = new Order();
        FoodItem burgerWithCheese = new CheeseTopping(new Burger());
        FoodItem friesWithChicken = new ChickenTopping(new Fries());
        order1.addItem(burgerWithCheese);
        order1.addItem(friesWithChicken);
        order1.displayOrder();

        LoyaltyDiscount discount = new LoyaltyDiscount();
        double totalCost1 = order1.getTotalCost();
        double discountedCost1 = discount.applyDiscount(totalCost1, "GOLD");
        System.out.printf("Total with GOLD discount: $%.2f%n", discountedCost1);
        System.out.println("\n-------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------\n");

        System.out.println("Customer 2 Order:");
        Order order2 = new Order();
        FoodItem hotDogWithKetchup = new KetchupTopping(new HotDog());
        FoodItem friesWithCheese = new CheeseTopping(new Fries());
        order2.addItem(hotDogWithKetchup);
        order2.addItem(friesWithCheese);
        order2.displayOrder();

        double totalCost2 = order2.getTotalCost();
        double discountedCost2 = discount.applyDiscount(totalCost2, "SILVER");
        System.out.printf("Total with SILVER discount: $%.2f%n", discountedCost2);
        System.out.println("\n-------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------\n");


        System.out.println("Customer 3 Order:");
        Order order4 = new Order();
        FoodItem plainFries = new Fries();
        FoodItem plainBurger = new Burger();
        order4.addItem(plainFries);
        order4.addItem(plainBurger);
        order4.displayOrder();

        double totalCost4 = order4.getTotalCost();
        double discountedCost4 = discount.applyDiscount(totalCost4, "NONE");
        System.out.printf("Total with no discount: $%.2f%n", discountedCost4);
    }
}

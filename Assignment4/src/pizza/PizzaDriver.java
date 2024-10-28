package pizza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PizzaDriver {
    private static final List<String> AVAILABLE_TOPPINGS = Arrays.asList(
            "Pepperoni", "Sausage", "Mushrooms", "Bacon", "Onions", "Extra Cheese", "Peppers",
            "Chicken", "Olives", "Spinach", "Tomato", "Basil", "Beef", "Ham", "Pesto",
            "Spicy Pork", "Pineapple"
    );

    public static void main(String[] args) {
        // Pizza Hut specific pizzas with different topping counts
        System.out.println("Initial Pizza Hut Pizzas:");
        Pizza pizzaHutLarge = new PizzaHut("Large", getRandomToppings(3));
        pizzaHutLarge.eat();

        Pizza pizzaHutMedium = new PizzaHut("Medium", getRandomToppings(6));
        pizzaHutMedium.eat();

        Pizza pizzaHutSmall = new PizzaHut("Small", getRandomToppings(9));
        pizzaHutSmall.eat();

        // Additional Pizza Hut pizzas
        System.out.println("\nAdditional Pizza Hut Pizzas:");
        Pizza anotherPizzaHutLarge = new PizzaHut("Large", getRandomToppings(3));
        anotherPizzaHutLarge.eat();

        Pizza anotherPizzaHutSmall = new PizzaHut("Small", getRandomToppings(2));
        anotherPizzaHutSmall.eat();

        // Little Caesars specific pizzas
        System.out.println("\nLittle Caesars Pizzas:");
        Pizza littleCaesarsMedium = new LittleCaesars("Medium", getRandomToppings(8));
        littleCaesarsMedium.eat();

        Pizza littleCaesarsSmall = new LittleCaesars("Small", getRandomToppings(6));
        littleCaesarsSmall.eat();

        // Dominos specific pizzas
        System.out.println("\nDominos Pizzas:");
        Pizza dominosLarge = new Dominos("Large", getRandomToppings(3));
        dominosLarge.eat();

        Pizza dominosSmall = new Dominos("Small", getRandomToppings(1));
        dominosSmall.eat();
    }

    // Helper method to get random toppings
    private static List<String> getRandomToppings(int count) {
        List<String> toppings = new ArrayList<>(AVAILABLE_TOPPINGS);
        Collections.shuffle(toppings);
        return toppings.subList(0, count);
    }
}

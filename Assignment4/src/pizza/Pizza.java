package pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String size;
    private List<String> toppings;
    private String chainName;

    // Public constructor for subclasses to use directly
    public Pizza(String size, List<String> toppings, String chainName) {
        this.size = size;
        this.toppings = toppings;
        this.chainName = chainName;
    }

    // Private constructor used by the PizzaBuilder
    private Pizza(PizzaBuilder builder) {
        this.size = builder.size;
        this.toppings = builder.toppings;
        this.chainName = builder.chainName;
    }

    public void eat() {
        System.out.println("Eating a " + size + " pizza from " + chainName + " with toppings: " + String.join(", ", toppings));
    }

    public static class PizzaBuilder {
        private String size;
        private List<String> toppings = new ArrayList<>();
        private String chainName;

        public PizzaBuilder setSize(String size) {
            this.size = size;
            return this;
        }

        public PizzaBuilder setChainName(String chainName) {
            this.chainName = chainName;
            return this;
        }

        public PizzaBuilder setToppings(List<String> toppings) {
            this.toppings = toppings;
            return this;
        }

        public PizzaBuilder addTopping(String topping) {
            this.toppings.add(topping);
            return this;
        }


        public Pizza build() {
            return new Pizza(this);
        }
    }

    // Getters for unit testing (optional)
    public String getSize() {
        return size;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public String getChainName() {
        return chainName;
    }
}

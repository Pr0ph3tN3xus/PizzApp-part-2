public class Pizza {
    private String[] toppings;
    private int numToppings;
    private double price;

    // Constructor
    public Pizza(String[] toppings, int numToppings) {
        this.toppings = new String[numToppings];
        this.numToppings = Math.min(numToppings, 10); // topping cap
        System.arraycopy(toppings, 0, this.toppings, 0, this.numToppings);

        // Calculate price
        this.price = 14.0 + 2.0 * this.numToppings;
    }

    // toString() method
    @Override
    public String toString() {
        StringBuilder description = new StringBuilder("Pizza with ");
        for (int i = 0; i < numToppings; i++) {
            description.append(toppings[i]);
            if (i < numToppings - 1) {
                description.append(", ");
            }
        }
        description.append(". Price: $").append(price);
        return description.toString();
    }

    public double getPrice() {
        return price;
    }
}
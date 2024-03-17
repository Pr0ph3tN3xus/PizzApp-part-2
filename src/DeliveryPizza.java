public class DeliveryPizza extends Pizza {
    private double deliveryFee;
    private String deliveryAddress;

    // Constructor
    public DeliveryPizza(String[] toppings, String deliveryAddress, int numToppings) {
        super(toppings, numToppings);
        this.deliveryAddress = deliveryAddress;

        // Set delivery fee based on the price of the pizza
        if (getPrice() > 18.0) {
            this.deliveryFee = 3.0;
        } else {
            this.deliveryFee = 5.0;
        }
    }

    // Override toString() method
    @Override
    public String toString() {
        return super.toString() + ", Delivery Fee: $" + deliveryFee + ", Delivery Address: " + deliveryAddress;
    }

    public double getDeliveryFee() {
        return deliveryFee;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }
}
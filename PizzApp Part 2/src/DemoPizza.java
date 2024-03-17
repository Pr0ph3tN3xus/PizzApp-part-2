import java.util.Scanner;

public class DemoPizza {
    public static final String QUIT = "QUIT";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for toppings
        String[] toppings = new String[10];
        int numToppings = 0;
        while (numToppings < 10) {
            System.out.print("Enter topping (or QUIT to finish): ");
            String topping = scanner.nextLine();
            if (topping.equalsIgnoreCase(QUIT)) {
                break;
            }
            toppings[numToppings++] = topping;
        }

        // Prompt for delivery
        System.out.print("Do you want the pizza to be delivered? (yes/no): ");
        String deliveryChoice = scanner.nextLine();

        Pizza pizza;
        if (deliveryChoice.equalsIgnoreCase("yes")) {
            System.out.print("Enter delivery address: ");
            String deliveryAddress = scanner.nextLine();
            pizza = new DeliveryPizza(toppings, deliveryAddress, numToppings);
        } else {
            pizza = new Pizza(toppings, numToppings);
        }

        // Display pizza details
        System.out.println("\nPizza Details:");
        System.out.println("Toppings: ");
        for (int i = 0; i < numToppings; i++) {
            System.out.println("- " + toppings[i]);
        }
        System.out.println("Price: $" + pizza.getPrice());

        if (pizza instanceof DeliveryPizza) {
            DeliveryPizza deliveryPizza = (DeliveryPizza) pizza;
            System.out.println("Delivery Fee: $" + deliveryPizza.getDeliveryFee());
            System.out.println("Delivery Address: " + deliveryPizza.getDeliveryAddress());
        }

        scanner.close();
    }
}
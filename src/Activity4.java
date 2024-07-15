import java.util.Scanner;

public class Activity4 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                double bunTotal = 0.0;
                double coffeeTotal = 0.0;
                double cakeTotal = 0.0;
                double sandwichTotal = 0.0;
                double dessertTotal = 0.0;
                double highestTakings = 0.0;
                String highestType = "";

                while (true) {
                    System.out.println("Menu:");
                    System.out.println("1. Bun ($0.50)");
                    System.out.println("2. Coffee ($1.20)");
                    System.out.println("3. Cake ($1.50)");
                    System.out.println("4. Sandwich ($2.10)");
                    System.out.println("5. Dessert ($4.00)");
                    System.out.println("Enter 'end' to finish the day's input.");

                    System.out.print("Enter item sold: ");
                    String itemName = scanner.nextLine().toLowerCase();

                    if (itemName.equals("end")) {
                        break;
                    }
                    System.out.print("Enter quantity sold: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();

                    double itemTotal = 0.0;
                    switch (itemName) {
                        case "bun":
                            itemTotal = 0.50 * quantity;
                            bunTotal += itemTotal;
                            break;
                        case "coffee":
                            itemTotal = 1.20 * quantity;
                            coffeeTotal += itemTotal;
                            break;
                        case "cake":
                            itemTotal = 1.50 * quantity;
                            cakeTotal += itemTotal;
                            break;
                        case "sandwich":
                            itemTotal = 2.10 * quantity;
                            sandwichTotal += itemTotal;
                            break;
                        case "dessert":
                            itemTotal = 4.00 * quantity;
                            dessertTotal += itemTotal;
                            break;
                        default:
                            System.out.println("Invalid item. Please enter a valid item.");
                            break;
                    }

                    if (itemTotal > highestTakings) {
                        highestTakings = itemTotal;
                        highestType = itemName;
                    }
                }

                double totalTakings = bunTotal + coffeeTotal + cakeTotal + sandwichTotal + dessertTotal;

                System.out.println("Total Takings: $" + totalTakings);
                System.out.println("Highest Selling Item: " + highestType);
                scanner.close();
            }
        }


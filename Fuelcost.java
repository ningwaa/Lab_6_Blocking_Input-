import java.util.Scanner;

public class Fuelcost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gallonsInTank = 0.0;
        double fuelEfficiency = 0.0;
        double pricePerGallon = 0.0;

        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (scanner.hasNextDouble()) {
                gallonsInTank = scanner.nextDouble();
                if (gallonsInTank > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive value.");
                }
            } else {
                System.out.println("Invalid input. Please enter a double value.");
                scanner.next();
            }
        } while (true);


        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (scanner.hasNextDouble()) {
                fuelEfficiency = scanner.nextDouble();
                if (fuelEfficiency > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive value.");
                }
            } else {
                System.out.println("Invalid input. Please enter a double value.");
                scanner.next();
            }
        } while (true);

        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (scanner.hasNextDouble()) {
                pricePerGallon = scanner.nextDouble();
                if (pricePerGallon > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive value.");
                }
            } else {
                System.out.println("Invalid input. Please enter a double value.");
                scanner.next();
            }
        } while (true);

        double costPer100Miles = (100 / fuelEfficiency) * pricePerGallon;

        double distanceWithGas = gallonsInTank * fuelEfficiency;


        System.out.printf("Cost per 100 miles: $%.2f%n", costPer100Miles);
        System.out.printf("Distance the car can go with the gas in the tank: %.2f miles%n", distanceWithGas);

        scanner.close();
    }
}
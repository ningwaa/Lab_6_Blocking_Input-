import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;

        int userGuess = 0;

        do {
            System.out.print("Guess the number between 1 and 10: ");
            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();
                if (userGuess >= 1 && userGuess <= 10) {
                    break;
                } else {
                    System.out.println("Please enter a number between 1 and 10.");
                }
            } else {
                String trash = scanner.next();
                System.out.println("You entered an incorrect input: " + trash + ". Please enter an integer.");
            }
        } while (true);

        System.out.println("The random number was: " + randomNumber);


        if (userGuess < randomNumber) {
            System.out.println("Your guess was too low.");
        } else if (userGuess > randomNumber) {
            System.out.println("Your guess was too high.");
        } else {
            System.out.println("Congratulations! Your guess was on the money!");
        }

        scanner.close();
    }
}
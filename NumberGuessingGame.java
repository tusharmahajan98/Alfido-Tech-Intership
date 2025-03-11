import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Generates a number between 1 and 100
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        int guess = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've selected a number between 1 and 100. Try to guess it!");

        while (guess != randomNumber) {
            System.out.print("Enter your guess: ");

            // Validate input to ensure it's a number
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear invalid input
                continue;
            }

            guess = scanner.nextInt();
            attempts++;

            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the correct number: " + randomNumber);
                System.out.println("Total attempts: " + attempts);
                break;
            }
        }

        scanner.close();
    }
}

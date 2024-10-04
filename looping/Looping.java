package looping;

import java.util.Scanner;

public class Looping {

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Set the secret number to 50
        int secretNumber = 50; 
        
        // Initialize variables
        int guess = 0;
        int guessCount = 0;
        
        // Game loop: continues until the user guesses the correct number
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100:");

        while (guess != secretNumber) {
            // Get user's guess
            System.out.print("Enter your guess: "); // Added prompt for better user experience
            guess = scanner.nextInt();
            guessCount++;
            
            // Provide feedback on the guess
            if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            }
        }
        
        // User guessed the correct number
        System.out.println("Congratulations! You guessed the number in " + guessCount + " tries.");
        
        // Close the scanner
        scanner.close();
    }
}

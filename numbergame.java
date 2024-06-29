import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int roundsWon = 0;
        boolean playAgain;

        do {
            int randomNumber = random.nextInt(100) + 1;
            int attempts = 3;
            boolean guessedCorrectly = false;

            System.out.println("A number between 1 and 100 has been randomly generated.");
            System.out.println("You have 3 attempts to guess the number.");

            for (int i = 0; i < attempts; i++) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == randomNumber) {
                    System.out.println("Correct! You've guessed the number.");
                    guessedCorrectly = true;
                    roundsWon++;
                    break;
                } else if (userGuess < randomNumber) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Your guess is too high.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all your attempts. The correct number was: " + randomNumber);
            }

            System.out.print("Do you want to play another round? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");

        } while (playAgain);

        System.out.println("Game Over! You won " + roundsWon + " round(s).");
        scanner.close();
    }
}

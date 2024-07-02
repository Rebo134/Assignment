import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalAttempts = 0; // To track total attempts across all games
        int gamesPlayed = 0; // To count the number of games played
        boolean playAgain;

        do {
            int targetNumber = random.nextInt(100) + 1; // Random number between 1 and 100
            int maxAttempts = 7; // Reduced number of attempts to 7
            int attemptsUsed = 0; // To count attempts in current game
            boolean hasGuessedCorrectly = false;

            System.out.println("Guess the number between 1 and 100. You have " + maxAttempts + " attempts.");

            for (int attempt = 1; attempt <= maxAttempts; attempt++) {
                System.out.print("Attempt " + attempt + ": ");
                int userGuess = scanner.nextInt();
                attemptsUsed++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    hasGuessedCorrectly = true;
                    break;
                } else if (userGuess > targetNumber) {
                    if (userGuess - targetNumber > 10) {
                        System.out.println("Your guess is too high.");
                    } else {
                        System.out.println("Your guess is high.");
                    }
                } else {
                    if (targetNumber - userGuess > 10) {
                        System.out.println("Your guess is too low.");
                    } else {
                        System.out.println("Your guess is low.");
                    }
                }
            }

            if (!hasGuessedCorrectly) {
                System.out.println("Sorry, you've used all your attempts. The correct number was " + targetNumber);
            }

            totalAttempts += attemptsUsed; // Add attempts from this game to total
            gamesPlayed++; // Increment games played

            System.out.print("Do you want to play again? (yes/no): ");
            scanner.nextLine(); // Consume the newline character
            String response = scanner.nextLine();

            switch (response.toLowerCase()) {
                case "yes":
                    playAgain = true;
                    break;
                case "no":
                    playAgain = false;
                    break;
                default:
                    System.out.println("Invalid response. Exiting the game.");
                    playAgain = false;
                    break;
            }
        } while (playAgain);

        // After exiting the loop (when playAgain is false), show score card
        System.out.println("Total Games Played: " + gamesPlayed);
        System.out.println("Total Attempts Made: " + totalAttempts);
        System.out.println("Average Attempts per Game: " + (totalAttempts / (double) gamesPlayed));

        System.out.println("Thank you for playing!");
        scanner.close();
    }
}


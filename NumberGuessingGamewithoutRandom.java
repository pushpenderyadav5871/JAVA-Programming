import java.util.Scanner;

public class NumberGuessingGamewithoutRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int lowerRange = 1;
        int upperRange = 100;
        int maxAttempts = 5;
        int rounds = 0;
        int totalAttempts = 0;

        boolean playAgain = true;

        while (playAgain) {
            rounds++;
            System.out.println("\n--- Round " + rounds + " ---");
            long currentTime = System.currentTimeMillis();
            int secretNumber = (int) (currentTime % (upperRange - lowerRange + 1)) + lowerRange;
            int attempts = 0;

            while (attempts < maxAttempts) {
                System.out.print("Guess the number between " + lowerRange + " and " + upperRange + ": ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > secretNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number " + secretNumber +
                            " correctly in " + attempts + " attempts.");
                    totalAttempts += attempts;
                    break;
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " +
                        secretNumber + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");
        }

        System.out.println("\nGame over! You played " + rounds + " rounds and your total score is " +
                totalAttempts + " attempts.");
    }
}

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int number = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("Guess a number between 1 and 100");

        while (true) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess > number) {
                System.out.println("Too High! Try again.");
            } else if (guess < number) {
                System.out.println("Too Low! Try again.");
            } else {
                System.out.println("Correct! Attempts: " + attempts);
                break;
            }
        }

        scanner.close();
    }
}

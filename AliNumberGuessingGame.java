import java.util.Random;
import java.util.Scanner;

public class AliNumberGuessingGame {
    public static void main(String[] args) {
        // Step 1: Generate a random number
        Random random = new Random();
        int randomNumber = random.nextInt(5) + 1;

        // Step 2: Prompt the user for a guess
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 5:");

        // Step 3: Read the user's guess
        int guess = scanner.nextInt();

        // Step 4: Compare the user's guess with the random number
        while (guess != randomNumber) {
            // Step 5: Print a message encouraging the user to keep trying
            System.out.println("???????? GUESS RIGH WTF ???????!");
            guess = scanner.nextInt();
        }

        // Step 6: Print a message congratulating the user
        System.out.println("Ma boi you got it!");
    }
}
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    private static final int MAX_VALUE = 100;
    public static void main(String[] args) {
        int numberToGuess = new Random().nextInt(MAX_VALUE);
        for (int tries = 5; tries > 0; --tries) {
            System.out.println("Guess the number from 0 to 99: ");
            int userInput;
            try {
                userInput = getNumberFromUser();
            } catch (InputMismatchException e) {
                System.out.println("Invalid format");
                continue;
            }
            if (userInput >= MAX_VALUE || userInput < 0) {
                System.out.println("Wrong number, you need choose number from 0 to 99");
                continue;
            }
            if (userInput == numberToGuess) {
                System.out.println("You guessed it!");
                break;
            }
            printHint(userInput > numberToGuess ? "GREATER" : "LOWER");

            if (tries == 1) {
                System.out.println("Sorry you didn't guess the number, the answer was: " + numberToGuess);
                break;
            }
            System.out.println("Attempts left: " + (tries - 1));
            System.out.println("Please try again");
        }
        }
    private static int getNumberFromUser() {
            Scanner scan = new Scanner(System.in);
            return scan.nextInt();
    }
    private static void printHint(String hint) {
        System.out.println("Your number is " +hint+ " than the one you are trying to guess");
    }
}
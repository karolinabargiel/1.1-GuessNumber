import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        final int MAX_VALUE = 100;
        int numberToGuess = new Random().nextInt(MAX_VALUE);

        for (int numberOfTry = 5; numberOfTry > 0; --numberOfTry) {
            System.out.println("Guess the number from 0 to 99: ");
            Scanner scan = new Scanner(System.in);
            int userInput = scan.nextInt();
            if (userInput >= MAX_VALUE || userInput < 0) {
                System.out.println("Wrong number, you need choose number from 0 to 99");
            } else {
                if (userInput > numberToGuess) {
                    System.out.println("Your number is GREATER than the one you are trying to guess");
                } else if (userInput < numberToGuess) {
                    System.out.println("Your number is LOWER than the one you are trying to guess");
                } else {
                    System.out.println("You guessed it!");
                    break;
                }
                System.out.println("Attempts left: " + (numberOfTry - 1));
                if (numberOfTry > 1) {
                    System.out.println("Please try again");
                } else {
                    System.out.println("Sorry you didn't guess the number, the answer was: " + numberToGuess);
                }
            }
        }
    }
}
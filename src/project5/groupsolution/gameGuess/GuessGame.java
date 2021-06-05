package project5.groupsolution.gameGuess;

import java.util.Scanner;

public class GuessGame {

  /*
        Create a non-static method whose name is letsGuess().
        This method takes an int as a parameter, say secretNumber.
        Return type is void.

        In this method you must continue to guess number(s) until the you hit the correct number which is secretNumber.
        Method prints "Guess a number between 0 and 100: " in the beginning of the game.
        When the guess number is less than the secretNumber then print "Your number is small. Try a bigger number.".
        When the guess number is more than the secretNumber then print "Your number is big. Try a smaller number.".
        When the guess number is equal to the secretNumber than print "You won. Congrats!". And stop execution.

        The maximum number of guess attempts is 5.
        If the guesses reach to 5 than print "You lost! Better chance next time". And stop execution.

        Note:
         1) For guessing a number Scanner class is used.
         2) The method is not a static method.
     */

    static int counterForWon;
    static int counterForLost;

    public void letsGuess(int secretNumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess a number between 0 and 100: ");
//        int guessNumber;
        int counter = 0;

        do {
            counter++;
            int guessNumber = scanner.nextInt();
            if (guessNumber < secretNumber && counter != 5) {
                System.out.print("Your number is small. Try a bigger number.");
            } else if (guessNumber > secretNumber && counter != 5) {
                System.out.print("Your number is big. Try a smaller number.");
            } else if (guessNumber == secretNumber){
                counterForWon++;
                System.out.println("You won. Congrats!");
                counter = 0;
                break;
            }
        } while (counter < 5);

        if (counter == 5) {
            counterForLost++;
            System.out.println("You lost! Better chance next time");
        }
        printResult();
        if (again()) {
            letsGuess(secretNumber);
        }
    }

    public boolean again() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to play again?");
        String yesOrNo = scanner.nextLine();
        return yesOrNo.equalsIgnoreCase("Yes");
    }

    public void printResult() {
        System.out.println("You won " + counterForWon + " times and lost " + counterForLost + " times so far");
    }
}

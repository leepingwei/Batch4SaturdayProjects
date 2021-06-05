package project5.groupsolution.gameGuess;

import java.util.Random;

public class LetUsPlay {

    /*
        Create the main method.
        Create a random number between 0 and 100 inclusive.
        Call the letsGuess method of GuessGame class passing the random number generated as the argument.
        Enjoy your game!!!
      */

    // OPTIONAL CHALLENGE:
    // When the game is over, ask user if he/she wants to play again.
    // Print number of lost and won games. e.g. "You won 3 times and lost 2 times so far."
    // If "Yes" start the game again. If "No", end the execution.

    public static void main(String[] args) {

        Random random = new Random();
        int secretNumber = random.nextInt(101);

        GuessGame guessGame = new GuessGame();
        guessGame.letsGuess(secretNumber);
//        guessGame.letsGuess(50);
    }
}

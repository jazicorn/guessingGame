import java.util.*;

public class NumberGuesser{
    public static void main(String[] args) {

        do {
            playOneGame();
        } while(shouldPlayAgain());
    }

    /*
    playOneGame()
        return type void
        it implements a complete guessing game on range of 1 to 100
    */
    /*
        getUserResponseToGuess()
            "includes user prompt"is it <guess>? (h/l/c): "
            It should return a char
            includes following sig:
                public static char getUserResponseToGuess (int guess)
    */
    /*
        getMidpoint()
            should accept 2 integers
            returns the midpoint of two integers
                if two values in middle of the range then it should chose the smaller of the two
            includes the following signature:
                public static int getMidpoint (int low, int high)
    */

    // boolean return type
    public static boolean shouldPlayAgain() {
        Scanner input = new Scanner(System.in);
        // prompt user to determine if user wants to play again
        System.out.print("Want to go again? (y/n): ");
            // read in a character
            char response = input.nextLine().charAt(0);
            // then return if the character is a 'y'
            return (response == 'y');
        }
}


 
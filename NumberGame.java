/** Program:  Number Guessing Game
  * File:     NumberGame.java 
  * Summary:  Chooses a random # asks user to try and guess number in range.
  * Author:   Daniel Saad
  * Date:     11/25/18
*/

//Import scanner
import java.util.Scanner;
public class NumberGame {

    public static void main(String[] args) {
        //Intiate variable int and set to a random number
        int random = (int) (Math.random() * 10000);
        //Intiate variable int to track attempts
        int attempts = 1;
        //Intiate variable int track min value
        int min = 1;
        //Intiate variable int track max value
        int max = 10000;
        //Intiate variable int track guess value
        int guess = 0;
        //while loop for wrong answers, Also add 1 attempt each try
        while (guess != random) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a number between " + min + " and " + max + ": ");
            guess = in.nextInt();
            //if number is out of range report back
            if (guess < min || guess > max) {
                System.out.println("Sorry. Invalid Guess!");
                attempts++;
            //Else correct statement
            } else if (guess == random) {
                System.out.println("Good Job! It took " + attempts + " attempts and the number was: " + random);
            //Else if less than number set min value and output Higher
            } else if (guess < random) {
                System.out.println("Higher");
                min = guess;
                attempts++;
            //else if more than number set to max and output Lower
            } else if (guess > random) {
                System.out.println("Lower");
                max = guess;
                attempts++;
            }

        }
    }
}

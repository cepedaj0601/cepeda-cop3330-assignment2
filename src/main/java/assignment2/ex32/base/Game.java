package assignment2.ex32.base;

import java.util.Scanner;

import static assignment2.ex32.base.Solution32.difficultySetter;
import static assignment2.ex32.base.Solution32.targetCreator;
import static java.lang.Integer.parseInt;

public class Game {
    private static final Scanner in = new Scanner(System.in);

    public static void guessingGame(String guess, int numGuesses, String again, int target, int difficulty) {
        int first = 1;

        //display hint based off guess accuracy
        //increment guess counter each guess
        //print number of guesses when target is guessed

        //repeat everything if yes, end if no
        while (again.equals("Y") || again.equals("y")) {
            if (first == 0) {

                difficulty = difficultySetter(difficulty);

                target = targetCreator(difficulty, target);

                //prompt user to guess number
                System.out.println("I have my number. What's your guess?");

                while (target != parseInt(guess)) {
                    String temp = in.next();

                    int allow = 0;

                    for (int i = 0; i < temp.length(); i++) {
                        if (!Character.isDigit(temp.charAt(i))) {
                            System.out.println("That's not a number. Guess again:");

                            numGuesses = numGuesses + 1;
                            allow = 0;

                            break;
                        } else {
                            allow = 1;
                        }
                    }

                    if (allow == 1) {
                        if (parseInt(temp) == target) {
                            numGuesses = numGuesses + 1;
                            System.out.println("You got it in " + numGuesses + " guesses!");
                        } else if (parseInt(temp) > target) {
                            System.out.println("Too high. Guess again:");
                            numGuesses = numGuesses + 1;
                        } else if (parseInt(temp) < target) {
                            System.out.println("Too low. Guess again:");
                            numGuesses = numGuesses + 1;
                        }
                    }

                    guess = temp;
                }
                //prompt user to play again
                System.out.println("Do you wish to play again (Y/N)?");
                guess = "-1";
                again = in.next();

            }
            else {


                //prompt user to guess number
                System.out.println("I have my number. What's your guess?");

                while (target != parseInt(guess)) {
                    String temp = in.next();

                    int allow = 0;

                    for (int i = 0; i < temp.length(); i++) {
                        if (!Character.isDigit(temp.charAt(i))) {
                            System.out.println("That's not a number. Guess again:");

                            numGuesses = numGuesses + 1;
                            allow = 0;

                            temp = "-1";

                            break;
                        } else {
                            allow = 1;
                        }
                    }

                    if (allow == 1) {
                        if (parseInt(temp) == target) {
                            numGuesses = numGuesses + 1;
                            System.out.println("You got it in " + numGuesses + " guesses!");
                        } else if (parseInt(temp) > target) {
                            System.out.println("Too high. Guess again:");
                            numGuesses = numGuesses + 1;
                        } else if (parseInt(temp) < target) {
                            System.out.println("Too low. Guess again:");
                            numGuesses = numGuesses + 1;
                        }
                    }

                    guess = temp;
                }
                //prompt user to play again
                System.out.println("Do you wish to play again (Y/N)?");
                guess = "-1";
                again = in.next();
                first = 0;


            }
        }
    }
}

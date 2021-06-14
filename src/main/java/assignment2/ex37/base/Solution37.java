package assignment2.ex37.base;
/*
 *  UCF COP3330 Summer 2021 Exercise 37 Solution
 *  Copyright 2021 Justin Cepeda
 */
/*
Exercise 37 - Password Generator
Coming up with a password that meets specific requirements is something your computer can do. And it will give you
practice using random number generators in conjunction with a list of known values.

Create a program that generates a secure password. Prompt the user for the minimum length, the number of special
characters, and the number of numbers. Then generate a password for the user using those inputs.

Example Output
What's the minimum length? 8
How many special characters? 2
How many numbers? 2
Your password is aurn2$1s#
Constraints
Use lists to store the characters you’ll use to generate the passwords.
Ensure that the generated password is random.
Ensure that there are at least as many letters [as] there are special characters and number.
Challenges
Randomly convert vowels to numbers, such as 3 for E and 4 for A.
Have the program present a few options rather than a single result.
Place the password on the user’s clipboard when generated.
 */
import assignment2.ex36.base.Solution36;

import java.util.Scanner;

import static assignment2.ex37.base.Password.scrambler;

public class Solution37 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] info = new int[3];

        //get input
        info = passwordInput(info);

        //generate password
     /*   String password =*/ scrambler(info);

        //output password
      //  passwordOutput(password);
    }

    public static int[] passwordInput(int[] info){
        System.out.println("What's the minimum length?");
        int minLength = in.nextInt();
        info[0] = minLength;

        System.out.println("How many special characters?");
        int numSpecial = in.nextInt();
        info[1] = numSpecial;

        System.out.println("How many numbers?");
        int numNumbers = in.nextInt();
        info[2] = numNumbers;

        return info;
    }
/*
    public static void passwordOutput(String password){
        System.out.println("Your password is " + password);
    }

 */
}

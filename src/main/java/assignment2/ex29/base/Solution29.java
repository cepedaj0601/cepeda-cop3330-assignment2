package assignment2.ex29.base;
/*
 *  UCF COP3330 Summer 2021 Exercise 29 Solution
 *  Copyright 2021 Justin Cepeda
 */

import java.util.Scanner;

/*
Exercise 29 - Handling Bad Input
The rule of 72 is a quick method for estimating how long it will take to double your investment, by taking the number
72 and dividing it by the expected rate of return. It’s a good tool that helps you figure out if the stock, bond, or
savings account is right for you. It’s also a good program to write to test for and prevent bad input because computers
can’t divide by zero. And instead of exiting the program when the user enters invalid input, you can just keep prompting
for inputs until you get one that’s valid.

Write a quick calculator that prompts for the rate of return on an investment and calculates how many years it will
take to double your investment.

The formula is

years = 72 / r
where r is the stated rate of return.

Example Output
What is the rate of return? 0
Sorry. That's not a valid input.
What is the rate of return? ABC
Sorry. That's not a valid input.
What is the rate of return? 4
It will take 18 years to double your initial investment.
Constraints
Don’t allow the user to enter 0.
Don’t allow non-numeric values.
Use a loop to trap bad input, so you can ensure that the user enters valid values.
Challenge
Display a different error message when the user enters 0.
 */
public class Solution29 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String r = null;
        int y = 0;
        y = calculator(r, y);
        System.out.println("It will take "+y+" years to double your initial investment.");
    }

    public static int calculator(String r, int y){
        System.out.println("What is the rate of return?");
        r = in.next();

        r = nullifier(r);

        int R = Integer.parseInt(r);

        y = 72 / R;
        return y;
    }

    public static String nullifier(String r){
        int i ;
        for (i = 0; i < r.length(); i++) {
            if(Character.isDigit(r.charAt(i))){
               if(i == 0){
                   if(r.equals("0")){
                       break ;
                   }
               }
            }

            else if (Character.isLetter(r.charAt(i))){
                break;
            }
        }
        if(r.equals("0")){
            System.out.println("Sorry. That's not a valid input.");
            System.out.println("What is the rate of return?");
            r = in.next();
            r = nullifier (r) ;
        }
        if (Character.isLetter(r.charAt(0))) {
            System.out.println("Sorry. That's not a valid input.");
            System.out.println("What is the rate of return?");
            r = in.next();
            r = nullifier (r) ;
        }
        return r;
    }
}

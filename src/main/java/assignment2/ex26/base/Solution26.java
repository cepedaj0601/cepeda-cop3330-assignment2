package assignment2.ex26.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 ex27 Solution
 *  Copyright 2021 Justin Cepeda
 */

/*
Exercise 26 - Months to Pay Off a Credit Card
It can take a lot longer to pay off your credit card balance than you might realize. And the formula for figuring that
out isn’t pretty. Hiding the formula’s complexity with a function can help you keep your code organized.

Write a program that will help you determine how many months it will take to pay off a credit card balance. The program
should ask the user to enter the balance of a credit card, the APR of the card, and their monthly payment. The program
should then return the number of months needed (rounded up to the next integer value).

The formula for this is

n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
where

n is the number of months.
i is the daily rate (APR divided by 365).
b is the balance.
p is the monthly payment.
Example Output
What is your balance? 5000
What is the APR on the card (as a percent)? 12
What is the monthly payment you can make? 100
It will take you 70 months to pay off this card.
Constraints
Prompt for the card’s APR. Do the division internally.
Prompt for the APR as a percentage, not a decimal.
Use a class called PaymentCalculator with a public method called calculateMonthsUntilPaidOff, which returns the number
of months.
Round fractions of a cent up to the next cent.
Challenge
Rework the formula so the program can accept the number of months as an input and compute the monthly payment.
Create a version of the program that lets the user choose whether to figure out the number of months until payoff or
the amount needed to pay per month.
 */

import java.util.Scanner;

public class Solution26 {
    public static final Scanner in = new Scanner(System.in);

    public double balance;
    public double apr;
    public double payment;
    public int time;

    public void main(String[] args) {
        Solution26 sol26main = new Solution26();

        //ask balance
        balance = sol26main.askBalance(balance);

        //ask apr
        apr = sol26main.askApr(apr);

        //ask monthly payment
        payment = sol26main.askPayment(payment);

        //calculate time
        PaymentCalculator paymentCalculator = new PaymentCalculator();
        time = paymentCalculator.calculateMonthsUntilPaidOff(balance, apr, payment, time);

        printTime(time);


    }

    public double askBalance(double balance){
        System.out.println("What is your balance?");
        balance = in.nextInt();
        return balance;
    }

    public double askApr(double apr) {
        System.out.println("What is the aor on the card (as a percent)?");
        this.apr = in.nextInt();
        this.apr = this.apr /100;
        return this.apr;
    }

    public double askPayment(double payment) {
        System.out.println("What is the monthly payment you can make?");
        payment = in.nextInt();
        return payment;
    }

    public void printTime(int time) {
        System.out.println("It will take you "+ time +" months to pay off this card.");
    }
}

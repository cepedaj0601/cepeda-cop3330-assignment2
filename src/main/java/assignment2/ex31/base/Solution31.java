package assignment2.ex31.base;
/*
 *  UCF COP3330 Summer 2021 Exercise 31 Solution
 *  Copyright 2021 Justin Cepeda
 */
/*
Exercise 31 - Karvonen Heart Rate
When you loop, you can control how much you increment the counter; you don’t always have to increment by one.

When getting into a fitness program, you may want to figure out your target heart rate so you don’t overexert yourself.
The Karvonen heart rate formula is one method you can use to determine your rate. Create a program that prompts for your
age and your resting heart rate. Use the Karvonen formula to determine the target heart rate based on a range of
intensities from 55% to 95%. Generate a table with the results as shown in the example output. The formula is

TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
Example Output
Resting Pulse: 65        Age: 22

Intensity    | Rate
-------------|--------
55%          | 138 bpm
60%          | 145 bpm
65%          | 151 bpm
:               :        (extra lines omitted)
85%          | 178 bpm
90%          | 185 bpm
95%          | 191 bpm
Constraints
Don’t hard-code the percentages. Use a loop to increment the percentages from 55 to 95.
Ensure that the heart rate and age are entered as numbers. Don’t allow the user to continue without entering valid
inputs.
Display the results in a tabular format.
Challenge
Implement this as a GUI program that allows the user to use a slider control for the intensity, and update the interface
in real time as the slider moves.
 */
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.System.exit;

public class Solution31 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int age, rest;
        //take input
        age = userAge();
        rest = userRest();

        //calculate numbers
        // display in table
        tableMaker(age, rest);
    }

    public static int userAge(){
        System.out.println("What is your age?");
        String Age = in.next();

        for (int i = 0; i < Age.length(); i++) {
            if(!Character.isDigit(Age.charAt(i))) {
                System.out.println("Age can only contain integers.");
                exit(0);
            }
        }

        return parseInt(Age);
    }

    public static int userRest(){
        System.out.println("What is your resting heart rate?");
        String Rest = in.next();

        for (int i = 0; i < Rest.length(); i++) {
            if(!Character.isDigit(Rest.charAt(i))) {
                System.out.println("Heart rate can only contain integers.");
                exit(0);
            }
        }

        return parseInt(Rest);
    }

    public static String targetHeartRate (int age, int rest, double intensity){
        double TargetHeartRate = (((220 - age) - rest) * (intensity/100) + rest);

        return (int)(intensity) + "%          | " + (int)TargetHeartRate + " bpm";
    }

    public static void tableMaker(int age, int rest){
        System.out.print("Resting pulse: "+ rest + "        Age: " + age + "\n\n" +
                "Intensity    | Rate   \n" +
                "-------------|--------");
        for (int i = 55; i <96 ; i++) {
            System.out.print("\n"+targetHeartRate(age, rest, i));
        }

    }
}

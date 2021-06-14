package assignment2.ex38.base;
/*
 *  UCF COP3330 Summer 2021 Exercise 38 Solution
 *  Copyright 2021 Justin Cepeda
 */
/*
Exercise 38 - Filtering Values
Sometimes input you collect will need to be filtered down. Data structures and loops can make this process easier.

Create a program that prompts for a list of numbers, separated by spaces. Have the program print out a new list
containing only the even numbers.

Example Output
Enter a list of numbers, separated by spaces: 1 2 3 4 5 6 7 8
The even numbers are 2 4 6 8.
Constraints
Convert the input to an array. Many languages can easily convert strings to arrays with a built-in function that
splits apart a string based on a specified delimiter.
Write your own algorithm—don’t rely on the language’s built-in filter or similar enumeration feature.
Use a function called filterEvenNumbers to encapsulate the logic for this. The function takes in the old array and
returns the new array.
Challenge
Instead of prompting for numbers, read in lines from any text file and print out only the even-numbered lines.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution38 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //take in numbers
        String input = inputString();

        //convert to array
        int[] intInputArray = inputConverter(input);

        int[] IntArray = new int[intInputArray.length];
        //filter
        IntArray = filterEvenNumbers(intInputArray, IntArray);

        //print out new list
        //printNewArray(IntArray);
    }

    public static String inputString (){
        System.out.println("Enter a list of numbers, separated by spaces:");
        String temp = in.nextLine();
        System.out.println(temp);
        return temp;
    }

    public static int[] inputConverter (String input){
        char[] inputArray = new char[input.length()];
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = input.charAt(i);
            System.out.print(inputArray[i]);
        }

        int[] intInputArray = new int[inputArray.length];

        int j = 0;

        for (int i = 0; i < intInputArray.length; i++) {
            if(Character.isWhitespace(inputArray[i])) {

            }
            else {
                intInputArray[j] = inputArray[i];
                j++;
                System.out.println(intInputArray[i]);
            }
        }

        return intInputArray;
    }

    public static int[] filterEvenNumbers (int[] intInputArray, int[] IntArray){
        int j = 0;
        for (int i = 0; i < intInputArray.length; i++) {
            if(intInputArray[i] % 2 == 0){
                IntArray[j] = intInputArray[i];
                j++;
            }
        }
        return IntArray;
    }

    public static void printNewArray(int[] IntArray){
        System.out.println("The even numbers are ");
        for (int i = 0; i < IntArray.length; i++) {
            System.out.print(IntArray[i] + " ");
        }
    }
}

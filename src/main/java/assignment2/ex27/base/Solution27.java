package assignment2.ex27.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 ex27 Solution
 *  Copyright 2021 Justin Cepeda
 */

/*
Exercise 27 - Validating Inputs
Large functions aren’t very usable or maintainable. It makes a lot of sense to break down the logic of a program into
smaller functions that do one thing each. The program can then call these functions in sequence to perform the work.

Write a program that prompts for a first name, last name, employee ID, and ZIP code. Ensure that the input is valid
according to these rules:

The first name must be filled in.
The last name must be filled in.
The first and last names must be at least two characters long.
An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
The ZIP code must be a number.
Display appropriate error messages on incorrect data.

Example Output
Enter the first name: J
Enter the last name:
Enter the ZIP code: ABCDE
Enter an employee ID: A12-1234
"J" is not a valid first name. It is too short.
The last name must be filled in.
The ZIP code must be numeric.
A12-1234 is not a valid ID.
Or

Enter the first name: Jimmy
Enter the last name: James
Enter the ZIP code: 55555
Enter an employee ID: TK-421
There were no errors found.
Constraints
Create a function for each type of validation you need to write. Then create a validateInput function that takes in all
of the input data and invokes the specific validation functions.
Use a single output statement to display the outputs.
Challenges
Use regular expressions to validate the input.
Implement this as a GUI application or web application that gives immediate feedback when the fields lose focus.
Repeat the process if the input is not valid.
 */

import java.util.Scanner;

public class Solution27 {
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int valid = 0;

        valid = validateInput(valid);

        outputStatement(valid);
    }

    public static int validateFirstName(String firstName) {

        //0= blank name, 1=is valid, 2=too short

        if (firstName.isEmpty()) {

        }
        else if (firstName.length() < 2) {
            return 2;
        }
        else {
            return 1;
        }

        return 0;
    }

    public static int validateLastName(String lastName) {

        //0= blank name, 1=is valid, 2=too short

        if (lastName.isEmpty()) {

        } else if (lastName.length() < 2) {
            return 2;
        } else {
            return 1;
        }
        return 0;
    }

    public static boolean validateZipCode(String zip) {

        for (int i = 0; i < zip.length(); i++) {
            if (Character.isDigit(zip.charAt(i))) {

            } else {
                return false;
            }

        }
        return true;
    }

    public static boolean validateId(String id) {

        if (id.length() == 7) {
            if (Character.isLetter(id.charAt(0))) {
                if (Character.isLetter(id.charAt(1))) {
                    if (id.charAt(2) == '-') {
                        if (Character.isDigit(id.charAt(3))) {
                            if (Character.isDigit(id.charAt(4))) {
                                if (Character.isDigit(id.charAt(5))) {
                                    return Character.isDigit(id.charAt(6));
                                }
                            }
                        }
                    }
                }
            }
        }

        return false;
    }

    public static int validateInput (int valid){
        System.out.println("Enter the first name:");
        String firstName = in.next().trim();

        int isFirstValid = 0;
        isFirstValid= validateFirstName(firstName);

        System.out.println("Enter the last name:");
        String lastName = in.next().trim();

        int isLastValid = 0;
        isLastValid = validateLastName(lastName);

        System.out.println("Enter the Zip code:");
        String zip = in.next();

        boolean isZipValid = false;
        isZipValid = validateZipCode(zip);

        System.out.println("Enter an employee-Id");
        String id = in.next();

        boolean isIdValid = false;
        isIdValid = validateId(id);

        switch (isFirstValid) {
            case 0 -> System.out.println("The first name must be filled in.");
            case 1 -> valid = valid + 1;
            case 2 -> System.out.println(firstName + " is not a valid first name. It is too short.");
        }

        switch (isLastValid) {
            case 0 -> System.out.println("The last name must be filled in.");
            case 1 -> valid = valid + 1;
            case 2 -> System.out.println(lastName + " is not a valid last name. It is too short.");
        }
        if(isZipValid){
            valid = valid + 1;
        }
        else{
            System.out.println("The ZIP code must be numeric.");
        }

        if(isIdValid){
            valid = valid + 1;
        }
        else{
            System.out.println(id + " is not a valid ID.");
        }

        return valid;
    }
    public static void outputStatement(int valid){
        if (valid == 4){
            String output = "There were no errors found.";
            System.out.println(output);
        }
    }
}
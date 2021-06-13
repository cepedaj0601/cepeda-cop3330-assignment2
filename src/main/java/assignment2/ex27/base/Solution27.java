package assignment2.ex27.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 ex24 Solution
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

        //ask for first name
        //validate first name
        int isFirstName = 0;
        validateFirstName(isFirstValid);


        //ask for last
        //validate last name
        int isLastValid = 0;
        validateLastName(isLastValid);

        //ask for zip code
        //validate zip code
        boolean isZipValid = false;
        validateZipCode(isZipValid);

        //ask for employee id
        //validate id
        boolean isIdValid = false;
        validateId(isIdValid);

        //validate input function
        //output results

    }

    public static int validateFirstName(int isFirstValid){
        System.out.println("Enter the first name:");
        String firstName = in.next();

        isFirstValid = 0;//0= blank name, 1=is valid, 2=too short

        if (firstName.contains(" ")) {
        }

        else if (firstName.length() < 2 ) {
            isFirstValid = 2;
             }

            else{
                isFirstValid = 1;
            }

        return isFirstValid;
    }

    public static int validateLastName(int isLastValid){
        System.out.println("Enter the last name:");
        String lastName = in.next();

        isLastValid = 0;//0= blank name, 1=is valid, 2=too short
        if (lastName.contains(" ")) {
            isLastValid = 0;
        }

        else if (lastName.length() < 2 ) {
            isLastValid = 2;
        }

        else{
            isLastValid = 1;
        }
        return isLastValid;
    }

    public static boolean validateZipCode(boolean isZipValid){
        System.out.println("Enter the Zip code:");
        String zip = in.next();

        char[] zipArray = zip.toCharArray();

        for (char c : zipArray) {
            if ((c != '0')|| (c!='1')|| (c!='2')|| (c!='3')||(c!='4')|| (c!='5')|| (c!='6')||( c!='7')||(c!= '8')||
                    (c!= '9')){
                isZipValid = false;
            }
            else {
                isZipValid = true;
            }
        }
        return isZipValid;
    }

    public static boolean validateId(boolean isIdValid){
        System.out.println("Enter an employee-Id");
        String id = in.next();

        char[] idArray = id.toCharArray();

        if (idArray[1].equals("[a-zA-Z]")) {
            if (idArray[2].equals("[a-zA-Z]")){
                if (idArray[3].equals("-")) {
                    if (idArray[4].equals("[0-9]")){
                        if (idArray[5].equals("[0-9]")){
                               isIdValid = true;
                        }
                    }
                }
            }
        }

        return isIdValid;
    }

    public static int validateInput (int isFirstValid, int isLastValid, boolean isZipValid, boolean isIdValid, int valid
    , String firstName, String lastName){
        isFirstValid = validateFirstName(isFirstValid);
        isLastValid = validateLastName(isLastValid);
        isZipValid = validateZipCode(isZipValid);
        isIdValid = validateId(isIdValid);
        switch (isFirstValid){
            case 0:
                System.out.println("The first name must be filled in.");
                break;
            case 1:
                valid = valid + 1;
                break;
            case 2:
                System.out.println(firstName + " is not a valid first name. It is too short.");
                break;
        }
        switch (isLastValid){
            case 0:
                System.out.println("The last name must be filled in.");
                break;
            case 1:
                valid = valid + 1;
                break;
            case 2:
                System.out.println(lastName + " is not a valid last name. It is too short.");
                break;
        }
        if(){

        }
        else{

        }

        if(){

        }
        else{

        }

        return valid;
    }
    public static void outputStatement(int valid){
        if (valid == 5){
            String output = "There were no errors found.";
            System.out.println(output);
        }
    }
}

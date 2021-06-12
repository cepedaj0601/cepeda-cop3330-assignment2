package assignment2.ex25.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 ex25 Solution
 *  Copyright 2021 Justin Cepeda
 */

/*
Exercise 25 - Password Strength Indicator
Functions help you abstract away complex operations, but they also help you build reusable components.

Create a program that determines the complexity of a given password based on these rules:

A very weak password contains only numbers and is fewer than eight characters.
A weak password contains only letters and is fewer than eight characters.
A strong password contains letters and at least one number and is at least eight characters.
A very strong password contains letters, numbers, and special characters and is at least eight characters.
Example Output
The password '12345' is a very weak password.
The password 'abcdef' is a weak password.
The password 'abc123xyz' is a strong password.
The password '1337h@xor!' is a very strong password.
Constraints
Create a passwordValidator function that takes in the password as its argument and returns a value you can evaluate to
determine the password strength. Do not have the function return a string—you may need to support multiple languages in
the future.
Use a single output statement.
Challenge
Create a GUI application or web application that displays graphical feedback as well as text feedback in real time. As
someone enters a password, determine its strength and display the result
 */

import java.util.Scanner;

import static java.lang.System.exit;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class Solution25 {

    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String password = "";
        String output = "";
        String response = "0";

        readUserInput(password);

        passwordValidator(password, response, isVeryWeak(password, response), isWeak(password, response),
                isStrong(password, response), isVeryStrong(password, response));

        printUserOutput(response, output, password);
    }

    //prompt input
    public static String readUserInput(String password) {
        System.out.println("Enter in a password:");

        //take in input
        password = in.next();

        return password;
    }

    public static String isVeryWeak(String password, String response){
        if (password.length() < 8) {
            if (!password.contains("[a-zA-Z]+")) {
                response = "1";
            }
        }

        return response;
    }

    public static String isWeak (String password, String response){
        if (password.length() < 8) {
            if(!password.contains("[0-9]+")){
                response = "2";
            }
        }
        return response;
    }

    public static String isStrong (String password, String response){
        if (password.length() >= 8) {
            char[] passwordArray = password.toCharArray();

            for (int i = 0; i < passwordArray.length; i++) {
                if (passwordArray[i] == '0' || passwordArray[i] == '1' || passwordArray[i] == '2' ||
                        passwordArray[i] == '3' || passwordArray[i] == '4' || passwordArray[i] == '5' ||
                        passwordArray[i] == '6' || passwordArray[i] == '7' || passwordArray[i] == '8' ||
                        passwordArray[i] == '9') {

                    response = "3";
                }
            }
        }
        return response;
    }

    public static String isVeryStrong (String password, String response){
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");

        Matcher matcher = pattern.matcher(password);

        if (matcher.find()) {
            response = "4";
        }

        return response;
    }

    public static String passwordValidator (String password, String response, String isVeryWeak, String isWeak,
                                            String isStrong, String isVeryStrong){

        if (!isVeryWeak.equals(1)) {
            if (!isWeak.equals(2)) {
                if (!isStrong.equals(3)) {
                    if (!isVeryStrong.equals(4)) {
                        response = "5";
                        return response;
                    }
                }
            }
        }
        else{
            return response;
        }

        return response;
    }

    public static void printUserOutput(String response, String output, String password){

        int responseInt = Integer.parseInt(response);

        switch(responseInt){
            case 1:
                output = "The password " + password + " is a very weak password.";
                break;
            case 2:
                output = "The password " + password + " is a weak password.";
                break;
            case 3:
                output = "The password " + password + " is a strong password.";
                break;
            case 4:
                output = "The password " + password + " is a very strong password.";
                break;
            case 5:
                output = "The password " + password + " does not fit the criteria of any known password strengths.";
        }

        System.out.println(output);
        exit(0);
    }

}

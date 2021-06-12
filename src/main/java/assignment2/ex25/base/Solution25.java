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

        Solution25 sol25Main = new Solution25() ;

        password = sol25Main.readUserInput();

        response = sol25Main.passwordValidator(password, response);

        System.out.println(response);

        sol25Main.printUserOutput(response, output, password);
    }

    //prompt input
    public String readUserInput() {
        System.out.println("Enter in a password:");

        String password = in.next();

        return password;
    }

    public String isVeryWeak(String password, String response){
        if (password.length() < 8) {

            boolean numbers = true;

            numbers = password.matches("-?\\d+(\\.\\d+)?");

            if(numbers) {
                response = "1";
                return response;
            }

            else
                return response ;

        }
        else {
            return response ;
        }

    }

    public String isWeak (String password, String response){
        if (password.length() < 8) {
            if(! password.matches(".*[^a-z].*")){
                response = "2";
            }
        }
        return response;
    }

    public String isStrong (String password, String response){
        if (password.length() >= 8) {
            Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");

            Matcher matcher = pattern.matcher(password);

            if (!matcher.find() ) {


                char[] passwordArray = password.toCharArray();

                for (char c : passwordArray) {
                    if (c == '0' || c == '1' || c == '2' ||
                            c == '3' || c == '4' || c == '5' ||
                            c == '6' || c == '7' || c == '8' ||
                            c == '9') {
                        if (password.matches(".*[a-zA-Z]+.*")) {
                            response = "3";
                            break;
                        }
                    }
                }
            }
        }
        return response;
    }

    public String isVeryStrong (String password, String response){
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");

        Matcher matcher = pattern.matcher(password);

        if (password.length() >= 8) {
            if (matcher.find()) {
                response = "4";
            }
        }
        else{
            return response;
        }

        return response;
    }

    public String passwordValidator (String password, String response){
        response = isVeryWeak(password, response);
        if (!isVeryWeak(password, response).equals("1")) {
            response = isWeak(password, response);
            if (!isWeak(password, response).equals("2")) {
                response = isStrong(password, response);
                if (!isStrong(password, response).equals("3")) {
                    response = isVeryStrong(password, response);
                    if (!isVeryStrong(password, response).equals("4")) {
                        response = "5";
                        return response;
                    }
                }
                else if (isVeryStrong(password, response).equals("4")) {
                    response = isVeryStrong(password, response);
                    return response ;
                }
            }
        }
        else{
            return response;
        }

        return response;
    }

    public void printUserOutput(String response, String output, String password){

        int responseInt = Integer.parseInt(response);

        switch (responseInt) {
            case 1 -> output = "The password " + password + " is a very weak password.";
            case 2 -> output = "The password " + password + " is a weak password.";
            case 3 -> output = "The password " + password + " is a strong password.";
            case 4 -> output = "The password " + password + " is a very strong password.";
            case 5 -> output = "The password " + password +
                    " does not fit the criteria of any known password strengths.";
        }

        System.out.println(output);
        exit(0);
    }

}

package assignment2.ex34.base;
/*
 *  UCF COP3330 Summer 2021 Exercise 34 Solution
 *  Copyright 2021 Justin Cepeda
 */
/*
Exercise 34 - Employee List Removal
Sometimes you have to locate and remove an entry from a list based on some criteria. You may have a deck of cards and
need to discard one so it’s no longer in play, or you may need to remove values from a list of valid inputs once they’ve
 been used. Storing the values in an array makes this process easier. Depending on your language, you may find it safer
 and more efficient to create a new array instead of modifying the existing one.

Create a small program that contains a list of employee names. Print out the list of names when the program runs the
first time. Prompt for an employee name and remove that specific name from the list of names. Display the remaining
employees, each on its own line.

Example Output
There are 5 employees:
John Smith
Jackie Jackson
Chris Jones
Amanda Cullen
Jeremy Goodwin

Enter an employee name to remove: Chris Jones

There are 4 employees:
John Smith
Jackie Jackson
Amanda Cullen
Jeremy Goodwin
Constraint
Use an array or list to store the names.
Challenges
If the user enters a name that’s not found, print out an error message stating that the name does not exist.
Read in the list of employees from a file, with each employee on its own line.
Write the output to the same file you read in.
 */
import java.util.Scanner;

public class Solution34 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String[] employeeList = new String[5];
        employeeList[0] = "John Smith";
        employeeList[1] = "Jackie Jackson";
        employeeList[2] = "Chris Jones";
        employeeList[3] = "Amanda Cullen";
        employeeList[4] = "Jeremy Goodwin";

        String name = "0";

        int removed = 8;

        displayNames(employeeList, removed);

        name = userInput(name);

        new Remover();
        removed = Remover.employeeRemover(employeeList, name, removed);

        displayNames(employeeList, removed);
    }

    public static void displayNames(String[] employeeList, int removed){
        int x = 5, counter = 0;

        for (int i = 0; i < 5; i++) {
            if (i == removed) {
                counter = counter + 1;
            }
        }

        System.out.println("There are " + (x - counter) + " employees:\n");
        for (int i = 0; i < 5; i++) {
            if (i != removed) {
                System.out.println(employeeList[i]);
            }
        }
    }

    public static String userInput(String name){
        System.out.println("\nEnter an employee name to remove:");
        return in.next();
    }



}

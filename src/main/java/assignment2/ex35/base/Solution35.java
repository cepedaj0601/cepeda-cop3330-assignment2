package assignment2.ex35.base;
/*
 *  UCF COP3330 Summer 2021 Exercise 35 Solution
 *  Copyright 2021 Justin Cepeda
 */
/*
Exercise 35 - Picking a Winner
Arrays don’t have to be hard-coded. You can take user input and store it in an array and then work with it.

Create a program that picks a winner for a contest or prize drawing. Prompt for names of contestants until the user
leaves the entry blank. Then randomly select a winner.

Example Output
Enter a name: Homer
Enter a name: Bart
Enter a name: Maggie
Enter a name: Lisa
Enter a name: Moe
Enter a name:
The winner is... Maggie.
Constraints
Use a loop to capture user input into an array.
Use a random number generator to pluck a value from the array.
Don’t include a blank entry in the array.
Some languages require that you define the length of the array ahead of time. You may need to find another data
structure, like an ArrayList.
Challenges
When a winner is chosen, remove the winner from the list of contestants and allow more winners to be chosen.
Make a GUI program that shows the array of names being shuffled on the screen before a winner is chosen.
Create a separate contest registration application. Use this program to pull in all registered users and pick a winner.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Solution35 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int numNames = 0;
        ArrayList<String> names = new ArrayList<String>();

        //prompt name input
        //while loop that stops when inout is blank
        names = nameAdder(names, numNames);
        System.out.println(numNames);
        //pick random index
        //print name stored @ index as the winner
        winnerPicker(names, numNames);
    }

    public static ArrayList<String> nameAdder(ArrayList<String> names, int numNames){
        boolean stop = true;

        while(stop){
            System.out.println("Enter a name:");
            String temp = in.next().trim();

            if (temp.isEmpty()) {
                stop = false;
            }
            else{
                names.add(temp);
                numNames = numNames + 1;
            }
        }
        return names;
    }

    public static void winnerPicker(ArrayList<String> names, int numNames){

       int temp = (int)Math.floor(Math.random()*(numNames-1+1)+1);

        String winner = names.get(temp);
        System.out.println("The winner is... "+ winner +".");
    }
}

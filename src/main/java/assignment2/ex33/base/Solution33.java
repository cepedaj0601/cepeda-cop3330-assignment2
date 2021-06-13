package assignment2.ex33.base;
/*
 *  UCF COP3330 Summer 2021 Exercise 33 Solution
 *  Copyright 2021 Justin Cepeda
 */
/*
Exercise 33 - Magic 8 Ball
Arrays are great for storing possible responses from a program. If you combine that with a random number generator, you
can pick a random entry from this list, which works great for games.

Create a Magic 8 Ball game that prompts for a question and then displays either "Yes," "No," "Maybe," or "Ask again
later."

Example Output
What's your question?
> Will I be rich and famous?

Ask again later.
Constraint
The value should be chosen randomly using a pseudo random number generator. Store the possible choices in a list and
select one at random.
Challenges
Implement this as a GUI application.
If available, use native device libraries to allow you to “shake” the 8 ball.

 */
import java.util.Scanner;

public class Solution33 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int num;

        //prompt input
        userInput();

        //pick a random number 0-3
        num = answerPicker();

        //output corresponding response
        responseSelector(num);
    }

    public static void userInput(){
        in.next();
    }

    public static int answerPicker(){
      return (int)Math.floor(Math.random()*(4-1+1)+1);

    }

    public static String responseSelector(int num){
        String[] responses = new String[4];
        responses[0] = "No.";
        responses[1] = "Yes.";
        responses[2] = "Maybe.";
        responses[3] = "Ask again later.";

        System.out.println(responses[num]);

        return responses[num];
    }
}

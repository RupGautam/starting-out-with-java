package Chapter2.Examples;

/**
 * Created by RupGautam on 3/16/17.
 */

import java.util.Scanner;

/**
 * This is the correct way of using nextline while reading numeric and string input.
 */
public class CorrectInputProblem {

  public static void main(String[] args) {

    String name; // To hold the user's name
    int age; // To hold the user's age
    double income; // To hold the user's income

    // Create a Scanner object to read input
    Scanner keyboard = new Scanner(System.in);

    // Get the user's age
    System.out.print("What is your age? ");
    age = keyboard.nextInt();

    // Get the user's income
    System.out.print("What is your annual income? ");
    income = keyboard.nextDouble();

    // Clear the keyboard buffer
    keyboard.nextLine();

    // Get the user's name
    System.out.print("What is your name? ");
    name = keyboard.nextLine();

    //Displaying the info back to user
    System.out.println("Hello, " + name + ". Your age is "
        + age + " and your annual income is "
        + income);

  }

}

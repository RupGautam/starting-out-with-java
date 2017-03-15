package Chapter2;

/**
 * Created by RupGautam on 3/15/17.
 */

import java.util.Scanner;

/**
 * Chapter 2: Reading Keyboard Input
 * Page: 89
 * This program has problem reading input at line 24.
 */
public class inputProblem {

  public static void main(String[] args) {
    String name; // To hold the user's name
    int age; // To hold the user's age
    double income; // To hold the user's income


    // Create Scanner object to read input from user.
    Scanner keyboard = new Scanner(System.in);

    // Get the user's age
    System.out.print("What is your age? ");
    age = keyboard.nextInt();

    //Get the user's income
    System.out.print("What is your annual income? ");
    income = keyboard.nextDouble();

    //Get the user's name.
    System.out.print("What is your name? ");
    name = keyboard.nextLine();

    // Display the information back to the user
    System.out.println("Hello, " + name +
                        ". Your age is " + age +
                        " and your income is $ "
                        + income);
  }

}

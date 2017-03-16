package Chapter2;

/**
 * Created by RupGautam on 3/15/17.
 */

import java.util.Scanner;

/**
 * Chapter 2: Reading Keyboard Input
 * Page: 87
 * This program demonstrates the Scanner class
 */
public class payRoll {

  public static void main(String[] args) {

    String name; // To hold a name

    int hours; // Hours worked

    double payRate; // Hourly pay rate

    double grossPay; // Gross pay

    // Create a Scanner object to read input from user
    Scanner keyboard = new Scanner(System.in);

    // Get the user's name
    System.out.print("What is your name: ");
    name = keyboard.nextLine();

    // Get the number of hours worked this week
    System.out.print("How many hours did you work this week? ");
    hours = keyboard.nextInt();

    // Get User's hourly pay rate
    System.out.print("What is your pay rate? ");
    payRate = keyboard.nextDouble();

    // Calculate the gross pay
    grossPay = hours * payRate;

    //Display the resulting payment
    System.out.println("Hello, " + name);
    System.out.println("Your gross pay is 4" + grossPay);


  }

}

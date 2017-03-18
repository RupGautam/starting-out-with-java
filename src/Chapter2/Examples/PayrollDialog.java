package Chapter2.Examples;

/**
 * Created by RupGautam on 2017-03-18.
 */

import jdk.nashorn.internal.scripts.JO;

import javax.swing.JOptionPane;
import java.util.DoubleSummaryStatistics;

/**
 * This program demonstrates using dialogs with JOptionPane.
 */
public class PayrollDialog {

    public static void main(String[] args) {

        String inputString; // take input from user
        String name; // user's name
        int hours; // Number of hours worked
        double payRate; //Hourly pay rate
        double grossPay; // User's gross pay


        // Get the user' name
        name = JOptionPane.showInputDialog("What is your name? ");


        //Get the number of hours worked
        inputString = JOptionPane.showInputDialog("How many hours did you worked this week? ");

        // Convert user inputted String into int to use it as number of hours
        hours = Integer.parseInt(inputString);

        // Get the hourly pay rate
        inputString = JOptionPane.showInputDialog("What is your hourly pay rate? ");

        // Again convert String into pay rate to use it as hourly wages
        payRate = Double.parseDouble(inputString);

        // Calculate the gross pay
        grossPay = hours * payRate;

        //Display the results
        JOptionPane.showMessageDialog(null, "Hello " +
                name + ". Your Gross pay is $" +
                grossPay);

        //End the program
        System.exit(0);
    }

}

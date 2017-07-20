package Chapter3.Examples;/**
 * Created by RupGautam on 7/19/17.
 */

import javax.swing.JOptionPane;

/**
 * Copyright ${COPYRIGHT}.
 */
public class AverageScore {

  public static void main(String[] args) {
    double score1, score2, score3, average; //this holds score{1..3}
    String input;  //user input

    // Getting the first input from the users
    input = JOptionPane.showInputDialog("Enter score #1: ");
    score1 = Double.parseDouble(input);

    // Getting the second input from the users
    input = JOptionPane.showInputDialog("Enter score #1: ");
    score2 = Double.parseDouble(input);

    // Getting the third input from the users
    input = JOptionPane.showInputDialog("Enter score #1: ");
    score3 = Double.parseDouble(input);

    //Calc the average from 1/2/3 inputs
    average = (score1 + score2 + score3) / 3.0;

    //Display  the calc average value.
    JOptionPane.showMessageDialog(null, "This average is "+ average);

    // If the score is more than 95, let the use know it's A+ grade.
    if (average > 95){
      JOptionPane.showMessageDialog(null, "Good job!");
    }

    else if (average < 95 && average > 85){
      JOptionPane.showMessageDialog(null, "Keep it up!");

    }
    else if (average < 85 && average > 75){
      JOptionPane.showMessageDialog(null, "Put more work!");

    }
    else {
      JOptionPane.showMessageDialog(null, "Work Hard, Work Hard!");

    }
    System.exit(0);
  }

}

package Chapter3.Examples;/**
 * Created by RupGautam on 3/18/17.
 */

/**
 * Demo if-else statment
 */

import javax.swing.JOptionPane;

public class AverageScore {

  public static void main(String[] args) {

    double scoreOne;
    double scoreTwo;
    double scoreThree;
    double average;
    String input;

    // Get the first test score
    input = JOptionPane.showInputDialog(null ,"Enter score #1: ");
    scoreOne = Double.parseDouble(input);

    // Get the second test score
    input = JOptionPane.showInputDialog(null ,"Enter score #2: ");
    scoreTwo = Double.parseDouble(input);

    // Get the third test score
    input = JOptionPane.showInputDialog(null ,"Enter score #3: ");
    scoreThree = Double.parseDouble(input);

    // Calculate the average score. (s1+s1+s3) / 3 = ave
    average = (scoreOne + scoreTwo + scoreThree) / 3.0;

    // Display the avg dialog box
    JOptionPane.showMessageDialog(null, "The average is "+ average);

    // Something to play with if-else
    if(average < 100 && average > 90){
      JOptionPane.showMessageDialog(null, "This is great score! "+average+" is your average");
    }
    else {
      JOptionPane.showMessageDialog(null, "Good score!, keep trying! " + average);
    }

  }

}

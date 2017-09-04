/* 
 * Programmer: Waleed Ahsan
 * This program is written by me and this code shall not be copied for any other program
 */

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class BMI {
	public static void main(String args[])
	{
		JFrame answerbox = new JFrame();
		
		double weight;
		double height;
		double algorithm;
		
		weight = Double.parseDouble(JOptionPane.showInputDialog("Type your weight in Pounds"));
		height = Double.parseDouble(JOptionPane.showInputDialog("Type your height in CM"));
		
		algorithm = weight / Math.pow(height/100, 2);
		
		if(algorithm < 18.5 && algorithm > 0)
		{
			JOptionPane.showMessageDialog(answerbox, "Your BMI is " + String.format("%.2f", algorithm) + " and you are underweight");
		}
		if(algorithm > 18.5 && algorithm < 25)
		{
			JOptionPane.showMessageDialog(answerbox, "Your BMI is " + String.format("%.2f", algorithm) + " and you have a normal weight");
		}
		if(algorithm >= 25 && algorithm < 30)
		{
			JOptionPane.showMessageDialog(answerbox, "Your BMI is " + String.format("%.2f", algorithm) + " and you are overweight");
		}
		if(algorithm >= 30)
		{
			JOptionPane.showMessageDialog(answerbox, "Your BMI is " + String.format("%.2f", algorithm) + " and you are obese");
		}
	}
}
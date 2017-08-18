/* 
 * Programmer: Waleed Ahsan
 * This program is written by me and this code shall not be copied for any other program
 */

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TemperatureConvertor {
	public static void main(String args[])
	{
		JFrame answerbox = new JFrame();
		
		String choice;
		String DEGREE  = "\u00b0";
		double celsius;
		double fahrenheit;

		choice = JOptionPane.showInputDialog("Type 'A' if you want to convert Celsius to Fahrenheit\nType 'B' if you want to convert Fahrenheit to Celsius");
		
		if(choice.equals("A") || (choice.equals("a")))
		{
			celsius = Double.parseDouble(JOptionPane.showInputDialog("What is the Celsius temperature you want to convert?"));
			celsius = (celsius * 1.8) + 32;
			JOptionPane.showMessageDialog(answerbox, "Your new temperature is " + celsius + DEGREE + "F");
		}
		
		if(choice.equals("B") || (choice.equals("b")))
		{
			fahrenheit = Double.parseDouble(JOptionPane.showInputDialog("What is the Fahrenheit temperature you want to convert?"));
			fahrenheit = (fahrenheit - 32) * 5/9;
			JOptionPane.showMessageDialog(answerbox, "Your new temperature is " + fahrenheit + DEGREE + "C");
		}
	}
}

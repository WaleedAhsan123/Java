/* 
 * Programmer: Waleed Ahsan
 * This program is written by me and this code shall not be copied for any other program
 */

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CurrencyConvertor {
	public static void main(String args[])
	{
		JFrame answerbox = new JFrame();
		
		String choice;
		double dollars;
		double pesos;
		String Peso_Symbol = "\u20B1";

		choice = JOptionPane.showInputDialog("Type 'A' if you want to convert Dollars to Pesos\nType 'B' if you want to convert Pesos to Dollars");
		
		if(choice.equals("A") || (choice.equals("a")))
		{
			dollars = Double.parseDouble(JOptionPane.showInputDialog("How many US Dollars do you want to convert?"));
			dollars = dollars * 51.17;
			JOptionPane.showMessageDialog(answerbox, "Your new amount is " + Peso_Symbol + String.format("%.2f", dollars));
		}
		
		if(choice.equals("B") || (choice.equals("b")))
		{
			pesos = Double.parseDouble(JOptionPane.showInputDialog("How many pesos do you want to convert?"));
			pesos = pesos * 0.02;
			JOptionPane.showMessageDialog(answerbox, "Your new amount is $" + String.format("%.2f", pesos));
		}
	}
}
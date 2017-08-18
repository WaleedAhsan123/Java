/* 
 * Programmer: Waleed Ahsan
 * This program is written by me and this code shall not be copied for any other program
 */

import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RNG {
	public static void main(String args[])
	{
		Random rand = new Random(); 
		JFrame answer = new JFrame();
		
		int random = rand.nextInt(10);
		int tries = 0;
		int User_Answer;
		int condition_to_start_the_loop = 0;
		
		while(condition_to_start_the_loop == 0)
		{
			tries++;
			
			User_Answer = Integer.parseInt(JOptionPane.showInputDialog("Guess the number in the system"));
			
			if(User_Answer < random)
			{
				JOptionPane.showMessageDialog(answer, "Your guess is too low");
			}
			else if(User_Answer > random)
			{
				JOptionPane.showMessageDialog(answer, "Your guess is too high");
			}
			else if(User_Answer == random)
			{
				JOptionPane.showMessageDialog(answer, "Congratulations! You guessed the answer correctly in " + tries + " tries");
				break;
			}
			else if(tries == 1)
			{
				JOptionPane.showMessageDialog(answer, "Congratulations! You guessed the answer correctly in " + tries + " try");
				break;
			}
		}
	}
}

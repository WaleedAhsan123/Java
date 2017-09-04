import javax.swing.JFrame;
import javax.swing.JOptionPane;

/* 
 * Programmer: Waleed Ahsan
 * This program is written by me and this code shall not be copied for any other program
 */

public class ATMLogin {
	public static void main(String args[])
	{
		JFrame Title = new JFrame();
		int User_PIN;
		int tries;

		JOptionPane.showMessageDialog(Title, "Enter the card card in the machine");
		
		for(tries = 2 ; tries >= 0 ; tries--)
		{
			User_PIN = Integer.parseInt(JOptionPane.showInputDialog("Enter the 4 digit PIN"));
			
			if(User_PIN == 2001)
			{
				JOptionPane.showMessageDialog(null, "Login Successful, You may transfer or redeem your money");
				break;
			}
			else
			{
				if(tries == 1) {
					JOptionPane.showMessageDialog(null, "Wrong PIN (" + tries + " try left)");
					continue;
				}
				
				else if(tries == 0)
				{
					JOptionPane.showMessageDialog(null, "Wrong PIN. Your card has been captured and reported to the servers");
					break;
				}
				
				JOptionPane.showMessageDialog(null, "Wrong PIN (" + tries + " tries left)");
				continue;
			}
		}
	}
}

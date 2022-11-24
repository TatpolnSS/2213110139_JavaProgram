import javax.swing.*;
import java.util.Random;
public class Lab303 {

	public static void main(String[] args) {
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		int withdraw = Integer.parseInt(JOptionPane.showInputDialog("Your balace:"+balance+"\nInput Money to Withdraw:"));
		
		if (withdraw>balance) {
			JOptionPane.showMessageDialog(null,"Error: Cannot withdraw more than balance","Error",JOptionPane.ERROR_MESSAGE);
		}
		else if (withdraw>20000) {
			JOptionPane.showMessageDialog(null,"Error: Cannot withdraw more than 20,000","Error",JOptionPane.ERROR_MESSAGE);
		}
		else if (withdraw%100!=0) {
			JOptionPane.showMessageDialog(null,"Error: Cannot withdraw "+withdraw%100+" baht.","Error",JOptionPane.ERROR_MESSAGE);
		}	
		else JOptionPane.showMessageDialog(null, "You withdraw "+withdraw+" baht."+
			"\n1,000 = "+withdraw/1000+"\n500 = "+(withdraw%1000)/500+"\n100 = "+(withdraw%500)/100);
	}

}

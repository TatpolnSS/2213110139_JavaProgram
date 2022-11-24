import javax.swing.*;
public class Example1 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Input Full name:");
		int birth = Integer.parseInt(JOptionPane.showInputDialog("Input Birth year:"));
		while(birth <1980||birth >2018) {
			birth = Integer.parseInt(JOptionPane.showInputDialog("Input Birth year:"));
		}
		int gender = JOptionPane.showConfirmDialog(null,"are you Female?","Gender",JOptionPane.YES_NO_OPTION);
		JOptionPane.showMessageDialog(null, "Full name:"+name+"\nBirth Year:"+birth+"\nYou're "+(gender==0?"Female":"Male"));
	}

}

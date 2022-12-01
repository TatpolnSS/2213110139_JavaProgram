import java.util.*;

import javax.swing.JOptionPane;
public class Example_403 {

	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);*/
		String sentence = JOptionPane.showInputDialog("Input a sentence:");
		/*System.out.print("Input a sentence : ");
		String sentence = scan.nextLine();*/
		while(!sentence.endsWith(".")) {
			sentence = JOptionPane.showInputDialog("Input a sentence ,again:");
			/*sentence = scan.nextLine();*/
		}
		System.out.println("");
		int spaceofWord=0;
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				spaceofWord++;
			}
		}
		/*System.out.println("This sentence has "+spaceofWord+" spacebar."+"\nThis sentence has "+(spaceofWord+1)+" word.");*/

		JOptionPane.showMessageDialog(null,"This sentence has "+spaceofWord+" spacebar."+"\nThis sentence has "+(spaceofWord+1)+" word.");
	}

}

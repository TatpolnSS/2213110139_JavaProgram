import java.util.*;
public class Lab402 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		System.out.print("Input some sentence : ");
		String sentence = scan.nextLine();
		int i=0;
		int space=0;
		while(!sentence.endsWith(".")) {		
			System.out.print("The sentence must end with full stop point : ");
			sentence = scan.nextLine();
		}
		for (i=0;i<sentence.length();i++) {
			if (sentence.charAt(i)==' '){
					System.out.println(sentence.substring(space,i));
					space=i+1;
			}
		}	
		System.out.println(sentence.substring(space,i));
	}	
}




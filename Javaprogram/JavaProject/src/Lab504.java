import java.util.*;
public class Lab504 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String fullName,firstName;
		System.out.print("Please enter your name, separated by a space.\n:");
		fullName = scan.nextLine();
		int spacebar = fullName.indexOf(" ");
		firstName = fullName.substring(0,spacebar);
		//abbreviatName(fullName);
		System.out.println(abbreviatName(fullName)+firstName);
	}
	public static String abbreviatName(String name) {
		String shortN="";
		for (int i = 0;i<name.length();i++) {
			if(name.charAt(i)==' '){
					shortN = (shortN + name.charAt(i+1)).toUpperCase()+".";
			}
		}
		return shortN;
	}
	
	
}

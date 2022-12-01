import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name: ");
		String name = scan.nextLine();
		String firstname,lastname;
		int spaceofWord=name.indexOf(" ");
		if (spaceofWord == 0) 
			System.out.println("Incorrect Name");
		else {
		firstname =(name.substring(0,name.indexOf(" ")));
		lastname =(name.substring(name.indexOf(" ")));
		System.out.println("First Name: "+firstname.toUpperCase()+"\nLast Name: "+lastname.toLowerCase());
		
	}

  }
}

import java.util.Scanner;

public class Lab505 {

	public static void main(String[] args) {
		inputStudent();

	}
	public static void inputStudent(){		
		Scanner scan = new Scanner(System.in);
		String id,subject;
		do {
		System.out.print("Enter Student Id: ");
		id = scan.nextLine();
		System.out.print("Enter Subject id: ");
		subject = scan.nextLine();
		}while(!isLength(id,subject));
		isITStudent(id);
		isITSubject(subject);
		displayData(isITStudent(id),isITSubject(subject));
		
		}	
	
	public static boolean isLength(String id, String sub ) {
		if(id.length()!=10&&sub.length()!=7) 
			return true;
		else
			return false;
	}
	
	public static boolean isITStudent(String id) {
		
		return true;
	}
	public static boolean isITSubject(String sub) {
		
		return true;
	}
	public static void displayData(boolean tId, boolean tSub) {
		
	}
}

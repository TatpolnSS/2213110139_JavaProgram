import java.util.*;
public class Lab403 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		System.out.print("Message : ");
		String message = scan.nextLine();
		if(message.toLowerCase().indexOf("nichi")>=0) {
			System.out.println("Nichi is a sentence");
		}else {
			System.out.println(message);
		}
	}

}

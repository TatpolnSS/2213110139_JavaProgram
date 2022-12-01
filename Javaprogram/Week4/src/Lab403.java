import java.util.*;
public class Lab403 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		System.out.print("Message : ");
		String message = scan.nextLine();
		message.toLowerCase();
		int index=0;
		if(message.indexOf("nichi")>=0){
			index++;
		}
		if (index!=1){
			System.out.println(message);
		}
		else {	
			System.out.println("Nichi is a sentence");
		}
	}

}

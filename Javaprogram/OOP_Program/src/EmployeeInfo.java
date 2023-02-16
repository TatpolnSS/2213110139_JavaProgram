import java.io.*;
import java.util.*;
public class EmployeeInfo {
	
	public static void main(String[] args) throws IOException {
		 Scanner console = new Scanner(System.in);
		 String choice,department;
		 System.out.print("Insert or Read data(from file)? : ");
		 choice = console.next().toLowerCase();
		 while(!choice.equals("insert")&& !choice.equals("read")) {
			 System.out.print("Please text insert or read data? : ");
			 choice = console.next().toLowerCase();
		 }
		 SaveandOpen file = new SaveandOpen();
		 if(choice.equals("insert"))
			 file.insert();
		 else {
			 System.out.print("\nEnter department: ");
			 department = console.next();
			 file.setDept(department);
			 file.read();
		 }
	}

}

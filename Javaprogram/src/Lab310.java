import java.util.*;
import java.text.*;
public class Lab310 {
	static final double COMMISSION_RATE = 0.15;
	static final int SENTINEL = -1;
	public static void main(String[] args) {
		int sales=0; 
		double salary;
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.print("Enter sales in dollars (or -1 to end):");
		sales = scan.nextInt();
			if (sales==SENTINEL) {
				break;
			}
		salary= 1000+(sales*COMMISSION_RATE);
		System.out.print("Salary is: $"+frm.format(salary)+"\n\n");
		}
		System.out.println("bye");
	}

}

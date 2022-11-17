import java.util.*;
public class Lab203 {

	public static void main(String[] args) {	
			Scanner scan = new Scanner(System.in);
			System.out.print("Input two integers(a b)");
			System.out.println();
			int num1,num2,sum;
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			sum = num1+num2;
			System.out.println("Sum of two integers:"+(sum));
			int count =0;
			while (sum!=0) {
				sum/=10;
				count++;
			}
			System.out.println("Digit number of sum of said two integers:\n"+count);
	}

}

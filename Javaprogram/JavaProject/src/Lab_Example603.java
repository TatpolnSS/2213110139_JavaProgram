import java.util.*;
public class Lab_Example603 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int[] num = new int [5];
		for (int i = 0 ;i<num.length;i++) {
			System.out.print("Input number "+(i+1)+" : ");
			num[i]=scan.nextInt();
		}
		System.out.println();
		System.out.println("Summation of positive number is "+sumOfPos(num));

	}
	public static int sumOfPos (int[] nums) {
		int sum=0;
		for (int number:nums) 
		{
			if (number >=0)
			{
				sum+=number;
			}
		}
		return sum;
	}
}

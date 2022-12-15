import java.util.*;
public class Lab602 {
	static Scanner scan = new Scanner (System.in);
	static int sum = 0;
	static double average = 0;
	public static void main(String[] args) {
		double[] score = new double [5];
		for (int i = 0 ;i<score.length;i++) {
			System.out.print("Input score of student "+(i+1)+" : ");
			score[i]=scan.nextDouble();
			sum+=score[i];
		}
		System.out.println();
		average = sum / score.length;
		System.out.print("Average of "+score.length+" student is "+average);
		System.out.println();
		for (int a=0;a<score.length;a++) 
		{
			if (score[a]>average)
			{
				System.out.println("> Student "+(a+1)+" ("+score[a]+")");
			}
		}
	}

}

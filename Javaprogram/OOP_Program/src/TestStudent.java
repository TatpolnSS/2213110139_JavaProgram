import java.util.*;

public class TestStudent {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many student in classroom : ");
		Student[] std = new Student[scan.nextInt()];// define array object
		System.out.println();
		for (int i = 0; i < std.length; i++) {
			std[i] = new Student();// declare array object , call all of method Student()
			System.out.print("Input student Name : ");
			std[i].setName(scan.next());
			System.out.print("Input student Score : ");
			std[i].setScore(scan.nextInt());
			while (!std[i].checkScore()) {
				System.out.print("Input student score, again: ");
				std[i].setScore(scan.nextInt());
			}
			System.out.println("-------------------------------");
		}
		for (Student STD : std) {
			if (STD.isPass()) {
				System.out.println(">> " + STD.getName() + " get grade "  + findGrade(STD.getScore()));
			}
			/*
			 * for(int i=0;i<std.length;i++) { if (std[i].isPass()) {
			 * System.out.println(">> "+std[i].getName()+" ("+std[i].getScore()+")");
			 */

		}
	}
	static String findGrade(int score) {
		String grade="";
		if (score>=80) {
			grade ="A";
		}
		else if (score<80&&score>74) {
			grade ="B+";
		}
		else if (score<75&&score>69) {
			grade ="B";
		}
		else if (score<70&&score>64) {
			grade ="C+";
		}
		else if (score<65&&score>59) {
			grade ="C";
		}
		else if (score<60&&score>54) {
			grade ="D+";
		}	
		else if (score<55&&score>49) {
			grade ="D";
		}
		else {
			grade ="F";
		}
		return grade;
	}
	
}

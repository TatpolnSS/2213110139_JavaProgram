import java.util.Scanner;

public class MovieDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input movie id   : ");
		String mId = scan.nextLine();
		System.out.print("Input movie name : ");
		String mName = scan.nextLine();
		System.out.println();
		System.out.print("Input director name   : ");
		String dName = scan.nextLine();
		System.out.print("Input director e-mail : ");
		String dEmail = scan.nextLine();
		System.out.print("Input director gender : ");
		char dGender = scan.next().toLowerCase().charAt(0);
		while (dGender!='m'&&dGender!='f') {
			System.out.print("Input director gender, again : ");
			dGender = scan.next().charAt(0);
		}
		System.out.println();
		System.out.print("Input movie theater no. : ");
		int mNo = scan.nextInt();
		while (mNo < 1 || mNo > 15) {
			System.out.print("Please input 1 - 15 only : ");
			mNo = scan.nextInt();
		}
		Theater theater = new Theater(mId,mName,new Director(dName,dEmail,dGender),mNo);
		System.out.println(theater);
	}
}

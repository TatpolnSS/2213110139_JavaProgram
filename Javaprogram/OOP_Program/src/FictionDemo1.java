import java.util.Scanner;

public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Book Title   : ");
		String title = scan.nextLine();
		System.out.print("Input Public Year  : ");
		int year = scan.nextInt();
		FictionBook book = new FictionBook(title,year);
		System.out.print("Input Auhor Name   : ");
		scan.nextLine();
		String name = scan.nextLine();
		System.out.print("Input Author Email : ");
		String mail = scan.nextLine();
		book.setAuthorName(name);
		book.setEmail(mail);
		book.checkFromatName();
		book.checkEmail();
		System.out.println(book);
	}

}

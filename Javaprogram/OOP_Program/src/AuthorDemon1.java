import java.util.Scanner;

public class AuthorDemon1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input author name   : ");
		String name=scan.nextLine();
		System.out.print("Input author email  : ");
		String email=scan.nextLine();
		System.out.print("Input author gender : ");
		char gender=scan.nextLine().toLowerCase().charAt(0);
		System.out.println();
		Author author = new Author(name,email,gender);
		System.out.println(author.toString());
	}

}

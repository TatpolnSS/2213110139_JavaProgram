import java.util.*;

public class BookDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input author name  :");
		String name = scan.nextLine();
		System.out.print("Input author email :");
		String email = scan.nextLine();

		Author1 auth = new Author1(name, email);
		System.out.println(auth);
		System.out.println();

		System.out.print("Input book title :");
		String title = scan.nextLine();
		System.out.print("Input book page :");
		int page = scan.nextInt();

		Book1 book1 = new Book1(title, auth, page);
		System.out.println(book1);
	}

}

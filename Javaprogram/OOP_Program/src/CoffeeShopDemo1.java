import java.util.Scanner;

public class CoffeeShopDemo1 {

	public static void main(String[] args) {
		Barista staff1 = new Barista("Leon",'M');
		Barista staff2 = new Barista("Claire",'F');
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Choose Drink Type: ");
		int type = scan.nextInt();
		System.out.print("Choose Coffee Type: ");
		int cType = scan.nextInt();
		System.out.print("Choose Coffee Size: ");
		char cSize = scan.next().toLowerCase().charAt(0);
		System.out.print("Choose Barista : ");
		int bar = scan.nextInt();
		
	}

}

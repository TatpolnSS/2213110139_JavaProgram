import java.util.*;
public class CheckStockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many product list in stock : ");
		Product[] productList = new Product[scan.nextInt()];
		System.out.println();
		for(int i = 0; i<productList.length;i++) {
			productList[i] = new Product();
			System.out.print("Input product id   : ");
			productList[i].setId(scan.next());
			System.out.print("Input product unit : ");
			productList[i].setUnit(scan.nextInt());
			System.out.println();
		}
		System.out.println("----------------------------------");
		System.out.println("List of product in 'Low' status.");
		System.out.println("----------------------------------");
		for(Product prod : productList) {
			if (prod.getUnit() < 5) {
				System.out.println(">> "+prod.getId()+" has "+prod.getUnit()+" units");
			}
		}
		System.out.println("----------------------------------");
		System.out.println("List of product in 'NORMAL' status.");
		System.out.println("----------------------------------");
		for(Product prod : productList) {
			if (prod.getUnit() >= 5&&prod.getUnit() <=50) {
				System.out.println(">> "+prod.getId()+" has "+prod.getUnit()+" units");
			}
		}
		System.out.println("----------------------------------");
		System.out.println("List of product in 'HIGH' status.");
		System.out.println("----------------------------------");
		for(Product prod : productList) {
			if (prod.getUnit() >50) {
				System.out.println(">> "+prod.getId()+" has "+prod.getUnit()+" units");
			}
		}
	}

}

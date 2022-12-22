import java.util.*;
import java.text.*;
public class StockProduct {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.00");
		Scanner scan = new Scanner(System.in);
		Product[] productList = new Product[4];
		for (int i = 0; i < productList.length; i++) {
			productList[i] = new Product();
			System.out.print("Input product Id    : ");
			productList[i].setId(scan.next());
			System.out.print("Input product Unit  : ");
			productList[i].setUnit(scan.nextInt());
			System.out.print("Input product Price : ");
			productList[i].setPrice(scan.nextDouble());
			System.out.println();
			while (!productList[i].check()) {
				System.out.print("Input product Unit  : ");
				productList[i].setUnit(scan.nextInt());
				System.out.print("Input product Price : ");
				productList[i].setPrice(scan.nextDouble());
			}
			System.out.println("-----------------------------------------------");
			double sum = 0;
			for (Product Prod : productList) 
			{
				sum += Prod.calculate();
				System.out.println("Product ID : " + Prod.getId() + ", Total Price = " + df.format(Prod.calculate()) + (" baht"));
			}
			System.out.println("-----------------------------------------------");
			System.out.println("Total price of all product is " + df.format(sum) + "baht.");
		}
	}
}

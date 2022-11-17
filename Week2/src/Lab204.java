import javax.swing.*;
public class Lab204 {
	static final double TAX_RATE = .0625;
	public static void main(String[] args) {
		String cdid,cdTitle,cdprice,cdquantity;
		cdid = JOptionPane.showInputDialog(null,"This program calculate the total cost of a CD order\nPlease enter the ID of the CD");
		cdTitle = JOptionPane.showInputDialog(null,"Please enter the title of the CD");	
		cdprice = JOptionPane.showInputDialog(null,"Please enter price of the CD in U.S. dollars");
		double cdPrice = Double.parseDouble(cdprice);
		cdquantity = JOptionPane.showInputDialog(null,"Please enter the quantity to be purchase");
		int cdQuantity = Integer.parseInt(cdquantity);
		double cdSubtotal = cdPrice*cdQuantity;
		double cdTotal = cdSubtotal*(1+TAX_RATE);
		JOptionPane.showMessageDialog(null,"Summary of the transaction:\n"+"\nCD ID: "+cdid+"\nCD Title: "+cdTitle
				+"\nCD Unit price:$"+cdPrice+"\nCD Quantity: "+cdQuantity+"\n\nSubtotal:$"+cdSubtotal+
				"\nTax rate: "+TAX_RATE*100+"%"+"\nTotal:$"+cdTotal+"\n\nEnd of Program");
	}

}

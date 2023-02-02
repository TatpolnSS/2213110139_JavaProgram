
public class Coffee extends Drink {

	private int typeCoffee;
	private char sizeCoffee;
	private Barista barista;
	
	public Coffee (int type, char sizeCoffee,int typeCoffee,Barista barista) {
		super();
		this.sizeCoffee=sizeCoffee;
		this.typeCoffee=typeCoffee;
		this.barista=barista;
	}
	public Coffee (int type,int typeCoffee) {
		super();
		this.typeCoffee=typeCoffee;
	}
	public Barista getBarista() {
		return this.barista;
	}
	public String getTypeName() {
		if(typeCoffee==1) {
			return "Americano";
		}
		else if(typeCoffee==2) {
			return "Espresso";
		}
		else if(typeCoffee==3) {
			return "Cappuccino";
		}
		else return null;
	}
	public int getTypePrice() {
		if(typeCoffee==1) {
			return 50;
		}
		else if(typeCoffee==2) {
			return 55;
		}
		else if(typeCoffee==3) {
			return 65;
		}
		else return 0;
	}
	public String getsizeCoffee() {
		if (sizeCoffee == 'S') {
			return "Short";
		} else if (sizeCoffee == 'T') {
			return "Tall";
		} else if (sizeCoffee == 'G') {
			return "Grande";
		} else if (sizeCoffee == 'v') {
			return "Venti";
		} else
			return null;
	}
	public int getSizePrice() {
		if (sizeCoffee == 'S') {
			return 100;
		} else if (sizeCoffee == 'T') {
			return 150;
		} else if (sizeCoffee == 'G') {
			return 200;
		} else if (sizeCoffee == 'v') {
			return 250;
		} else
			return 0;
	}
	public int getTotalPrice() {
		return getTypePrice()+getSizePrice()+super.getTypePrice();
	}
	
	public String toString() {
		return super.getTypeName()+" "+getTypeName()+"("+getSizeName()+") is "+getTotalPrice()+" baht";
	}	
}

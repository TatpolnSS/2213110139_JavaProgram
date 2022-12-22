
public class Product {
	private String id;
	private int unit;
	private double price;

	public void setId(String ID) {
		id = ID;
	}

	public String getId() {
		return id;
	}

	public void setUnit(int UNIT) {
		unit = UNIT;
	}

	public int getUnit() {
		return unit;
	}

	public void setPrice(double PRICE) {
		price = PRICE;
	}

	public double getPrice() {
		return price;
	}

	public double calculate() {
		return unit * price;
	}

	public boolean check() {
		if (unit < 0 || price < 0)
			return false;
		else
			return true;
	}
}

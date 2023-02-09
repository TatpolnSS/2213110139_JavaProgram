
public class Cylinder extends Circle {

	private double Height;
	
	public Cylinder(double radius , double height) {
		super(radius,null);
		this.Height=height;
	}
	
	public double getHeight() {
		return this.Height;
	}
	
	public double getVolume() {
		return super.getArea()*this.Height;
	}
	
	public double getArea() {
		return 2*Math.PI*(this.Height+super.getRadius());
	}
	
	public String toString() {
		return "height ="+getHeight()+","+super.toString();
	}
	
}

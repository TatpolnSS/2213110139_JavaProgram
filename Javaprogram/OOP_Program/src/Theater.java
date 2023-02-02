
public class Theater extends Movie {

	private int TheaterNo;
	
	public Theater(String id,String name,Director director,int TheaterNo) {
		super(id,name,director);
		this.TheaterNo=TheaterNo;
	}	
	
	public Theater() {
		super();
		this.TheaterNo=0;
	}
	
	public String getTheaterName() {
		if (this.TheaterNo>0&&this.TheaterNo<12) {
			return "Basic Theater";
		}
		else if (this.TheaterNo>11&&this.TheaterNo<15) {
			return "Sweet Theater";
		}
		else if (this.TheaterNo==15) {
			return "Premium Theater";
		}
		else return null;

	}
	
	public String toString() {
		return getTheaterName()+": "+super.toString();
	}
	
}

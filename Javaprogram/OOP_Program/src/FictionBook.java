import java.time.Year;

public class FictionBook implements Author2,Book2{

	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	
	public FictionBook(String title,int publicYear) {
		this.title=title;
		this.publicYear=publicYear;
	}
	
	public void setAuthorName(String name) {
		this.author_name=name;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	public boolean checkFromatName() {
		if (this.author_name.trim().contains(" ")) {
			return true;
		}
		else return false;	
	}
	@Override
	public String getTitle() {
		return this.title;
	}
	@Override
	public String getLastName() {
		int sp = this.author_name.lastIndexOf(" ");
		return this.author_name.toUpperCase() .substring(sp+1);
	}
	@Override
	public String getFirstName() {
		int sp = this.author_name.lastIndexOf(" ");
		return this.author_name.toUpperCase().substring(0,sp);
	}
	@Override
	public boolean checkEmail() {
	if (this.email.endsWith("@hotmail.com")||this.email.endsWith("windowslive.com")){
			return true;
		}
	else return false;
	}
	@Override
	public int totalPublicYear() {
		return Year.now().getValue()-this.publicYear;
	}
	
	public String toString() {
		return getTitle()+" write by "+getLastName().substring(0)+"."+getFirstName()+" ("+this.email+") Published for "+totalPublicYear()+" years";
	}


}


public class PersonalInfo {
	private Person name;
	private Date bDay;
	private int PersonID;

	public PersonalInfo() {
		name = new Person();
		bDay = new Date();
		PersonID = 0;
	}

	public PersonalInfo(String first, String last, int month, int day, int year, int ID) {
		name = new Person(first, last);
		bDay = new Date(month, day, year);
		PersonID = ID;
	}

	public void setPersonalInfo(String first, String last, int month, int day, int year, int ID) {
		name.setName(first, last);
		bDay.setDate(month, day, year);
		PersonID = ID;
	}

	public String ToString() {
		return "Name :" + name.toString() + 
				"\nDate of birth: " + bDay.toString() + 
				"\nPersonal ID" + PersonID;
	}
}

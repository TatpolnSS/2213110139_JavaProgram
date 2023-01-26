
public class TestStudent {

	public static void main(String[] args) {
		// Test Constructor and toString()
		Student jirapat = new Student("Jirapat Anantasiri", "1 Happy Ave");
		System.out.println(jirapat);

		// Test Setters and Getters;
		jirapat.setAddress("25 pattanakarn");
		System.out.println(jirapat);
		System.out.println(jirapat.getName());
		System.out.println(jirapat.getAddress());

		// Test addCourseGrade(),printGrades(), and geAverageGrade()
		jirapat.addCourseGrade("INT107", 25);
		jirapat.addCourseGrade("INT108", 79);
		jirapat.addCourseGrade("MSC202", 69);
		jirapat.printGrades();

		System.out.printf("The average grade is %.2f", jirapat.getAverageGrade());
	}

}

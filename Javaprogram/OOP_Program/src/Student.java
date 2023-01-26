
public class Student {
	// The private instance variables
	private String name;
	private String address;
	// The courses and grades for the courses and kept in 2 parallel arrays
	private String[] courses;
	private int[] grades; // valid range is [0-100]
	private int numCourses; // Number of courses
	private static final int MAX_COURSE = 30; // Maximum number of courses taken

	/* Constructor a Student instance with the given input */
	public Student(String name, String address) {
		this.name = name;
		this.address = address;
		courses = new String[MAX_COURSE];
		grades = new int[MAX_COURSE];
		numCourses = 0;
	}

	// The public getters and setters.
	// No setter for name as it is not designed to be changed.
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return getName() + " (" + getAddress() + (")");
	}

	public void addCourseGrade(String course, int grade) {
		courses[numCourses] = course;
		grades[numCourses] = grade;
		++numCourses;
	}

	public void printGrades() {
		System.out.print(name);
		for (int i = 0; i < numCourses; i++) {
			System.out.print(" " + courses[i] + ":" + grades[i]);
		}
		System.out.println();
	}

	public double getAverageGrade() {
		int sum = 0;
		for (int i = 0; i < numCourses; i++) {
			sum += grades[i];
		}
		return (double) sum / numCourses;
	}

}
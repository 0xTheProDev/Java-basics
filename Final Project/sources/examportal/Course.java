package examportal;

public class Course {
	static int Counter;
	private int courseID;
	private String name;
	// private Lecturer lecturer;
	private int grade;
	private int credit;
	
	public Course(String s, int c) throws java.lang.Exception {
		this.name = s;
		// this.lecturer = l;
		if (c <= 0)
			throw new Exception("Course: Course credit cannot be zero or negative!");
		this.credit = c;
		this.grade = 0;
		this.courseID = ++Counter;
	}
	public int courseID() {
		return this.courseID;
	}
	public void setGrade(int g) throws java.lang.Exception {
		if (g < 2 || g > 10)
			throw new Exception("Course: Invalid grade assigned!");
		this.grade = g;
	}
	public int getGrade() {
		return this.grade;
	}
	public int getCredit() {
		return (this.grade * this.credit);
	}
}
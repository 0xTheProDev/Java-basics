package examportal;

public class Course {
	static int Counter;
	private int courseID;
	private String name;
	private Lecturer lecturer;
	private int credit;
	
	public Course(String s, Lecturer l, int c) {
		this.name = s;
		this.lecturer = l;
		this.credit = c;
		this.courseID = ++Counter;
	}	
}
package examportal;

public class Semester {
	static int Counter;
	private int semesterID;
	private Course courses[];
	
	public Semester(Course c[]) {
		this.courses = c;
		this.semesterID = ++Counter;
	}
}
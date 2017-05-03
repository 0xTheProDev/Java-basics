package examportal;

public class Semester {
	static int Counter;
	private int semesterID;
	private double SGPA;
	private Course courses[];
	
	public Semester(Course c[]) throws java.lang.Exception {
		this.courses = c.clone();
		this.SGPA = 0.0;
		this.semesterID = ++Counter;
	}
	public void setGrade(int g[]) throws java.lang.Exception {
		if (g.length != this.courses.length)
			throw new Exception("Semester: Invalid number of grade supplied!");
		for (int i = 0, n = g.length; i < n; i++)
			this.courses[i].setGrade(g[i]);
	}
	public double getGrade() {
		int credit = 0, grade = 0, cgrade = 0;
		double total = 0.0;
		for (int i = 0, n = courses.length; i < n; i++) {
			grade = courses[i].getCredit();
			cgrade = courses[i].getGrade();
			if (cgrade != 0)
				credit += grade / cgrade;
			total += (double) grade;
		}
		this.SGPA = credit == 0 ? 0.0 : total / credit;
		return this.SGPA;
	}
}
package examportal;

public class Student extends Person {
	static int Counter;	
	private Registration regist;	
	private int rollNo;
	private double CGPA;
	private Semester sems[];
	
	public Student(String n, String a, Registration r, Semester s[]) throws java.lang.Exception {
		super(n, a);
		this.regist = r;
		this.sems = s.clone();
		this.CGPA = 0.0;
		this.rollNo = ++Counter;
	}
	public String getRegist() {
		return this.regist.getID();
	}
	public void setGrade(int sem, int g[]) throws java.lang.Exception {
		if (sem < 1 || sem > sems.length)
			throw new Exception("Student: Invalid Semester ID for Grade Calculation");
		sems[--sem].setGrade(g);
	}
	public double getGrade() {
		if (this.CGPA == 0.0) {
			double total = 0.0, sgpa = 0.0;
			int N = 0;
			for (int i = 0, n = sems.length; i < n; i++) {
				sgpa = sems[i].getGrade();
				if (sgpa == 0.0)
					break;
				total += sgpa;
				N++;
			}
			this.CGPA = total / N;
		}
		return this.CGPA;
	}
	public double getGrade(int sem) throws java.lang.Exception {
		if (sem < 1 || sem > sems.length)
			throw new Exception("Student: Invalid Semester ID for Grade Calculation");
		return sems[--sem].getGrade();
	}
}
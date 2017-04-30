package examportal;

public class Registration {
	static int Counter;
	private int regNo;
	private int collegeID;
	
	public Registration(int c) {
		this.collegeID = c;
		this.regNo = ++Counter;
	}
	public void display() {
		System.out.println(this.collegeID + this.regNo);
	}
}
package examportal;

public class Student extends Person{
	static int Counter;	
	private Registration regist;
	private int rollNo;
	
	public Student(String n, String a, Registration r) {
		super(n, a);
		this.regist = r;
		this.rollNo = ++Counter;
	}
}
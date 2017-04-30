package examportal;

public class Lecturer extends Person{
	static int Counter;
	private int socialSID;
	
	public Lecturer(String n, String a) {
		super(n, a);
		this.socialSID = ++Counter;
	}
}
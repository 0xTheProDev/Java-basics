import examportal.*;

class Test {
	public static void main(String args[]) {
		Person p = new Lecturer("John", "California");
		Registration r = new Registration(300);
		r.display();
	}
}
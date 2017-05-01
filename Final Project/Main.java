import examportal.*;

public class Main {
	public static void main(String args[]) {
		try {
			Course cs[] = {new Course("Introduction to Programming", 3), new Course("OOP with Java", 3)};
			Semester s[] = {new Semester(cs)};
			Student st = new Student("Abhinab Roy", "Dumdum", new Registration(300, 215), s);
			int g[] = new int[2];
			g[0] = 7;
			g[1] = 8;
			st.setGrade(1, g);
			System.out.println("Registration: " + st.getRegist() + "\tCGPA: " + st.getGrade());
		} catch(Exception e) {
			System.err.println("Exception\n" + e.getMessage());
		}
	}
}
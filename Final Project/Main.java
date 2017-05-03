import examportal.*;
import java.io.DataInputStream;

public class Main {
	public static void main(String args[]) throws IOException {
		final int collegeID = 300, branchID = 215;
		try {
			Course cs[][] = {
				{
					new Course("Introduction to Programming", 3),
					new Course("OOP with Java", 3)
				},
				{
					new Course("Introduction to DBMS", 3),
					new Course("Formal Language and Automata", 3)
				}
			};
			Semester s[] = new Semester[cs.length];
			for (int i = 0, n = cs.length; i < n; i++)
				s[i] = new Semester(cs[i]);
		} catch(Exception e) {
			System.err.println("Exception\n" + e.getMessage());
		}
		DataInputStream dIn = new DataInputStream(System.in);
		System.out.println("Enter the number of Students: ");
		int N = 0;
		try {
			N = Integer.parseInt(dIn.readLine());
		} catch (Exception e) {
			System.err.println("Exception Caught:\n" + e.getMessage());
		}
		Student students[] = new Student[N];
		/*
		try {
			Course cs[][] = {
				{
					new Course("Introduction to Programming", 3),
					new Course("OOP with Java", 3)
				},
				{
					new Course("Introduction to DBMS", 3),
					new Course("Formal Language and Automata", 3)
				}
			};
			Semester s[] = new Semester[cs.length];
			for (int i = 0, n = cs.length; i < n; i++)
				s[i] = new Semester(cs[i]);
			Student st[] = {
				new Student("Abhinab Roy", "Dumdum", new Registration(collegeID, branchID), s),
				new Student("Subinoy Sen", "Kolkata", new Registration(collegeID, branchID), s)
			};
			int g[][] = {
				{
					7, 8
				},
				{
					9, 9
				}
			};
			for (int i = 0, n = st.length; i < n; i++) {
				st[i].setGrade(1, g[i]);
				System.out.println("Registration: " + st[i].getRegist() + "\tCGPA: " + st[i].getGrade());
			}
		} catch(Exception e) {
			System.err.println("Exception\n" + e.getMessage());
		}
		*/
	}
}
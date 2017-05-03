import examportal.*;
import java.io.DataInputStream;

public class Main {
	public static void main(String args[]) {
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
			Semester sems[] = new Semester[cs.length];
			for (int i = 0, n = cs.length; i < n; i++)
				sems[i] = new Semester(cs[i]);
			DataInputStream dIn = new DataInputStream(System.in);
			System.out.print("Enter the Semester: ");
			int S = Integer.parseInt(dIn.readLine()) - 1;
			int L = cs[S].length;
			System.out.print("Enter the number of Students: ");
			int N = Integer.parseInt(dIn.readLine());
			Student students[] = new Student[N];
			int grades[] = new int[L];
			for (int i = 0; i < N; i++) {
				System.out.print("Name: ");
				String name = dIn.readLine();
				System.out.print("Address: ");
				String addr = dIn.readLine();
				students[i] = new Student(name, addr, new Registration(collegeID, branchID), sems);
				for (int j = 0; j < L; j++) {
					System.out.print("Enter the Grade for " + cs[S][j].courseID() + ": ");
					grades[j] = Integer.parseInt(dIn.readLine());
				}
				students[i].setGrade(++S, grades);
				System.out.println("Registration: " + students[i].getRegist() + "\tCGPA: " + students[i].getGrade());
			}
			dIn.close();
		} catch(Exception e) {
			System.err.println("Exception\n" + e.getMessage());
		}
	}
}
import java.lang.Exception;

class Student {
	private	String name;
	private int age;
	Student() {
		this.name = "";
		this.age = 0;
	}
	Student(String n, int g) throws Exception {
		this.name = n;
		if (g <= 0)
			throw new Exception("Student: Age cannot be zero or negative");
		this.age = g;
	}
	void display() throws Exception {
		if (this.age == 0)
			throw new Exception("Student: Has not been initialized properly");
		System.out.println("Name: " + this.name + "\nAge: " + this.age);
	}
}

class Test {
	public static void main(String args[]) {
		Student st = new Student();
		try {
			st = new Student(args[0], Integer.parseInt(args[1]));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				st.display();
			} catch(Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}
}

import java.lang.Exception;
import java.lang.IndexOutOfBoundsException;
import java.lang.NumberFormatException;

class InvalidAgeException extends Exception {
	InvalidAgeException(String className, int age) {
		super(className + ": Age cannot be zero or negative, found " + age);
	}
}

class NonInitializedException extends Exception {
	NonInitializedException(String className) {
		super(className + ": Object has not been initialized properly");
	}
}

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
			throw new InvalidAgeException(this.getClass().getName(), g);
		this.age = g;
	}
	void display() throws Exception {
		if (this.age == 0)
			throw new NonInitializedException(this.getClass().getName());
		System.out.println("Name: " + this.name + "\nAge: " + this.age);
	}
}

class Test {
	public static void main(String args[]) {
		Student st = new Student();
		try {
			st = new Student(args[0], Integer.parseInt(args[1]));
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Usage: java Test <name: String> <age: Integer>");
		} catch (NumberFormatException e) {
			System.err.println("Age supplied as argument is not Integer.");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				st.display();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

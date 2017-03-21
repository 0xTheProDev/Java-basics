class Student{
	int roll, year;
	String name;
	
	Student(String n, int a, int b){
		name = n;
		roll = a;
		year = b;
	}
	void showData(){
		System.out.println("Name: " + name);
		System.out.println("Roll: " + roll);
		System.out.println("Year: " + year);
	}
}

class Test{
	public static void main(String args[]){
		Student stud = new Student("Progyan", 15, 2);
		stud.showData();
	}
}

class Student {
	static int counter = 0;
	String name;
	int roll, age;
	
	Student(String arg1, int arg2){
		name = arg1;
		age = arg2;
		roll = ++counter;
	}
	void show(){
		System.out.println("Name: " + name + "\tRoll No: " + roll);
	}
}

class ArtsStudent extends Student {
	double history;
	
	ArtsStudent(String arg1, int arg2, double arg3){
		super(arg1, arg2);
		history = arg3;
	}
}

class ScienceStudent extends Student {
	double maths;
	
	ScienceStudent(String arg1, int arg2, double arg3){
		super(arg1, arg2);
		maths = arg3;
	}
}

class Test {
	public static void main(String args[]){
		ArtsStudent arts = new ArtsStudent("Sumita Roy", 18, 92.0);
		ScienceStudent sct = new ScienceStudent("Romila Sen", 19, 96.5);
		arts.show();
		sct.show();
	}
}
class Student {
	double Math, Phys, Chem;
	String name;
	Student(String n, double P, double C, double M) {
		name = n;
		Math = M;
		Phys = P;
		Chem = C;
	}
}

class Test {
	public static void main(String args[]) {
		if (args.length != 1)
			return;
		Student st1 = new Student("DJ", 30.0, 50.0, 60.0);
		Student st2 = new Student("MJ", 20.0, 60.0, 40.0);
		Student st3 = new Student("RJ", 40.0, 50.0, 30.0);
		
		Student st[] = new Student[3];
		st[0] = st1;
		st[1] = st2;
		st[2] = st3;

		if (args[0].compareTo("Math") == 0){
			for (int i = 0; i < 3; i++)
				for (int j = 0; j < i; j++)
					if (st[i].Math < st[j].Math) {
						Student temp = st[i];
						st[i] = st[j];
						st[j] = temp;
					}
		}
		else if (args[0].compareTo("Phys") == 0){
			for (int i = 0; i < 3; i++)
				for (int j = 0; j < i; j++)
					if (st[i].Phys < st[j].Phys) {
						Student temp = st[i];
						st[i] = st[j];
						st[j] = temp;
					}
		}
		else if (args[0].compareTo("Chem") == 0){
			for (int i = 0; i < 3; i++)
				for (int j = 0; j < i; j++)
					if (st[i].Chem < st[j].Chem) {
						Student temp = st[i];
						st[i] = st[j];
						st[j] = temp;
					}
		}
		for (int i = 0; i < 3; i++){
			System.out.println("Name: " + st[i].name);
			System.out.println("Math: " + st[i].Math);
			System.out.println("Phys: " + st[i].Phys);
			System.out.println("Chem: " + st[i].Chem);
		}
	}
}

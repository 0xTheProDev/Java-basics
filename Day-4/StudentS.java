import java.util.Vector;

class Student {
	String name, stream;
	double sub1, sub2, sub3;
	Student(String n, String s, double x, double y, double z) {
		name = n;
		stream = s;
		sub1 = x;
		sub2 = y;
		sub3 = z;
	}
}

class Test {
	public static void main(String args[]) {
		if (args.length != 1)
			return;
		Vector v = new Vector();
		Student st;
		st = new Student("Horipodo", "Arts", 30, 40, 50);
		v.add(st);
		st = new Student("Harekrishan", "Science", 20, 60, 70);
		v.add(st);
		st = new Student("Banchordas", "Arts", 20, 30, 40);
		v.add(st);

		for (int i = 0; i < 3; i++){
			st = (Student) v.elementAt(i);
			if (st.stream.compareTo(args[0]) == 0){
				System.out.println("Name: " + st.name);
				System.out.println("Stream: " + st.stream);
				System.out.println("Sub1: " + st.sub1);
				System.out.println("Sub2: " + st.sub2);
				System.out.println("Sub3: " + st.sub3);
			}
		}
	}
}

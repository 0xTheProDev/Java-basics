import java.lang.Thread;

class MyThreadA extends Thread {
	int A[];
	MyThreadA (int a[]) {
		A = a;
	}
	public void run() {
		int Max = A[0];
		for (int i = 1, n = A.length; i < n; i++) {
			if (A[i] > Max)
				Max = A[i];
		}
		System.out.println("MAX: " + Max);
	}
}

class MyThreadB extends Thread {
	int A[];
	MyThreadB (int a[]) {
		A = a;
	}
	public void run() {
		int Min = A[0];
		for (int i = 1, n = A.length; i < n; i++) {
			if (A[i] < Min)
				Min = A[i];
		}
		System.out.println("MIN: " + Min);
	}
}

class MyThreadC extends Thread {
	int A[];
	MyThreadC (int a[]) {
		A = a;
	}
	public void run() {
		int Max = A[0], SMax = A[0];
		for (int i = 1, n = A.length; i < n; i++) {
			if (A[i] > Max) {
				SMax = Max;
				Max = A[i];
			}
			else if (A[i] > SMax)
				SMax = A[i];
		}
		System.out.println("Second MAX: " + SMax);
	}
}

class MyThreadD extends Thread {
	int A[];
	MyThreadD (int a[]) {
		A = a;
	}
	public void run() {
		int Min = A[0], SMin = A[0];
		for (int i = 1, n = A.length; i < n; i++) {
			if (A[i] > Min)
				if (A[i] < SMin || Min == SMin)
					SMin = A[i];
		}
		System.out.println("Second MIN: " + SMin);
	}
}

class Test {
	public static void main(String args[]) {
		int A[] = new int[args.length];
		for (int i = 0, n = args.length; i < n; i++) {
			try {
				A[i] = Integer.parseInt(args[i]);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		MyThreadA th1 = new MyThreadA(A);
		MyThreadB th2 = new MyThreadB(A);
		MyThreadC th3 = new MyThreadC(A);
		MyThreadD th4 = new MyThreadD(A);
		th1.start();
		th2.start();
		th3.start();
		th4.start();
	}
}

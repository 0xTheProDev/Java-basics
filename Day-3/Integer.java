class Test{
	public static void main(String args[]){
		int A, min = 0, max = 0, sum = 0;
		for (int i = 0; i < args.length; i++){
			A = Integer.parseInt(args[i]);
			if (sum == 0)
				min = max = A;
			sum += A;
			if (A > max)
				max = A;
			if (A < min)
				min = A;
		}
		System.out.println("Sum: " + sum + "\nMax: " + max + "\nMin: " + min);
	}
}

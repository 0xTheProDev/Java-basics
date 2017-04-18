class Test{
	public static void main(String args[]){
		float A[] = new float[args.length];
		for (int i = 0; i < args.length; i++)
			A[i] = Float.parseFloat(args[i]);
		for(int i = 0; i < A.length; i++)
			for(int j = 0; j < i; j++)
				if (A[j] > A[i]){
					float temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
		for(int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");
		System.out.println();
	}
}

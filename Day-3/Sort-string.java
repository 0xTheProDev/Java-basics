class Test{
	public static void main(String args[]){
		for(int i = 0; i < args.length; i++)
			for(int j = 0; j < i; j++)
				if (args[i].compareTo(args[j]) < 0){
					String temp = args[i];
					args[i] = args[j];
					args[j] = temp;
				}
		for(int i = 0; i < args.length; i++)
			System.out.print(args[i] + " ");
		System.out.println();
	}
}

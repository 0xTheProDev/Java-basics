import java.util.*;

class Test{		
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int m = 0, p = n;
		while(n != 0){
			m = m * 10 + n % 10;
			n = n / 10;
		}
		System.out.println("Reverse of " + p +" is: "+ m);
	}
}


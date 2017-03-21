import java.util.*;

class Test{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int m = 0, q = n;
		while(q != 0){
			m += q % 10;
			q /= 10;
		}
		System.out.println("Sum of the digits of " + n +" is: " + m);
	}
}

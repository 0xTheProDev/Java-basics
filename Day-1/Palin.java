import java.util.*;

class Test{
	public static boolean isPalin(int n){
		if(n < 10)
			return true;
		if(n < 100 && n % 10 == n / 10)
			return true;
		if(n < 1000 && n % 10 == n / 100)
			return true;
		if(n < 10000 && n % 10 == n / 1000 && (n / 10) % 10 == (n / 100) % 10)
			return true;
		return false;
	}	

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		if(isPalin(n))
			System.out.println("This is a Palindrome");
		else
			System.out.println("This is not a Palindrome");
	}
}

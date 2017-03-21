import java.util.*;

class Test{	
	public static void main(String args[]){
		boolean[] nprime = new boolean[100];
		nprime[0] = nprime[1] = true;
		for(int i = 2; i < 100; i++)
			if(!nprime[i])
				for(int j = 2; i * j < 100; j++)
					nprime[i * j] = true;
		for(int i = 1; i < 100; i++)
			if(!nprime[i])
				System.out.println(i);
	}
}

import java.util.*;
import java.io.*;

public class prac_1309 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long result = factorial(n);
		while(n != 0) {
			if(n != 1)
				System.out.println(n+"! = "+n+" * "+(n-1)+"!");
			else
				System.out.println(n+"! = "+n);
			n--;
		}
		System.out.println(result);
	}
	
	static long factorial(int x) {
		if(x >= 1)
			return x * factorial(x-1);
		return 1;
	}
}

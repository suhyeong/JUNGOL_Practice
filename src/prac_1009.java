import java.util.*;

public class prac_1009 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		while(true) {
			int N = s.nextInt();
			int sum=0;
			int M = N;
			if(N == 0)
				break;
			String str = String.valueOf(N);
			
			for(int i=str.length()-1;i>=0;i--) {
				if(str.charAt(i) == '0') {
					if(i != str.length()-1 && str.charAt(i-1) != '0' && str.charAt(i+1) != '0') {
						System.out.print(str.charAt(i));
					}
				} else {
					System.out.print(str.charAt(i));
				}
			}
			System.out.print(" ");
			while(M != 0) {
				sum += M%10;
				M = M/10;
			}
			System.out.println(sum);
		}
	}
}

import java.util.*;

public class prac_1402 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int K = s.nextInt();
		int divisor_num = 0;
		
		for(int i=0;i<N;i++) {
			if(N%(i+1) == 0) {
				divisor_num++;
				if(divisor_num == K) {
					System.out.println(i+1);
					return;
				}
			}
		}
		if(divisor_num < K)
			System.out.println(0);
	}
}

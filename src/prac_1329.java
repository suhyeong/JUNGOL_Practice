import java.util.*;

public class prac_1329 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int m = (N/2)+1;
		
		if(N < 0 || N > 100 || N%2 != 1 ) {
			System.out.println("INPUT ERROR!");
		} else {
			for(int i=0;i<N;i++) {
				if(i < m) {
					for(int k=0;k<i;k++) {
						System.out.print(" ");
					}
					for(int j=0;j<i*2+1;j++) {
						System.out.print("*");
					}
					System.out.println();
				} else {
					for(int k=1;k<N-i;k++) {
						System.out.print(" ");
					}
					for(int j=1;j<N*2-i*2;j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
		}
	}
}

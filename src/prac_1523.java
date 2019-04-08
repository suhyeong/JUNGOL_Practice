import java.util.*;

public class prac_1523 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt(); //삼각형 크기
		int m = s.nextInt(); //종류
		char ch = '*';
		
		if(N < 1 || N > 100 || m < 1 || m > 3)
			System.out.println("INPUT ERROR!");
		else {
			switch(m) {
			case 1: {
				for(int i=0;i<N;i++) {
					for(int j=0;j<i+1;j++) {
						System.out.print(ch);
					}
					System.out.println();
				}
				break;
			}
			case 2: {
				for(int i=N;i>=0;i--) {
					for(int j=0;j<i;j++) {
						System.out.print(ch);
					}
					System.out.println();
				}
				break;
			}
			case 3: {
				for(int i=0;i<N;i++) {
					for(int k=N-1;k>=i+1;k--) {
						System.out.print(" ");
					}
					for(int j=0;j<(i*2)+1;j++) {
						System.out.print(ch);
					}
					System.out.println();
				}
				break;
			}
			}
		}
	}
}

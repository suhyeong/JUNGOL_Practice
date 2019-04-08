import java.util.*;

public class prac_1719 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt(); //삼각형 크기
		int m = s.nextInt(); //종류
		int o = (N/2)+1;
		char ch = '*';
		
		if(N%2 != 1 || N > 100 || m < 1 || m > 4)
			System.out.println("INPUT ERROR!");
		else {
			switch(m) {
			case 1: {
				for(int i=0;i<N;i++) {
					if(i < o) {
						for(int j=0;j<i+1;j++) {
							System.out.print(ch);
						}
						System.out.println();
					} else {
						for(int j=0;j<N-i;j++) {
							System.out.print(ch);
						}
						System.out.println();
					}
				}
				break;
			}
			case 2: {
				for(int i=0;i<N;i++) {
					if(i < o) {
						for(int k=1;k<o-i;k++) {
							System.out.print(" ");
						}
						for(int j=0;j<i+1;j++) {
							System.out.print(ch);
						}
						System.out.println();
					} else {
						for(int k=0;k<=i-o;k++) {
							System.out.print(" ");
							
						}
						for(int j=0;j<N-i;j++) {
							System.out.print(ch);
						}
						System.out.println();
					}
				}
				break;
			}
			case 3: {
				for(int i=0;i<N;i++) {
					if(i < o) {
						for(int j=0;j<i;j++) {
							System.out.print(" ");
						}
						for(int k=0;k<N-i*2;k++) {
							System.out.print(ch);
						}
					} else {
						for(int j=1;j<N-i;j++) {
							System.out.print(" ");
						}
						for(int k=-1;k<=i*2-N;k++) {
							System.out.print(ch);
						}
					}
					System.out.println();
				}
				break;
			}
			case 4: {
				for(int i=0;i<N;i++) {
					if(i<o) {
						for(int j=0;j<i;j++) {
							System.out.print(" ");
						}
						for(int k=0;k<o-i;k++) {
							System.out.print(ch);
						}
						System.out.println();
					} else {
						for(int l=0;l<o-1;l++) {
							System.out.print(" ");
						}
						for(int j=o;j<i+2;j++) {
							System.out.print(ch);
						}
						System.out.println();
					}
				}
				break;
			}
			}
		}
	}
}

import java.util.*;

public class prac_1307 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		char arr[][] = new char[N][N];
		char ch = 'A';
		
		for(int i=N-1;i>=0;i--) {
			for(int j=N-1;j>=0;j--) {
				if(ch > 'Z') {
					ch = 'A';
				}
				arr[j][i] = ch;
				ch++;
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}

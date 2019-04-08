import java.util.Scanner;

public class prac_1314 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		char arr[][] = new char[N][N];
		char ch = 'A';
		
		for(int i=0;i<N;i++) {
			if(i%2 == 0) {
				for(int j=0;j<N;j++) {
					if(ch > 'Z') {
						ch = 'A';
					}
					arr[j][i] = ch;
					ch++;
				}
			} else {
				for(int j=N-1;j>=0;j--) {
					if(ch > 'Z') {
						ch = 'A';
					}
					arr[j][i] = ch;
					ch++;
				}
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int l=0;l<N;l++) {
				System.out.print(arr[i][l]+" ");
			}
			System.out.println();
		}
	}
}
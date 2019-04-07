import java.util.*;

public class prac_1304 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int arr[][] = new int[N][N];
		int k = 1;
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				arr[j][i] = k++;
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

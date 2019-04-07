import java.util.*;

public class prac_2046 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int kind = s.nextInt();
		int[][] arr = new int[N][N];
		int k = 1;
		
		switch(kind) {
		case 1: {
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					arr[i][j] = k;
					System.out.print(arr[i][j]+" ");
					}
				k++;
				System.out.println();
			}
			break;
		}
		case 2: {
			for(int i=0;i<N;i++) {
				if(i%2 == 0) {
					for(int j=0;j<N;j++) {
						arr[i][j] = k++;
						System.out.print(arr[i][j]+" ");
					}
				} else {
					for(int j=0;j<N;j++) {
						arr[i][j] = --k;
						System.out.print(arr[i][j]+" ");
					}
				}
				System.out.println();
			}
			break;
		}
		case 3: {
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					arr[i][j] = k*(j+1);
					System.out.print(arr[i][j]+" ");
				}
				k++;
				System.out.println();
			}
		}
		}
	}
}

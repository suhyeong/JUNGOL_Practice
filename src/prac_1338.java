import java.util.*;

public class prac_1338 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		char arr[][] = new char[N][N];
		char ch = 'A';
		int j, k;
		for(int i=0;i<N;i++) {
			for(j=i,k=N-1;j<N;j++,k--) {
				arr[j][k] = ch++;
				if(ch > 'Z')
					ch = 'A';
			}
		}
		
		for(int x=0;x<N;x++) {
			for(int y=0;y<N;y++) {
				System.out.print(arr[x][y]+" ");
			}
			System.out.println();
		}
	}
}

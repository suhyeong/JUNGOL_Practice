import java.util.*;

public class prac_1338 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		char arr[][] = new char[N][N];
		char ch = 'A';
		int x = 0;
		int y = N-1;
		int M = N; //�ݺ� Ƚ��
		
		while(M > 0) {
			int i = x; //�� ��ġ
			int j = y; //�� ��ġ
 			for(int k=0;k<M;k++) {
				if(ch > 'Z')
					ch = 'A';
				arr[i][j] = ch++;
				i += 1;
				j -= 1;
			}
			M--;
			x++;
		}
		
		for(int p=0;p<arr.length;p++) {
			for(int q=0;q<arr.length;q++) {
				System.out.print(arr[p][q]+" ");
			}
			System.out.println();
		}
	}
}

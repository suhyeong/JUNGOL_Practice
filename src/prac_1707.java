import java.util.*;

public class prac_1707 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int num = 0;
		int M = N; //이동 횟수
		int C = 1; //증가 또는 감소 
		int I = 0; //행 위치
		int J = -1; //열 위치
		int arr[][] = new int[N][N];
		
		while(M >= 0) {
			for(int K=0;K<M;K++) {
				J += C;
				arr[I][J] = ++num;
			}
			M--; //이동 횟수 감소
			for(int K=0;K<M;K++) {
				I += C;
				arr[I][J] = ++num;
			}
			C *= (-1); //증가 감소 전환
		}
		
		for(int x=0;x<N;x++) {
			for(int y=0;y<N;y++) {
				System.out.print(arr[x][y]+" ");
			}
			System.out.println();
		}
	}
}

import java.util.*;

public class prac_1707 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int num = 0;
		int M = N; //�̵� Ƚ��
		int C = 1; //���� �Ǵ� ���� 
		int I = 0; //�� ��ġ
		int J = -1; //�� ��ġ
		int arr[][] = new int[N][N];
		
		while(M >= 0) {
			for(int K=0;K<M;K++) {
				J += C;
				arr[I][J] = ++num;
			}
			M--; //�̵� Ƚ�� ����
			for(int K=0;K<M;K++) {
				I += C;
				arr[I][J] = ++num;
			}
			C *= (-1); //���� ���� ��ȯ
		}
		
		for(int x=0;x<N;x++) {
			for(int y=0;y<N;y++) {
				System.out.print(arr[x][y]+" ");
			}
			System.out.println();
		}
	}
}

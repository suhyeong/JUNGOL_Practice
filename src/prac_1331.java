import java.util.*;

public class prac_1331 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int length = N*2-1;
		char arr[][] = new char[length][length];
		char ch = 'A';
		int i = 0; //�� ��ġ
		int j = N-1; //�� ��ġ
		int M = N-1; //�ݺ� Ƚ��
		arr[i][j] = ch++; //��� ��ġ�� 'A' �ֱ�
		
		while(M > 0) {
			for(int k=0;k<M;k++) {
				i += 1;
				j -= 1;
				if(ch > 'Z')
					ch = 'A';
				arr[i][j] = ch++;
			}
			for(int k=0;k<M;k++) {
				i += 1;
				j += 1;
				if(ch > 'Z')
					ch = 'A';
				arr[i][j] = ch++;
			}
			for(int k=0;k<M;k++) {
				i -= 1;
				j += 1;
				if(ch > 'Z')
					ch = 'A';
				arr[i][j] = ch++;
			}
			for(int k=0;k<M;k++) {
				i -= 1;
				j -= 1;
				if(ch > 'Z')
					ch = 'A';
				if(arr[i][j] != '\0')
					i += 1;
				arr[i][j] = ch++;
			}
			M--;
		}
		
		for(int x=0;x<arr.length;x++) {
			for(int y=0;y<arr.length;y++) {
				System.out.print(arr[x][y]+" ");
			}
			System.out.println();
		}
	}
}

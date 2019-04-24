import java.util.*;
import java.math.*;

public class prac_2809 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		/*int N = s.nextInt();
		for(int i=0;i<N;i++) {
			if(N%(i+1) == 0)
				System.out.print((i+1)+" ");
		}*/
		int sq;
		int cnt = 0;
		int N = s.nextInt();
		int arr[] = new int[10000];
		sq = (int)Math.sqrt(N);
		for(int i=0;i<sq;i++) {
			if(N%(i+1) == 0) {
				arr[cnt++] = i+1;
				if(N/(i+1) != i && N/(i+1) != i+1)
					arr[cnt++] = N/(i+1);
			}
		}
		Arrays.sort(arr);
		for(int j=0;j<arr.length;j++) {
			if(arr[j] != 0)
				System.out.print(arr[j]+" ");
		}
	}
}

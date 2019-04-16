import java.util.*;

public class prac_1641 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int o = n;
		int arr[][] = new int[n][n];
		int k = 0;
		if(n > 100 || n%2 == 0 || m < 1 || m > 3)
			System.out.println("INPUT ERROR!");
		else {
			switch(m) {
			case 1:
				for(int i=0;i<n;i++) {
					if(i%2 == 0) {
						for(int j=0;j<i+1;j++) {
								arr[i][j] = ++k;
						}
					} else {
						for(int j=i;j>=0;j--) {
							arr[i][j] = ++k;
						}
					}
				}
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						if(arr[i][j] != 0)
							System.out.print(arr[i][j]+" ");
					}
					System.out.println();
				}
				break;
			case 2:
				for(int i=0;i<n;i++) {
					for(int j=0;j<i*2;j++)
						System.out.print(" ");
					for(int j=o*2-1;j>0;j--) {
						System.out.print(k+" ");
					}
					k++;
					o--;
					System.out.println();
				}
				break;
			case 3:
				for(int i=0;i<n;i++) {
					if(i < (n/2)) {
						for(int j=0;j<i+1;j++) {
							System.out.print(++k+" ");
						}
					} else {
						for(int j=n-i;j>0;j--) {
							System.out.print(++k+" ");
						}
					}
					k=0;
					System.out.println();
				}
				break;
			}
		}
	}
}

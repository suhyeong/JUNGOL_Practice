import java.util.*;

public class prac_1157 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int array[] = new int[n];
		int i,j,temp;
		for(i=0;i<n;i++) {
			array[i] = s.nextInt();
		}
		for(i=0;i<n;i++) {
			for(j=1;j<n-i;j++) {
				if(array[j-1] > array[j]) {
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
			for(int x=0;x<n;x++) {
				if(i != n-1) {
					System.out.print(array[x]+" ");
				}
			}
			System.out.println();
		}
	}
}

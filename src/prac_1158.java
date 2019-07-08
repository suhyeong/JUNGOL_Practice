import java.util.*;

public class prac_1158 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int array[] = new int[n];
		int i, j, x, temp;
		for(i=0;i<n;i++) {
			array[i] = s.nextInt();
		}
		
		for(i=0;i<n;i++) {
			j = i;
			while(j > 0 && array[j-1] > array[j]) {
				temp = array[j-1];
				array[j-1] = array[j];
				array[j] = temp;
				j--;
			}
			if(i != 0) {
				for(x=0;x<n;x++) {
					System.out.print(array[x]+" ");
				}
				System.out.println();
			}
		}
	}
}

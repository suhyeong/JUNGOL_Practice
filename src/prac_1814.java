import java.util.Scanner;

public class prac_1814 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i, j;
		long temp;
		int count = 0;
		long array[] = new long[n];
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
				count++;
			}
		}
		System.out.println(count);
	}
}

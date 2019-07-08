import java.io.*;
import java.util.Scanner;

public class prac_1146 {
	public static void main(String args[]) throws IOException {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int array[] = new int[n];
		int i, j, min, index = 0, temp;
		boolean change = false;
		for(i=0;i<n;i++) {
			array[i] = s.nextInt();
		} //input
		
		//Selection Sort
		for(i=0;i<n;i++) {
			min = 101;
			for(j=i;j<n;j++) {
				if(min > array[j]) {
					min = array[j];
					index = j;
				}
			}
			temp = array[i];
			array[i] = array[index];
			array[index] = temp;
			for(int x=0;x<n;x++) {
				if(i != n-1)
					System.out.print(array[x]+" ");
			}
			System.out.println();
		}
	}
}

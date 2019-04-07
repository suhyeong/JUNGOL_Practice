import java.util.Scanner;

public class prac_1856 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int height = s.nextInt();
		int width = s.nextInt();
		int arr[][] = new int[height][width];
		int k = 1;

		for(int i=0;i<height;i++) {
			arr[i] = new int[width];
			if(i%2 == 0) {
				for(int j=0;j<width;j++) {
					arr[i][j] = k++;
				}
			} else {
				for(int j=width-1;j>=0;j--) {
					arr[i][j] = k++;
				}
			}
		}
		
		for(int i=0;i<height;i++) {
			for(int j=0;j<width;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}

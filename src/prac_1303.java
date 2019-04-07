import java.util.*;

public class prac_1303 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int height = s.nextInt();
		int width = s.nextInt();
		int k = 1;
		
		for(int i=0;i<height;i++) {
			for(int j=0;j<width;j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
}

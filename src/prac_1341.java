import java.util.*;

public class prac_1341 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int start= s.nextInt();
		int end = s.nextInt();
		
		int sw = (start > end ? -1 : 1);

		for(int i=start;i*sw <= end*sw;i += sw) {
			for(int j=1;j<=9;j++) {
				if((j%3) == 1) {
					String str1 = String.format("%d * %d = %2d", i, j, i*j);
					System.out.print(str1);
				} else if((j%3) == 0) {
					String str2 = String.format("%4d * %d = %2d", i, j, j*i);
					System.out.print(str2);
					System.out.println();
				} else {
					String str2 = String.format("%4d * %d = %2d", i, j, j*i);
					System.out.print(str2);
				}
			}
			System.out.println();
		}
	}
}

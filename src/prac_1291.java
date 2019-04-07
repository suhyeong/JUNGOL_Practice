import java.util.*;

public class prac_1291 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int start= s.nextInt();
		int end = s.nextInt();
		
		while(start > 9 || start < 2 || end > 9 || end <2) {
			System.out.println("INPUT ERROR!");
			start= s.nextInt();
			end = s.nextInt();
		}
		int sw = (start > end ? -1 : 1);

		for(int i=1;i<=9;i++) {
			for(int j=start;j*sw <= end*sw;j += sw) {
				if(j == start) {
					String str1 = String.format("%d * %d = %2d", j, i, j*i);
					System.out.print(str1);
				} else {
					String str2 = String.format("%4d * %d = %2d", j, i, j*i);
					System.out.print(str2);
				}
			}
			System.out.println();
		}
	}
}

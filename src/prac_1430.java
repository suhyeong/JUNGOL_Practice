import java.util.*;

public class prac_1430 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();
		int C = s.nextInt();
		int arr[] = new int[10];
		int result = A*B*C;
		String str = String.valueOf(result);
		
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<arr.length;j++) {
				if(str.charAt(i)-'0' == j) {
					arr[j] += 1;
				}
			}
		}
		
		for(int x=0;x<arr.length;x++)
			System.out.println(arr[x]);
	}
}

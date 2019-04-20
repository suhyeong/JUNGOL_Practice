import java.util.*;

public class prac_2812 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int sum = 0;
		int i = 0;
		
		while(i != str.length()) {
			sum += (str.charAt(i) - 48);
			i++;
		}
		System.out.println(sum);
		while (sum >= 10) {
			sum = calc(sum);
			System.out.println(sum);
		}
	}
	
	public static int calc(int num) {
		int sum = 0;
		while(num > 0) {
			sum += num%10;
			num = num/10;
		}
		
		return sum;
	}
}

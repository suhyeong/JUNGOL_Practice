import java.util.*;
import java.io.*;
import java.lang.*;

public class prac_1692 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(bf.readLine());
		int y = Integer.parseInt(bf.readLine());
		int y_size = (int) Math.log10(y)+1;
		int num = y;
		int sum = 0;
		for(int i=0;i<y_size;i++) {
			int na = (int) (num % 10);
			int result = x * na;
			int re_result = x * na * (int)Math.pow(10, i);
			System.out.println(result);
			sum += re_result;
			num = (int)(num / 10);
		}
		System.out.println(sum);
	}
}

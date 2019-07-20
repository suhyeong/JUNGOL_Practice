import java.util.*;
import java.io.*;

public class prac_1071 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int m = Integer.parseInt(bf.readLine());
		
		int yaksu_sum = 0;
		int baesu_sum = 0;
		
		for(int i=0;i<n;i++) {
			if(m%arr[i] == 0)
				yaksu_sum += arr[i];
			if(arr[i]%m == 0)
				baesu_sum += arr[i];
		}
		
		System.out.println(yaksu_sum);
		System.out.println(baesu_sum);
		bf.close();
	}
}

import java.util.*;
import java.io.*;

public class prac_1221 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int result = 0;
		int one = 0;
		int two = 0;
		
		for(int i=0;i<n;i++) {
			String c = st.nextToken();
			if(c.equals("+")) {
				one = stack.pop();
				two = stack.pop();
				result = one + two;
				stack.push(result);
			} else if(c.equals("-")) {
				one = stack.pop();
				two = stack.pop();
				result = two - one;
				stack.push(result);
			} else if(c.equals("*")) {
				one = stack.pop();
				two = stack.pop();
				result = two * one;
				stack.push(result);
			} else if(c.equals("/")) {
				one = stack.pop();
				two = stack.pop();
				result = two / one;
				stack.push(result);
			} else {
				stack.push(Integer.parseInt(c));
			}
		}
		
		System.out.println(stack.peek());
		bf.close();
	}
}

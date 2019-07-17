import java.util.*;
import java.io.*;

public class prac_1102 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			String str = st.nextToken();
			if(str.equals("i"))
				stack.push(Integer.parseInt(st.nextToken()));
			else if(str.equals("c"))
				System.out.println(stack.size());
			else if(str.equals("o")) {
				if(stack.empty())
					System.out.println("empty");
				else
					System.out.println(stack.pop());
			}
		}
		
		bf.close();
	}
}

import java.util.*;
import java.io.*;

public class prac_1697 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		Queue<Integer> queue = new LinkedList<Integer>();
		while(n!=0) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			String command = st.nextToken();
			if(command.equals("i")) {
				queue.add(Integer.parseInt(st.nextToken()));
			} else if(command.equals("c"))
				System.out.println(queue.size());
			else if(command.equals("o")) {
				if(queue.isEmpty()) {
					System.out.println("empty");
				} else
					System.out.println(queue.poll());
			}
			n--;
		}
		
		bf.close();
	}
}

import java.util.*;
import java.io.*;

public class prac_1060 {
	static class Edge {
		int n;
		int m;
		int distance;
		
		Edge(int n, int m, int distance) {
			this.n = n;
			this.m = m;
			this.distance = distance;
		}
	}
	
	static int getParent(int[] parent, int x) {
		if(parent[x] == x)
			return x;
		return parent[x] = getParent(parent, parent[x]);
	}
	
	static void UnionParent(int[] parent, int x, int y) {
		x = getParent(parent, x);
		y = getParent(parent, y);
		if(x < y)
			parent[y] = x;
		else
			parent[x] = y;
	}
	
	static int findParent(int[] parent, int x, int y) {
		x = getParent(parent, x);
		y = getParent(parent, y);
		if(x == y)
			return 1;
		else
			return 0;
	}
	
	public static void main(String args[]) throws IOException {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[][] = new int[size][size];
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				arr[i][j] = s.nextInt();
			}
		} //input
		
		int[] parent = new int[size];
		for(int i=0;i<size;i++) {
			parent[i] = i;
		} //parent �ʱ�ȭ
		
		ArrayList<Edge> graph = new ArrayList<Edge>();
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				graph.add(new Edge(i, j, arr[i][j]));
			}
		}
		
		Collections.sort(graph, new Comparator<Edge>() {
			@Override
			public int compare(Edge o1, Edge o2) {
				// TODO Auto-generated method stub
				if(o1.distance < o2.distance)
					return -1;
				else if(o1.distance > o2.distance)
					return 1;
				else
					return 0;
				//�迭�� ���� �� -1, 0, 1�� ���� ��ȣ�ϰ� ���޵Ǿ� ��ü�� �켱���谡 �������� ���� �� ������ if, else if, else�� �� ��츦 ��������.
			}
		});
		
		int sum = 0;
		for(int i=0;i<graph.size();i++) {
			Edge e = graph.get(i);
			if(findParent(parent, e.n, e.m) == 0) {
				sum += e.distance;
				UnionParent(parent, e.n, e.m);
			}
		}
		
		System.out.println(sum);
	}
}

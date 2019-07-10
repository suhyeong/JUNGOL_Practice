import java.util.*;

public class prac_1972_quick {
	static int number;
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		number = s.nextInt();
		int way = s.nextInt();
		//0 : 오름차순, 1 : 내림차순
		int array[] = new int[number];
		int i;
		for(i=0;i<number;i++) {
			array[i] = s.nextInt();
		}
		if(way == 0)
			quickSort_asending(array, 0, number -1);
		else if(way == 1)
			quickSort_descending(array, 0, number -1);
		for(i=0;i<number;i++) {
			System.out.println(array[i]);
		}
	}
	
	static void quickSort_asending(int[] data, int start, int end) {
		if(start >= end) {
			return;
		}
		
		int key = start;
		int i = start + 1;
		int j = end;
		int temp;
		
		while(i <= j) { 
			while(i < number && data[i] <= data[key]) {
				i++;
			}
			while(data[j] >= data[key] && j > start) {
				j--;
			}
			if(i > j) {
				temp = data[j];
				data[j] = data[key];
				data[key] = temp;
			} else {
				temp = data[j];
				data[j] = data[i];
				data[i] = temp;
			}
		}
		quickSort_asending(data, start, j-1);
		quickSort_asending(data, j+1, end);
	}
	
	static void quickSort_descending(int[] data, int start, int end) {
		if(start >= end) {
			return;
		}
		
		int key = start;
		int i = start + 1;
		int j = end;
		int temp;
		
		while(i <= j) { 
			while(i < number && data[i] >= data[key]) {
				i++;
			}
			while(data[j] <= data[key] && j > start) {
				j--;
			}
			if(i > j) {
				temp = data[j];
				data[j] = data[key];
				data[key] = temp;
			} else {
				temp = data[j];
				data[j] = data[i];
				data[i] = temp;
			}
		}
		quickSort_descending(data, start, j-1);
		quickSort_descending(data, j+1, end);
	}
}

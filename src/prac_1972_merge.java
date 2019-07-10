import java.util.*;

public class prac_1972_merge {
	static Scanner s = new Scanner(System.in);
	static int number = s.nextInt();
	static int way = s.nextInt(); //0:오름차순,1:내림차순
	static int[] sorted = new int[number];
	
	public static void main(String args[]) {
		int array[] = new int[number];
		for(int i=0;i<number;i++) {
			array[i] = s.nextInt();
		}
		mergeSort(array, 0, number-1);
		for(int i=0;i<number;i++) {
			System.out.println(array[i]);
		}
	}
	
	static void merge_asending(int[] arr, int start, int middle, int end) {
		int x = start;
		int y = middle+1;
		int z = start;
		
		while(x <= middle && y <= end) {
			if(arr[x] <= arr[y]) {
				sorted[z] = arr[x];
				x++;
			} else {
				sorted[z] = arr[y];
				y++;
			}
			z++;
		}
		
		if(x > middle) {
			for(int p=y;p<=end;p++) {
				sorted[z] = arr[p];
				z++;
			}
		} else {
			for(int q=x;q<=middle;q++) {
				sorted[z] = arr[q];
				z++;
			}
		}
		
		for(int t=start;t<=end;t++) {
			arr[t] = sorted[t];
		}
	}
	
	static void merge_descending(int[] arr, int start, int middle, int end) {
		int x = start;
		int y = middle+1;
		int z = start;
		
		while(x <= middle && y <= end) {
			if(arr[x] > arr[y]) {
				sorted[z] = arr[x];
				x++;
			} else {
				sorted[z] = arr[y];
				y++;
			}
			z++;
		}
		
		if(x > middle) {
			for(int p=y;p<=end;p++) {
				sorted[z] = arr[p];
				z++;
			}
		} else {
			for(int q=x;q<=middle;q++) {
				sorted[z] = arr[q];
				z++;
			}
		}
		
		for(int t=start;t<=end;t++) {
			arr[t] = sorted[t];
		}
	}
	
	static void mergeSort(int[] arr, int start, int end) {
		if(start < end) {
			int middle = (start + end) / 2;
			mergeSort(arr, start, middle);
			mergeSort(arr, middle + 1, end);
			if(way == 0) {
				merge_asending(arr, start, middle, end);
			} else {
				merge_descending(arr, start, middle, end);
			}
		}
	}
}

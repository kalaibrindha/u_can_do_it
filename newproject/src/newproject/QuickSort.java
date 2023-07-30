package newproject;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int a[] = { 3, 2, 5, 33, 1, 9, 65 };
		a=quicksort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));

	}

	private static int[] quicksort(int[] a, int low, int high) {

		if (low >= high) {
			return a;
		}
		int start = low, end = high;
		int mid = (start + end) / 2;
		int pivot = a[mid];
		while (start < end) {
			while (a[start] < pivot)
				start++;

			while (a[end] > pivot)
				end--;
			if (start <= end) {
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
				start++;
				end--;
			}
		}
		quicksort(a, low, end);
	 quicksort(a, start, high);
		return a;

	}

}

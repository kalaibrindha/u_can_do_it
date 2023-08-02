package newproject;

import java.util.Arrays;

class A {
	int count;
	boolean check;;
	int element;

	public A(int i, boolean b, int ii) {
		count = i;
		check = b;
		element = ii;
	}

	public A() {
		// TODO Auto-generated constructor stub
	}

}

public class ArrangeArrayAccordingToTheirFREQUENCY {

	public static void main(String[] args) {

		int arr[] = { 2, 2, 5, 8, 5, 6, 8, 8 ,9};
		method2(arr);

//		A array[] = new A[arr.length];
//		for (int i = 0; i < array.length; i++) {
//			array[i] = new A(0, false, arr[i]);
//		}
//		for (int i = 0; i < arr.length; i++) {
//			int count = 0;
//			for (int j = i; j < arr.length; j++) {
//				if (arr[i] == arr[j] && !array[j].check) {
//					count++;
//					array[j].check = true;
//				}
//
//			}
//			array[i].count = count;
//		}
//		for (int i = 0; i < array.length; i++)
//			System.out.println(array[i].check + "  " + array[i].count + "  " + array[i].element);
//		array = arrange_in_descending(array);

	}

	private static void method2(int[] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		// creating 2d array
		int arr[][] = new int[a.length][2];
		// System.out.println(arr.length);

		int count = 0;
		int index = 0, index2 = 0;
		int test_val = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] == test_val) {
				count++;
				if (i == a.length - 1) {
					arr[index][0] = a[i - 1];
					arr[index][1] = count;

				}

			} else {
				arr[index][0] = a[i - 1];
				arr[index][1] = count;
				index++;
				count = 0;
				test_val = a[i];
				i--;

			}
		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i][0] + "  " + arr[i][1]);			
//		}
		// sort count colum
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i][1] < arr[j][1]) {
					int temp2 = arr[i][1];
					arr[i][1] = arr[j][1];
					arr[j][1] = temp2;
					int temp = arr[i][0];
					arr[i][0] = arr[j][0];
					arr[j][0] = temp;

				}
			}
		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i][0] + "  " + arr[i][1]);			
//		}
		// output
		int i = 0;
		while (arr[i][0] != 0) {
			int n = arr[i][1];
			for (int j = 0; j < n; j++)
				System.out.print(arr[i][0] + "  ");
			i++;
		}

	}

	private static A[] arrange_in_descending(A[] a) {
		A aa = new A();
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i].count < a[j].count) {
					int temp = a[i].count;
					a[i].count = a[j].count;
					a[j].count = temp;
					int e = a[i].element;
					a[i].element = a[j].element;
					a[j].element = e;

				}
			}
		}
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i].element + "  " + a[i].count);
		return a;
	}

}

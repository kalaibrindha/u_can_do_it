package newproject;

public class Equilibrium_Index_OFan_Array {

	public static void main(String[] args) {

		// int a[] = {-7, 1, 5, 2, -4, 3, 0} ;
		// int a[] = { 1, 2, 3 };
		int a[] = { 1, 1, 1, 1, 4 };
		method1(a);

	}

	private static void method1(int[] a) {

		for (int i = 1; i < a.length - 1; i++) {
			int val1 = 0;
			int val2 = 0;
			for (int j = 0; j < i; j++) {
				val1 = val1 + a[j];
			}
			for (int k = i + 1; k < a.length; k++) {
				val2 = val2 + a[k];
			}
			if (val1 == val2) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}

}

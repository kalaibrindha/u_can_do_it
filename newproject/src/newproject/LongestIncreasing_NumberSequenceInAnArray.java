package newproject;

public class LongestIncreasing_NumberSequenceInAnArray {

	public static void main(String[] args) {
		//int[] num = { 10, 9, 2, 5, 3, 7, 101, 18 };
		// int[] num={10,1,0,3,2,3,87,0,98,555};
		 int[] num= {7,7,7,7,7,7,7};
		int length = find_length(num);
		System.out.println("ans" + length);
		method2(num);

	}

	private static void method2(int[] num) {
		int len = 1;
		for (int i = num.length - 2; i >= 0; i--) {
			if (num[i] < num[i + 1]) {
				len++;
			}

		}
		System.out.println("method 2 ans : "+len);
	}

	private static int find_length(int[] num) {

		int maxvalue = 0;
		int length = 0;
		for (int i = 0; i < num.length - 1; i++) {
			int count = 1;
			maxvalue = num[i];
			for (int j = i + 1; j < num.length; j++) {
				if (maxvalue < num[j]) {
					maxvalue = num[j];
					count++;
				}
			}
			System.out.println(count);
			if (count > length) {
				length = count;
			}

		}
		// System.out.println(length);
		return length;
	}

}

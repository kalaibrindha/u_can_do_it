package newproject;

public class LongestIncreasing_NumberSequenceInAnArray {

	public static void main(String[] args) {
		int[] num = { 10, 9, 2, 5, 3, 7, 101, 18 };
		//int[] num={0,1,0,3,2,3};
		//int[] num=	{7,7,7,7,7,7,7};
		int length = find_length(num);
		System.out.println("ans"+length);

	}

	private static int find_length(int[] num) {

		int maxvalue = 0;
		int length = 0;
		for (int i = 0; i < num.length-1; i++) {
			int count = 1;
			maxvalue = num[i];
			for (int j = i+1; j < num.length; j++) {
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
	//	System.out.println(length);
		return length;
	}

}

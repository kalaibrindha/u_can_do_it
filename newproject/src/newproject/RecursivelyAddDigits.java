package newproject;

public class RecursivelyAddDigits {

	public static void main(String[] args) {

		int num = 89;
		int ans2 = using_recursion(num);
		System.out.println(ans2);

		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
			if (num == 0) {
				num = sum;
				if (sum >= 0 && sum <= 9)
					break;
				sum = 0;
			}
		}
		System.out.println("ans :" + sum);

	}

	private static int using_recursion(int num) {

		int sum = 0;
		if (num >= 0 && num <= 9) {
			return num;
		}
		while (num > 0) {
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		// System.out.println(num+" "+sum);
		int n = using_recursion(sum);
		// System.out.println("n :"+n);
		return n;

	}

}

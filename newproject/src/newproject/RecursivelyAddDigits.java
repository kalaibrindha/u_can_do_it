package newproject;

public class RecursivelyAddDigits {

	public static void main(String[] args) {

		int num = 9815;
		int ans2 = using_recursion(num);
		System.out.println("method 2  "+ans2);
		method3(num);

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
		System.out.println("ans  method 1:" + sum);

	}

	private static void method3(int num) {
		int ans=num%9;
		System.out.println("ans  method 3 :" + ans);
		
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

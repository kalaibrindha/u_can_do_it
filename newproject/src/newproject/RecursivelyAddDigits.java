package newproject;

public class RecursivelyAddDigits {

	public static void main(String[] args) {

		int num = 9875;
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

}

package newproject;

import java.util.Arrays;

public class Multiply_String_Numbers {

	public static void main(String[] args) {

		String num1 = "0110";
		String num2 = "4";
		int res[] = new int[num1.length() + num2.length()];

		int carry = 0;
		int i_val = num2.length() - 1;
		int j_val = num1.length() - 1;
		int k = res.length - 1;
		int pf = 0;

		for (int i = i_val; i >= 0; i--) {

			for (int j = j_val; j >= 0; j--) {
				int product = (num1.charAt(j) - '0') * (num2.charAt(i) - '0') + res[k] + carry;
				res[k] = product % 10;
				carry = product / 10;
				k--;

				if (carry > 0 && j == 0) {
					res[k] = carry;
				}
			}

			System.out.println();
			k = res.length - 2 - pf++;

		}
		String result_ans = "";
		boolean check = false;
		for (int i = 0; i < res.length; i++) {

			if (res[i] != 0 && !check) {
				check = true;
			}
			if (check) {
				result_ans = result_ans + res[i] + "";
			}
		}
		System.out.println("result :  " + result_ans);

	}

}

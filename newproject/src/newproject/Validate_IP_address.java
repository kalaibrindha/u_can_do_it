package newproject;

import java.util.Scanner;

public class Validate_IP_address {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String ipv4 = "172.16.254.@1";

		boolean check = isIPV4_Address(ipv4);
		System.out.println(check);

	}

	private static boolean isIPV4_Address(String ipv4) {

		int dot_count = 0;
		String num = "";
		for (int i = 0; i < ipv4.length(); i++) {

			num = num + ipv4.charAt(i);
			if (ipv4.charAt(i) == '.' || ipv4.length() - 1 == i) {

				boolean validation = validateNum(num);

				if (ipv4.charAt(i) == '.')
					dot_count++;
				// System.out.println("dot " + dot_count);
				if (dot_count > 3) {

					return false;
				}
				if (!validation) {
					return false;
				} else {
					num = "";
				}
			}

		}

		return true;
	}

	private static boolean validateNum(String num) {

		if (num.length() < 4 && num.charAt(0) == '0') {

			return false;
		}
		int numvalue = 0;
		//System.out.println(num);
		for (int i = 0; i < num.length() - 1; i++) {

			if (num.charAt(i) >= '0' && num.charAt(i) <= '9') {
				int n = num.charAt(i) - '0';
				numvalue = numvalue * 10 + n;

			} else {
				return false;
			}

		}
		//System.out.println("numvalue" + numvalue);
		if (numvalue > 256) {
			return false;
		}

		return true;
	}

}

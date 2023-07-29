package newproject;

import java.util.Scanner;

public class Valaidateip_v6_Address {

	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		String s = "2001:0db8:85n3:0:0:8A2E:0370:7334";
		boolean check = checkIPV6(s);
		System.out.println("ans :" + check);

	}

	private static boolean checkIPV6(String s) {
		int count = Check_Colon(s);
		if (Check_Colon(s) == 7) {
			String s_array[] = new String[7];
			s_array = SplitString(s, s_array);
			if (!validate(s_array)) {
				System.out.println("validation wrong");
				return false;
			} else {
				System.out.println("validation succsess");
				return true;
			}

		}
		System.out.println("size length vary");
		return false;

	}

	private static boolean validate(String[] s_array) {

		for (int i = 0; i < s_array.length; i++) {
			String s = s_array[i];
			if (s.length() > 4) {
				return false;
			}
			for (int j = 0; j < s.length(); j++) {

				if (s.charAt(j) == ':') {
					// System.out.println(":");
					continue;
				} else if (!((s.charAt(j) >= '0' && s.charAt(j) <= '9') || (s.charAt(j) >= 'a' && s.charAt(j) <= 'f')
						|| (s.charAt(j) >= 'A' && s.charAt(j) <= 'F'))) {
					// System.out.println("running");
					return false;
				}

			}
		}
		return true;
	}

	private static String[] SplitString(String s, String[] s_array) {
		System.out.println(s_array.length);

		String words = "";
		int index = 0;
		for (int i = 0; i < s.length(); i++) {
			words = words + s.charAt(i);
			if (s.charAt(i) == ':' || i == s.length() - 1) {
				System.out.println(words + "  " + index);
				s_array[index++] = words;
				words = "";
				if (index == 7)
					break;
			}
		}

		return s_array;
	}

	private static int Check_Colon(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ':') {
				count++;
			}
		}
		return count;
	}

}

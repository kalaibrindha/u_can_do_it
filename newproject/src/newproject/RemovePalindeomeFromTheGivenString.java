package newproject;

import java.util.Scanner;

public class RemovePalindeomeFromTheGivenString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String input = sc.next();
		String output = "";
		String s = "";
		for (int i = 0; i < input.length(); i++) {
			s = s + input.charAt(i);
			if (input.charAt(i) == '_' || input.length() - 1 == i) {
				output = output + is_palindrome(s);
				//System.out.println(output);
				s = "";

			}

		}
		System.out.println("ans :  " + output);
	}

	private static String is_palindrome(String s) {
		// System.out.println(s);
		int i = 0;
		int j = 0;
		if (s.charAt(s.length() - 1) == '_') {
			j = s.length() - 2;
		} else
			j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				// System.out.println("not same");
				return s;
			}
			i++;
			j--;
		}
		// System.out.println(" same");
		return "";
	}

}

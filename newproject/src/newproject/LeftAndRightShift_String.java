package newproject;

import java.util.Scanner;

public class LeftAndRightShift_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("eter string");
		String s = sc.next();
		System.out.println("enter num");
		int n = sc.nextInt();
		String left_ans = LeftRotation(s, n);
		System.out.println(left_ans);
		String right_ans = RightRotation(s, n);
		System.out.println(right_ans);

	}

	private static String RightRotation(String s, int n) {
		String end = "", start = "";
		for (int i = 0; i < s.length(); i++) {
			if (i > s.length() - n - 1) {
				start = start + s.charAt(i);
			} else {
				end = end + s.charAt(i);
			}
		}
		return start + end;

	}

	private static String LeftRotation(String s, int n) {
		String end = "", start = "";
		for (int i = 0; i < s.length(); i++) {
			if (i < n) {
				end = end + s.charAt(i);
			} else {
				start = start + s.charAt(i);
			}
		}

		return start + end;
	}

}

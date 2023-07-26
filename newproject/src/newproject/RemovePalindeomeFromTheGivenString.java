package newproject;

/*
 * 
 * Given a sentence of string, in that remove the 
 * palindrome words and print the remaining.
Input:
He did a good deed
Output:
He good

Input:
Hari speaks malayalam
Output:
Hari speaks
Input : str = "Text_contains_malayalam_and_level_words"
Output : Text contains and words
 */
import java.util.Scanner;

public class RemovePalindeomeFromTheGivenString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String input = sc.nextLine();
		String output = "";
		String s = "";
		for (int i = 0; i < input.length(); i++) {
			s = s + input.charAt(i);
			if (input.charAt(i) == ' ' || input.length() - 1 == i) {
				output = output + is_palindrome(s);
				// System.out.println("output :" + output+ " ***");
				s = "";

			}

		}
		System.out.println("ans :  " + output);
	}

	private static String is_palindrome(String s) {
		System.out.println("s  :" + s);
		int i = 0;
		int j = 0;
		if (s.charAt(s.length() - 1) == ' ') {
			j = s.length() - 2;
		} else {
			j = s.length() - 1;
		}
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

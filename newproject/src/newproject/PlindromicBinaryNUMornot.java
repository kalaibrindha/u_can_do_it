package newproject;

public class PlindromicBinaryNUMornot {
	public static boolean isPalindrome(int n) {
		// `rev` stores reverse of a binary representation of `n`
		int rev = 0;

		// do till all bits of `n` are processed
		int k = n;
		while (k > 0) {

			System.out.println("k  :" + k);
			int m = (rev << 1);
			System.out.println("m  :" + m);
			int p = (k & 1);
			System.out.println("p  :" + p);
			rev = m | p;
			System.out.println("rev   :" + rev);
			k = k / 2;

		}

		// Returns true if `reverse(n)` is the same as `n`
		// System.out.println(n+" "+rev);
		return n == rev;
	}

	public static void main(String[] args) {
		int n = 10; // 1001
		// System.out.println(0<<1);
		if (isPalindrome(n)) {
			System.out.println(n + " is a palindrome");
		} else {
			System.out.println(n + " is not a palindrome");
		}

	}

}

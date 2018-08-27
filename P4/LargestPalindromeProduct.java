// A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

// Find the largest palindrome made from the product of two 3-digit numbers.

public class LargestPalindromeProduct {
	public static void main(String args[]) {
		LPP();
	}

	public static void LPP() {
		int lpp = 0, cur = 0;
		for (int i = 999; i > 99; i--) {
			for (int j = 999; j > 99; j--) {
				cur = i*j;
				if (checkPal(cur)==true) {
					if (cur >= lpp) {lpp = cur;}
				}
			}
		}
		System.out.println(lpp);
	}

	public static boolean checkPal(int num) {
		int ogINT = num;
		int rINT = 0; 
		int remainder = 0;

		while (num != 0) {
			remainder = num % 10;
			rINT = rINT * 10 + remainder;
			num /= 10;
		}

		if (ogINT == rINT) {return true;}
		else {return false;}
	}
}
// The sum of the squares of the first ten natural numbers is,
// 1^2 + 2^2 + ... + 10^2 = 385

// The square of the sum of the first ten natural numbers is,
// (1 + 2 + ... + 10)^2 = 552 = 3025

// Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

// Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.


import java.lang.Math;

public class SumSquares {
	public static void main(String args[]) {
		int a = sumOfSquares(100);
		int b = squaredSum(100);
		System.out.println(a);
		System.out.println(b);
		System.out.println(b-a);
	}

	public static int sumOfSquares(int n) {
		int ret = 0;
		for (int i = 1; i < n+1; i++) {
			ret += Math.pow((double)i, (double)2);
		}
		return ret;
	}

	public static int squaredSum(int n) {
		int ret = n+1;
		ret *= n;
		ret /= 2;
		ret *= ret;
		return ret;
	}
}
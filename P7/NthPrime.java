// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

// What is the 10 001st prime number?


public class NthPrime {
	public static void main(String args[]) {
		getNthPrime(10001);
	}

	public static boolean isPrime(int n) {
		if (n < 2) {return false;}
		if (n==2) {return true;}
		if (n%2==0) {return false;}
		int counter = 3;
		while ((counter*counter) <= n) {
			if (n%counter==0) {return false;}
			else {counter+=2;}
		}
		return true;
	}

	public static void getNthPrime(int n) {
		int numPrimes = 1;
		int count = 1;
		while (numPrimes < 10001) {
			count+=2;
			if(isPrime(count)) {numPrimes++;}
		}
		System.out.println(count);
	}
}
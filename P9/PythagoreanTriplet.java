import java.lang.Math;

public class PythagoreanTriplet {
	public static void main(String args[]) {
		getPyTrip(1000);
	}

	public static void getPyTrip(int n) {
		double c = 0;
		long fin = 0;
		for (int a = 0; a < n; a++) {
			for (int b = 0; b < n; b++) {
				c = (a*a + b*b);
				c = Math.sqrt(c);
				if (((a + b + c) == n) && (a < b) && (b < c)) {
					fin = a * b * (int)c;
					System.out.println(fin);
				}
			}
		}
	}
}
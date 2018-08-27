// 2520 is the smallest number that can be divided 
// by each of the numbers from 1 to 10 without any remainder.

// What is the smallest positive number that is evenly divisible 
// by all of the numbers from 1 to 20?


public class SmallestMultiple {
	public static void main(String args[]) {
		int[] checkList = {20, 19, 18, 17, 16, 14, 13, 12, 11};
		for (int i = 20; ; i++) {
			if (div(i, checkList[0])) {
				if (div(i, checkList[1])) {
					if (div(i, checkList[2])) {
						if (div(i, checkList[3])) {
							if (div(i, checkList[4])) {
								if (div(i, checkList[5])) {
									if (div(i, checkList[6])) {
										if (div(i, checkList[7])) {
											if (div(i, checkList[8])) {
												System.out.println(i);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public static boolean div(int n, int d) {
		if (n%d == 0) {return true;}
		else {return false;}
	}
}
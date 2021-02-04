package com.jy.s1;

public class Max1m {
	// 3개의 정숫값 가운데 최댓값을 구하여 출력
	static int max3(int a, int b, int c, int d) {
		int max =a;
		if(b>max) {
			max = b;
		}

		if(c>max) {
			max = c;
		}
		if(d>max) {
			max = d;
		}
		return max;
	}

			public static void main(String[] args) {
				System.out.println("max3(3,2,1) = " + max3(3, 2, 1, 5));
				System.out.println("2 = " + max3(3,3, 4, 2));
				System.out.println("3 =" + max3(6,3,4, 9));
				System.out.println("4 = " + max3(2, 4, 2,3));
				System.out.println("5 = " + max3(3, 7, 5,5));
			}

}

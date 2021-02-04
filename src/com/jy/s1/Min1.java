package com.jy.s1;

public class Min1 {
	//최솟값 구하기
	static int min3(int a, int b, int c ) {
		int min = a;
		if(b < min) {
			min= b;
		}
		if(c < min) {
			min= c;
		}
		return min;
	}
	public static void main(String[] args) {
		System.out.println("1 = " +min3(1,2,3));
		System.out.println("2 = " + min3(4,2,4));
		System.out.println("3 = " + min3(5,2,4));
		System.out.println("4 = " + min3(3,4,1));
	}
}

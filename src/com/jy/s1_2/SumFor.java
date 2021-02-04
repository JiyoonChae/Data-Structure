package com.jy.s1_2;

import java.util.Scanner;

public class SumFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지 합 for문으로 구하기");
		System.out.println("n의 값: ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i =0; i<=n; i++) {
			sum += i;  //sum에 i를 더하는것.
		}
		
		System.out.println("합 : " + sum);
	}
}

package com.jy.s1_2;

import java.util.Scanner;

public class SumEx1 {
	static int sumof(int a, int b) {
		int min;
		int max;
		if(a<b) {
			min = a;
			max = b;
		}else {
			min=b;
			max=a;
		}
		
		int sum = 0;
		for(int i=min; i<=max; i++) {
			sum +=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		//입력값 a,b 사이 모든 정수의 합을 구하여 반환
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("n의 값" );
			n = sc.nextInt();
		}while(n<=0);
		
		int sum=0;
		
		for(int i=0; i<=n; i++) {
			sum +=i;
		}
		
		/*
		 * System.out.println("정수입력"); int a = sc.nextInt(); System.out.println("정수입력");
		 * int b = sc.nextInt();
		 */
		
		System.out.println("결과 "+ sum);
	}
	
	
}
	
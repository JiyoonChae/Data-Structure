package com.jy.s1_2;

import java.util.Scanner;

public class Sumfor2 {
	public static void main(String[] args) {
		//1부터 입력된 수까지 짝수의 합 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력");
		int n= sc.nextInt();
		
		int sum=0;
		
			for(int i=1; i<=n; i++) {
				if(i%2==0) {
				//짝수의 합! 2,4,6,8,10
				sum += i;
			}
		}
		
		System.out.println(sum);
	}
}

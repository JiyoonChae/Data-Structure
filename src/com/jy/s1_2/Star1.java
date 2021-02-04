package com.jy.s1_2;

import java.util.Scanner;

public class Star1 {
	public static void main(String[] args) {
		/*
		 * //사각형 출력 for(int i=1; i<=5; i++) { for(int j=1; j<=5; j++) {
		 * System.out.printf("*"); } System.out.println(); }
		 */
		
		System.out.println("--------------------");
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("정수입력");
			n = sc.nextInt();
		}while(n<1 || n>9);
		
		for(int i =1; i<=9; i++) {
			for(int j=1; j<=n*i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}

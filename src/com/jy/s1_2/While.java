package com.jy.s1_2;

import java.util.Scanner;


public class While {
	public static void main(String[] args) {
		/*
		 * int i = 1; while(i<=15) { System.out.println(i); i++; }
		 */
		countdown();
	}
	
	static void countdown() {
		//5를 입력하면 54321 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력");
		int n = sc.nextInt();
		while(n!=0) {
			System.out.println(n);
			n--;
			
		}
	}
}

package com.jy.s1;

import java.util.Scanner;

public class Max1t {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력할 정수 갯수");
		int num = sc.nextInt();
		
		int [] ar = new int[num];
		for(int i =0; i<num; i++) {
			System.out.println("정수 입력");
			int n = sc.nextInt();
			ar[i] = n;
			System.out.println(ar[i]);
		}
		
		System.out.println(ar);
		
	} 
}

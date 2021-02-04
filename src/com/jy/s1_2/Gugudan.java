package com.jy.s1_2;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력");
		int a = sc.nextInt();
		//입력받은 정수의 구구단 출력
		for(int i=1; i<=9; i++) {
				System.out.println(a+"*"+i +"=" + a*i);
		}
		
		//구구단 전체 출력
		for(int i = 2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i +" * "+j+"="+i*j);
			}
		}
		
	}
}

package com.jy.s1_2;

import java.util.Scanner;


public class SumWhile {
	//1부터 n까지 정수 합 구하기
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 
		System.out.println("1부터 n까지의 합을 구하기");
		System.out.println("n의 값: ");
		int n = sc.nextInt();
		
		int sum = 0;
		int i =1;
		while(i<=n) {
			sum += i;
			i++;
		}
		System.out.println( sum);
		System.out.println("i값" + i);
	}
}

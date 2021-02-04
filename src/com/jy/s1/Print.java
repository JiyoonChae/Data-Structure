package com.jy.s1;

import java.util.Scanner;

public class Print {
	public static void main(String[] args) {
		/*
		 * System.out.printf("떡볶이: %d\n", 3000); System.out.printf("%d %d %d\n", 100,
		 * 90, 80); System.out.printf("이거야? : %s", "여기쓰면돼?");
		 */
		
		Scanner sc =new Scanner(System.in);
		System.out.println("입력");
		//char c = sc.next().charAt(0);
		//float f = sc.nextFloat();
		//int a = sc.nextInt();
		//int b = sc.nextInt();
		char x = sc.next().charAt(0);
		char y = sc.next().charAt(0);
		
		System.out.printf("%c %c \n", x, y);
		System.out.printf("%c %c \n", y, x);
		
	}
	
}

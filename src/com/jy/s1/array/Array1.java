package com.jy.s1.array;

import java.util.Scanner;

public class Array1 {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	String [] ar= new String[10];
	for(int i=0; i<ar.length; i++) {
		System.out.println("문자를 입력하시오");
		String s = sc.nextLine();
		ar[i] = s;
	}
	
	for(int i=0; i<ar.length; i++) {
		System.out.println("--------배열-----");
		System.out.println(ar[i]);
	}
}
}

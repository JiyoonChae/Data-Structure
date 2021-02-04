package com.jy.s1;

import java.util.Scanner;

public class Middle {
	//세 값의 중앙값
	
	static int med3(int a, int b, int c) {
		if(a>=b ) {         //1번이 2번보다 크거나 같으면
			if(b>= c)			//2번 3번 비교, 2번이 3번보다 크거나 같으면 1>=2>=3 
				return b;		//중간값은 b 
			else if (a<= c)   //2번이3번보다 작음, 그럼 1번,3번 비교-> 1번이 3번보다 작거나 같으면
				return a;		// 3>=1>=2  중간값은 a
			else 				//1번이 2번보다 크거나 같은데, 2번이 3번보다 작고, 1번이 3번보다 큰경우. 1>3>2  니까 
				return c;		//중간값은 c
		}else if(a>c){		//1,2번 비교시 1번이 2번보다 크거나 같지 않음 = 1번이 2번보다 작으면 여기로 내려옴-> 1,3 비교-> 1번이 3번보다크면
			return a;			//3<1<2  중간값은 a
		}else if(b>c) {      //1<2 작고, 1번이 3번보다 작고, 2번이 3번보다 큰 경우 -> 2>3>1 
			return c;			//중간값 c
		}else {					// 1<2 로 작고, 1<3 이고, 2<3 인 경우 1<2<3
			return b;			//중간값 b
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("세 정수의 중앙값 구하기");
		System.out.println("a값: ");
		int a = sc.nextInt();
		System.out.println("b 값");
		int b= sc.nextInt();
		System.out.println("c 값");
		int c= sc.nextInt();
		
		System.out.println("중앙값은" + med3(a,b,c) + "입니다.");
	}
}

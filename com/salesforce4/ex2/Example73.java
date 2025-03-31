package com.salesforce4.ex2;

import java.util.Scanner;

public class Example73 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("x 값 입력 : ");
		int x = scanner.nextInt();// 책 73페이지 nextline으로 되어 있길래. nextInt로 바꿔봄
		
		System.out.print("y 값 입력 : ");
		int y = scanner.nextInt();
		
		int sum = x + y;
		
		System.out.print("x + y: " +sum);

	}

}

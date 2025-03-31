package com.salesforce4.ex2;

import java.util.Scanner;

import jdk.javadoc.internal.doclets.toolkit.util.SummaryAPIListBuilder;

public class Problem4 {

	public static void main(String[] args) {
		// 정수로 된 돈의 액수를 입력받아 각 몇 개로 변환되는지 작성 하세요.
		// 오만, 만, 오천, 천, 오백, 백, 오십, 십, 오, 일
		
		int[] cash = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 }; //배열 선언
		Scanner scanner = new Scanner(System.in); //스캐너 객체 생성
		System.out.print("금액: "); //금액 출력
		int change = scanner.nextInt(); //인트 입력 읽는 변수 선언
		
		
		//for문으로 배열 값 계산, 입력값을 배열로 나누기. 다 나눠질 떄까지.
		for (int i : cash) {
			System.out.println(i+"원: " + change/i + "개");
			change= change%i;
		
			}
	}

}

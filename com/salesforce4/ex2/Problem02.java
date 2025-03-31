package com.salesforce4.ex2;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		// 5개 숫자 입력받아 평균 구하기
		Scanner scanner = new Scanner(System.in);
		double avg = 0.0;
		int [] num = new int [5];
		double sum = 0;
		
		for(int i=0; i<num.length; i++) {
			num[i] = scanner.nextInt();
			sum += num[i];
			
		}
		
		avg = sum / num.length;
		System.out.println("평균은" + avg + "입니다.");
	}

}

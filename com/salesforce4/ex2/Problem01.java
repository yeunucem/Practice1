package com.salesforce4.ex2;

import java.awt.image.DataBufferByte;

public class Problem01 {

	public static void main(String[] args) {
		// 3의 배수의 개수와 그 합을 아래와 같이 출력하세요.
		int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };
		int num3 = 0; // 개수에 해당하는 변수 선언
		int sum3 = 0; // 합에 해당하는 변수 선언
		// 주어진 배열에서 3의 배수의 개수 = ?
		// 주어진 배열에서 3의 배수의 합 = ?
		for (int temp : data) {
			if (temp % 3 == 0) {
				sum3 += temp;
				num3++;
			}
		}
		
		System.out.println("주어진 배열에서 3의 배수의 개수 => " + num3);
		System.out.println("주어진 배열에서 3의 배수의 합 => " + sum3);
	}
}

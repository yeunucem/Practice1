package com.salesforce4.ex2;

public class Problem03 {

	public static void main(String[] args) {
		// 주어진 문자열의 공백을 ','(콤마)로 변경
		 char c []= {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		    
		    int i = 0;
		    for(char temp : c) {
		      System.out.print(temp);
		      if( temp == ' ') {
		        c[i] = ',';
		      }
		      i++;
		    }
		    System.out.println();
		    
		    for(char temp : c) {
		      System.out.print(temp);
		    }
		    
	}

}

package com.mathamatics;

import java.util.Scanner;

public class TrailingZerosCountInFactorial {
	
	static int countZeros(int n) {
		int res = 1;
		int count = 0;
		
		for(int i=1;i<=n;i++) {
			res = res * i;
			res = res / 10;
			if(res % 10 ==0) {
				System.out.println(res);
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(countZeros(n));
	}
}

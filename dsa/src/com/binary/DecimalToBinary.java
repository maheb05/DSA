package com.binary;

import java.util.Scanner;

public class DecimalToBinary {
	static String decimalToBinary(int n) {
		String b = "";

		while (n >= 1) {
			int x = n % 2;
			n = n / 2;
			b = x + b;
		}
		return b;
	}
	
	static int binaryToDecimal(String b) {
		int result = 0;
		int powOf2 = 1;
		
		for(int i=b.length()-1;i>=0;i--) {
			if(b.charAt(i)=='1') {
				result = result + powOf2;
			}
			powOf2 = powOf2 * 2;
		}
		
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(decimalToBinary(n));
		//String b = scanner.next();
		//System.out.println(binaryToDecimal(b));
	}
}

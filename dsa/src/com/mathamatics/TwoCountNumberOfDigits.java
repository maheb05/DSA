package com.mathamatics;

import java.util.Scanner;

public class TwoCountNumberOfDigits {
	//Counting the number of digits
	static int countDigits(int n) {
		int count = 0;
		
		while(n != 0) {
			n = n / 10;
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		try {
			
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			System.out.println("Digit Count "+countDigits(n));
		}
		catch (Exception e) {
			System.out.println("Enter Integer ,Eg:12345..");
		}
	}
	
}

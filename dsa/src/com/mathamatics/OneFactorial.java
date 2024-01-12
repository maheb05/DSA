package com.mathamatics;

import java.util.Scanner;

public class OneFactorial {
	
	static int fact(int n) {
		int res = 1;
		
		for(int i=1;i<=n;i++) {
			//res = res * i;s
			res*=i;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number :");
		int n = scan.nextInt();
		int fact = 1;
//		for(int i=n;i>=1;i--) {
//			fact = fact*i;
//		}
		
		
//		for(int i=1;i<=n;i++) {
//			fact = fact* i;
//		}
//		System.out.println("factorial "+fact);
		System.out.println("Factorial is :"+ fact(n));
	}
}

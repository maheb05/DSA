package com.mathamatics;

import java.util.Scanner;

public class Divisors {
	static void divisors(int n) {
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}
	
	static void efficientDivisors(int n) {
		for(int i=1;i*i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
				System.out.println(n/i);
			}
		}
	}
	
	static void optimalDivisors(int n) {
		int i = 0;
		
		for(i = 1; i*i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
		
		for(;i>=1;i--) {
			if(n%i==0 && i != n/i) {
				System.out.println(n/i);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		//divisors(n);
		//efficientDivisors(n);
		optimalDivisors(n);
	}
}

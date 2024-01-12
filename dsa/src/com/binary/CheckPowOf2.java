package com.binary;

import java.util.Scanner;

public class CheckPowOf2 {
	//Brute Force
	static void powOf2(int n) {
		String b = "";
		
		while(n>=1) {
			int x = n % 2;
			n = n / 2;
			b = x + b;
		}
		
		int count = 0;
		for(int i=b.length()-1;i>=0;i--) {
			if(b.charAt(i)=='1') {
				count++;
			}
		}
		
		if(count ==1) {
			System.out.print(" is a power of 2");
		}else {
			System.out.print(" is not a power of 2");
		}
	}
	
	static boolean kerhainsAlgo(int n) {
		if(n==0) {
			return false;
		}
		
		return ((n&(n-1))==0);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		//powOf2(n);
		System.out.println(kerhainsAlgo(n));
	}
}

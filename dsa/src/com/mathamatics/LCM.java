package com.mathamatics;

import java.util.Scanner;

public class LCM {
	////// BRUTE FORCE...
	static int findLCM(int a, int b) {
		
		int max = Math.max(a, b);
		
		while(true) {
			if(max % a == 0 && max % b == 0) {
				break;
			}
			max++;
		}
		return max;
		
	}
	
	
	static int efficientLCM(int a, int b) {
		
		return a*b / GCDandHCF.euclideanGCDbyGabriel(a, b);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
//		System.out.println(findLCM(a, b));
		System.out.println(efficientLCM(a, b));
	}
}

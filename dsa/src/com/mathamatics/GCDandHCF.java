package com.mathamatics;

import java.util.Scanner;

public class GCDandHCF {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		//gcdNormal(a, b);
		//System.out.println(euclideanGCD(a, b));
		System.out.println(euclideanGCDbyGabriel(a, b));
	}
	
	/////BRUTE FORCE   
	static void gcdNormal(int a,int b) {
		int min = 0;
		
		if(a<b) {
			min = a;
		}
		else {
			min = b;
		}
		
		for(int i=min;i>=1;i--) {
			if(a%i==0 && b%i==0) {
				System.out.println(i);
				break;
			}
		}
	}
	
	//////EUCLIDEAN ALGORITHM OPTIMAL
	static int euclideanGCD(int a,int b) {
		
		while(a != b) {
			if(a>b) {
				a = a-b;
			}
			else {
				b = b - a;
			}
		}
		return a;
	}
	
	//////More Optimal by Gabrieal Lame
	static int euclideanGCDbyGabriel(int a,int b) {
		
		while(a!=0 && b!=0) {
			if(a > b) {
				a = a % b;
			}
			else {
				b = b % a;
			}
		}
		if(a != 0) {
			return a;
		}
		else {
			return b;
		}
	}
}

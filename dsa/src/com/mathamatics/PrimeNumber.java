package com.mathamatics;

import java.util.Scanner;

public class PrimeNumber {
	///// BRUTE FORCE APPROACH
	static boolean isprime(int n) {
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
		
	}
	
	///////  EFFICIENT THAN PREVIOUS 
	static boolean isPrimeEfficient(int n) {
		
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	static boolean moreEfficientPrime(int n) {
		
		if(n==1) {
			return false;
		}
		
		if(n==2 || n==3) {
			return true;
		}
		
		if(n%2==0 || n%3==0) {
			return false;
		}
		
		for(int i=5;i<=Math.sqrt(n);i+=6) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	
	//// PRIMES IN A GIVEN RANGE
	
	static void printPrimes(int k) {
		
		for(int i=2;i<=k;i++) {
			if(moreEfficientPrime(i)) {
				System.out.println(i);
			}
		}
	}
	
	/// PRIMES IN A GIVE RANGE OPTIMAL
	
	static void primeRangeOptimal(int k) {
		
		boolean prime[] = new boolean[k+1];
		
		for(int i=2;i<=k;i++) {
			if(prime[i]==false) {
				for(int j=2*i; j<=k;j=j+i) {
					prime[j] = true;
				}
			}
		}
		
		for(int i=2;i<=k;i++) {
			if(prime[i]==false) {
				System.out.println(i);
			}
		}
	}
	
	
	////MORE OPTIMAL
	
	static void printPrimesMoreOptimal(int n) {
		boolean prime[] = new boolean[n+1];
		
		for(int i=2;i<=n;i++) {
			if(prime[i]==false) {
				for(int j=i*i;j<=n;j=j+i) {
					prime[j] = true;
				}
			}
		}
		
		for(int i=2;i<=n;i++) {
			if(prime[i] == false) {
				System.out.println(i);
			}
		}
	}
	
	/////	EFICIENT MORE THAN ANY ONE
	
	static void efficientPrimeINRange(int n) {
		boolean prime[] = new boolean[n+1];
		
		for(int i=2;i*i<=n;i++) {
			if(prime[i]==false) {
				for(int j=i*i;j<=n;j=j+i) {
					prime[j]= true;
				}
			}
		}
		
		for(int i=2;i<=n;i++) {
			if(prime[i]==false) {
				System.out.println(i);
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
//		System.out.println(isprime(n));
//		System.out.println(isPrimeEfficient(n));
//		System.out.println(moreEfficientPrime(n));
		
		//printPrimes(n);
		//primeRangeOptimal(n);
		printPrimesMoreOptimal(n);
	}
}

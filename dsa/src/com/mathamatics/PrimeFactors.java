package com.mathamatics;

import java.util.Scanner;

public class PrimeFactors {
	static void primeFactors(int n) {
		int i = 2;

		while (n > 1) {
			while (n % i == 0) {
				System.out.println(i);
				n = n / i;
			}
			i++;
		}
	}

	static void optimalPrimeFactors(int n) {
		int i = 2;

		while (i * i <= n) {
			while (n % i == 0) {
				System.out.println(i);
				n = n / i;
			}
			i++;
		}

		if (n > 1) {
			System.out.println(n);
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		// primeFactors(n);
		optimalPrimeFactors(n);
	}
}

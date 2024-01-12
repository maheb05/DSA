package com.binary;

import java.util.Arrays;
import java.util.Scanner;

public class LonelyInteger {
	// BRUTE FORCE
	static void lonelyInteger(int arr[]) {
		Arrays.sort(arr);
		int lonely = -1;
		int count = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				count++;
			} else {
				if (count == 1) {
					lonely = arr[i];
				}
				count = 1;
			}
		}
		if (count == 1) {
			lonely = arr[arr.length - 1];
		}
		System.out.println(lonely);
	}
	
	static int lonelyInt(int arr[]) {
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-2;i=i+2) {
			if(arr[i] != arr[i+1]) {
				return arr[i];
			}
		}
		return arr[arr.length-1];
		
	}

	static int efficientLonelyInteger(int arr[]) {
		int result = 0;
		
		for(int i : arr) {
			result = result ^ i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		//lonelyInteger(arr);
		//System.out.println(lonelyInt(arr));
		System.out.println(efficientLonelyInteger(arr));
	}
}

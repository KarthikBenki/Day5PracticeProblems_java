package com.practice;

import java.util.Scanner;

public class PowerOfTwo {
	public static void powerOfTwo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the power value of N");
		int N = scanner.nextInt();
		if (N < 31) {
			for (int i = 0, powerOfTwo = 1; i < N; i++) {
				System.out.println("2^" + i + " is " + powerOfTwo);
				powerOfTwo *= 2;
			}
		} else {
			System.out.println(N + " is greater than or equal to 31: ");
		}
		scanner.close();
	}

	public static void main(String[] args) {
		powerOfTwo();

	}

}

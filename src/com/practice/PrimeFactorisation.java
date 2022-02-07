package com.practice;

import java.util.Scanner;

public class PrimeFactorisation {
	public static void primeFactorisation() {
		int i = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of N");
		int N = scanner.nextInt();
		System.out.println("The prime Factors of a given number are: ");
		for (i = 2; i * i <= N; i++) {
			while (N % i == 0) {
				System.out.print(i + " ");
				N = N / i;
			}
		}
		if (N != 1) {
			System.out.println(N);
		}
		scanner.close();
	}

	public static void main(String[] args) {
		primeFactorisation();

	}

}

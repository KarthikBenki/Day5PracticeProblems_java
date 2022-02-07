package com.practice;

import java.util.Scanner;

public class EvenOdd {
	public static void evenOddCheck() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scanner.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is odd");
		}
		scanner.close();
	}

	public static void main(String[] args) {
		evenOddCheck();

	}

}

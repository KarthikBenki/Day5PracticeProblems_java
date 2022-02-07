package com.practice;

import java.util.Scanner;

public class SwapTwoNumbers {
	public static void swapTwoNumbers() {
		int num1 = 0, num2 = 0;
		System.out.println("Enter a two numbers to swap");
		Scanner scanner = new Scanner(System.in);
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		System.out.println("Tha numbers before swap 1)num1= " + num1 + " 2)num2= " + num2);
		num1 = num1 ^ num2;

		num2 = num1 ^ num2;
		num1 = num1 ^ num2;
		System.out.println("Tha numbers after swap 1)num1= " + num1 + " 2)num2= " + num2);
		scanner.close();
		
		
	}

	public static void main(String[] args) {
		swapTwoNumbers();
	}

}

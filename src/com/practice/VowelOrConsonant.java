package com.practice;

import java.util.Scanner;

public class VowelOrConsonant {
	public static void vowelCheck() {
		char ch;
		System.out.println("Enter a character");
		Scanner scanner = new Scanner(System.in);
		ch = scanner.next().charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Vowel");
		} else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			System.out.println("Vowel");
		} else {
			System.out.println("Consonant");
		}
		scanner.close();
	}

	public static void main(String[] args) {
		vowelCheck();
	}

}

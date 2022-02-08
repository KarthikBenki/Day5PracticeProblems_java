package com.practice;

import java.util.Scanner;

/*1. 2D Array
a. Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from
standard input and printing them out to standard output.
b. I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
c. Logic -> create 2 dimensional array in memory to read in M rows and N cols
d. O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with
OutputStreamWriter to print the output to the screen.
 */

public class TwoDimentionalArray {
	public static void print2DArray(int a[][]) {
		System.out.println("the two dimentional array is");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void scan2Darray(int arr[][]) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the value of M rows and N columns");
		Scanner scanner = new Scanner(System.in);
		int M = scanner.nextInt();
		int N = scanner.nextInt();
		int[][] arr = new int[M][N];
		scan2Darray(arr);
		print2DArray(arr);

	}

}

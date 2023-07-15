package com.interviewprepJava.day3;

public class Programs {

	public static void main(String[] args) {
		program1();

		int maxValue = program2();
		System.out.println(maxValue);

		program3("Hello", "Hello");

		pattern1();
		pattern2();
		pattern3();

	}

	public static void program1() {
		// To swap two numbers without using third number/variable
		int x = 1;
		int y = 2;

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println(x);
		System.out.println(y);

	}

	public static int program2() {
		// find largest number in an integer array
		int[] arr = { 10, 20, 50, 40, 30, 90 };

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}

	public static void program3(String S1, String S2) {
		// how to compare two strings?
		if (S1.compareTo(S2) == 0) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}

	}

	public static void pattern1() {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pattern2() {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pattern3() {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 5; i++) {

			for (int j = 4; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void program4() {
		//print prime numbers 
		//determine Armstrong number
		//Floyd's triangle
		//number is palindrome or not
		//String related programs
		 // reverse a String
		// String is palindrome or not
		
	}

}

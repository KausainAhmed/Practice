package GreatLearning;

import java.util.Scanner;

public class PalindromeDemo {
	public static void main(String[] args) {
		int rem, num, rev = 0, a;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to be checked");
		num = sc.nextInt();
		a = num;
		while (num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (a == rev) {
			System.out.println("the num " +a + " is a palindrome");
		} else {
			System.out.println("the num " + a+ " is not a palindrome");
		}
	}
}

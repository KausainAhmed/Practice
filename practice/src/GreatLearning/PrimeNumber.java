package GreatLearning;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		while(true) {
		int i, a = 0, num;
		System.out.println("Enter a number to check");
		System.gc();
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		for (i = 2; i <= num-1; i++) {
			if (num % i == 0) {
				a = a + 1;
			}
		}
		if (a > 0) {
			System.out.println(num + " is not a prime number");
		} else {
			System.out.println(num + " is a prime number");
		}
	}}
}

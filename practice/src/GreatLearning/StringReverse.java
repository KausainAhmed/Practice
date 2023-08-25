package GreatLearning;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		String rev="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String input = sc.nextLine();
		int length = input.length();
		System.out.println("Length of String is = " + length);
		for (int i = length-1; i >= 0; i--) {
			rev=rev+input.charAt(i);
		}
		System.out.println("reverse of String = "+rev);
	}
}
    
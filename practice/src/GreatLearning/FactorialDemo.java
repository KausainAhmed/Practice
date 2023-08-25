package GreatLearning;

import java.util.Scanner;

public class FactorialDemo {
	public static void main(String[] args) {
		int f=1, i, n;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		for(i=1;i<n+1;i++) {
			f=f*i;}
		System.out.println("Factorial of "+n+" is "+f);
		}
	}


package GreatLearning;

import java.util.Scanner;

public class Fibbo {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1, next, i, input;
		System.out.println("Enter a range for fibonacci series");
		Scanner sc = new Scanner(System.in);
		input=sc.nextInt();
		for(i=0;i<input;i++) {
			if(i<=1) {
				next=i;}
			else {
				next=n1+n2;
				n1=n2;
				n2=next;
			}
			System.out.print(" "+next);
		}
	}
}

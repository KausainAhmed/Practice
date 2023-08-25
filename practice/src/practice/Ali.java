package practice;

import java.util.Scanner;

public class Ali {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of students");
	int n=sc.nextInt();
	System.out.println("Enter names");
	for(int i=0;i<n;i++) {
		String name=sc.nextLine();
	}
	System.out.println("Enter marks");
	for(int j=0;j<n;j++) {
		int marks=sc.nextInt();
	}
	System.out.println("end");
}
}

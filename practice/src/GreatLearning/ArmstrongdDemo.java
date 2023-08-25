package GreatLearning;

import java.util.Scanner;

public class ArmstrongdDemo {
public static void main(String[] args) {
	int num=153, rem, sum=0,a;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to check");
	 num=sc.nextInt();
	 a=num;
	 while(num>0) {
		 rem=num%10;
		 sum=sum+rem*rem*rem;
		 num=num/10;
	 } 

	 if(a==sum) {
		 System.out.println(a+" is an Armstrong Number");
	 }else {
		 System.out.println(a+" is not an Armstrong Number");
	 }
	
}
}

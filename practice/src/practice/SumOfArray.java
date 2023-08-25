package practice;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 5, 6 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			sum = sum + a[i];

		}
		System.out.println(sum);
	}
}

class SumArray {
	public static void main(String[] args) {

		int sum = 0;
		int[] arr1 = new int[3];
		arr1[0] = 3;
		arr1[1] = 4;
		arr1[2] = 5;
		for (int i : arr1) {
			System.out.print(i+" ");
			sum = sum + i;
		}
		System.out.println();

		System.out.println("Sum of Array = " + sum);
		System.out.println("Enter size of second array");

		Scanner sc = new Scanner(System.in);
		int int1 = sc.nextInt();
		int[] arr2 = new int[int1];
		System.out.println("Enter values of second array");
		for (int k = 0; k < arr2.length; k++) {
			arr2[k] = sc.nextInt();
			//System.out.print(arr2[k]+" ");
		} 
		for (int i : arr2) {
			System.out.print( i+" ");
		}
		
		System.out.println("-----------Sum of array1 and array2-----------");
		if (arr1.length != arr2.length) {
			System.out.println("Length must be same to add two arrays");
			return;
		}
		int[] arr3 = new int[arr1.length];
		for (int l = 0; l < arr1.length; l++) {
			arr3[l] = arr1[l] + arr2[l];
		}
		System.out.println("Sum of two array is ");
		for (int x : arr3) {
			System.out.print(x + " ");
		}
	}
}
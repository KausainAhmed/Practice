package practice;

public class ArrayDemo {
public static void main(String[] args) {
	int a[][]= {{1,1,1,1},{2,2,2,2},{3,3,3,3}};
	
	
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<=a.length;j++) {
			System.out.print(a[i][j]);
		}
		System.out.println();
	}
}
}

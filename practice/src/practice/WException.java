package practice;

public class WException {
public static void main(String[] args) {
	int i=0;
	while(i<10) {
		System.out.println("Hello");
		i++;
		System.out.println(i/0);
		System.out.println("loop");
	}
}
}

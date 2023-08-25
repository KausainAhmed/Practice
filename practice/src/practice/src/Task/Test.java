package practice.src.Task;

public class Test {
	public static void main(String[] args) {
		{
			System.out.println("block");
		}
		System.out.println("main");
	}

	static void m1() {
		System.out.println("m1");

		{
			System.out.println("static block");
		}
	}

}

package practice;

public class StrRevDemo {
	public static void main(String[] args) {
		String input = "hello", rev = "", temp;
		temp = input;
		int length = input.length();
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + input.charAt(i);
		}
		System.out.println(rev);
	}
	
}
class Buffer {
	public static void main(String[] args) {
		String str="Kausain";
		StringBuffer sb=new StringBuffer(str);
		/*
		 * StringBuffer rev = sb.reverse(); 
		 * System.out.println(rev);
		 */
		System.out.println(sb.reverse());
	}
}

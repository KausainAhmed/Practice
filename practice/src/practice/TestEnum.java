package practice;

public class TestEnum {
public static void main(String[] args) {
	Week w[]=Week.values();
	for (Week day : w) {
System.out.println(day+" "+day.ordinal()+" "+day.getDay());
	}
}
}

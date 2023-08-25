package practice;

public class Ammar {
	 String name;
public static void main(String[] args) {
	
	String a="ammar";
	String b=a;
	a="lol";
	
	System.out.println(a);
	
	Ammar c=new Ammar();
	c.name="ammar";
	Ammar d=new Ammar();
	 d=c;
	// System.out.println(d.name);
	c.name="change";
	System.out.println(d.name);
}
}

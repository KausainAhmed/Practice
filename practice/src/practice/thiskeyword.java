package practice;

 class A {
  int a=10;
}

 class B extends A {
	 int a=20;
	 void m1() {
		 super.a=100;
		 System.out.println(a); //to print parent, use super.a
		 System.out.println(a);// contains this by-default
	 }
 public static void main(String[] args) {
	B b=new B();
	b.m1();
 }
}
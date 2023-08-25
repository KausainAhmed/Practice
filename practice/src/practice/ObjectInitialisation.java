package practice;


// 3 methods to initialise an object
// 1.By reference variable

 class ObjectInitialisation {
int id;
String name;

public static void main(String[] args) {
	ObjectInitialisation o=new ObjectInitialisation();
	
	o.id=11;
	o.name="xoxo";
	
	System.out.println(o.id);
	System.out.println(o.name);
}
}

// 2. Through method

 class ObjectInitialisation2 {
int id;
String name;

void insertRecord(int id,String name) {
	this.id=id;
	this.name=name;
	show();
}
 void show() {
	 System.out.println("id ="+id+" name= "+name);
 }
public static void main(String[] args) {
	ObjectInitialisation2 o2=new ObjectInitialisation2();
	o2.insertRecord(121,"xoxo");
	
}
}

 // 3. Initialization through constructor

 class objectInitialisation3 {
	 int id;
	 String name;
	 objectInitialisation3(int id,String name){
		 this.id=id;
		 this.name=name;
		 
	 }
	 void display() {
		 System.out.println("id = "+id+" "+"name ="+name);
	 }
	 public static void main(String[] args) {
	 
	objectInitialisation3 o3=new objectInitialisation3(111,"xoxo"); 
 o3.display();	
 }
 }
package collectionx;
import java.util.*;

public class Listx {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>();
	al.add("one");
	al.add("two");
	al.add("three");
	al.add("four");
	
	//Collections.sort(al);  sort ascending order
	Iterator<String> itr=al.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}

	//xxxxxxxxx----------------xxxxxxxxxxx-------------xxxxxxxx
	System.out.println();
	LinkedList<String> ll=new LinkedList<>();
	ll.add("one");
	ll.add("two");
	ll.add("three");
	ll.add("four");
	
	//Collections.sort(ll);  sort ascending order
	Iterator<String> itr1=al.iterator();
	while(itr1.hasNext()) {
		System.out.println(itr1.next());
	
}
	
	//xxxxxxxx-----------xxxxxxxxxxxxx-----------xxxxxxxxxx
	System.out.println();
	Vector<String> v=new Vector<>();
	v.add("one");
	v.add("two");
	v.add("three");
	v.add("four");
	
	//Collections.sort(al);  sort ascending order
	Iterator<String> itr2=al.iterator();
	while(itr2.hasNext()) {
		System.out.println(itr2.next());
}}
}

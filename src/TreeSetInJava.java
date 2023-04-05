import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet t= new TreeSet<>();
		t.add(10);
		t.add(20);
		t.add(30);
		t.add(40);
		t.add(50);
		t.add(15);
		t.add(6);
	    //NavigableSet nav=t.descendingSet();
	    //System.out.println(t.pollLast());
	      SortedSet s=t.headSet(32);
	      
	      SortedSet s1 = t.tailSet(32);
	    
//	    System.out.println(nav);
//		System.out.println(t.add(10));
		System.out.println(t);
		System.out.println(s1);

	}

}

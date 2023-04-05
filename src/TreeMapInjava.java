import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapInjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap tm= new TreeMap<>();
		tm.put(1010, "ajay");
		tm.put(1008, "tom");
		tm.put(1009, 10);
		tm.put(1005, "bob");
		tm.put(1007, "tom1");
		
	   
		NavigableMap<Integer, Object> nm=  tm.descendingMap();
		
		System.out.println(tm.);
		System.out.println(nm);
		

	}

}

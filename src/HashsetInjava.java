import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashsetInjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList<>();
        al.add(10);
		al.add(300);
		al.add('c');
		al.add(30);
		
		
		
		
		
		
		HashSet hs= new HashSet<>();
		hs.add(10);
		hs.add("tom");
		hs.add('c');
		hs.add(10.20f);
		System.out.println(hs.add(30));
		hs.add(null);
		System.out.println(hs);
		//hs.retainAll(al);
		System.out.println(hs);
		
		Iterator itr=hs.iterator();
		 while(itr.hasNext()) {
			 Object obj= itr.next();
			 itr.
			 System.out.println(obj);
		 }
		 
		
		
		
		
//		for(Object obj:hs) {
//			System.out.println(obj);
//		}

	}

}

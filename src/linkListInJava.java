import java.util.LinkedList;
import java.util.ListIterator;

public class linkListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ll= new LinkedList<>();
		ll.add(10);
		ll.add("tom");
		ll.add(10.30f);
		ll.add('c');
		ll.add(10);
		ll.add(true);
		ll.add(null);
		

        ListIterator itr= ll.listIterator();
        while(itr.hasNext()) {
        	Object obj=itr.next();
        	System.out.println(obj);
        	if(obj==Character.valueOf('c')) {
        		System.out.println("next index"+itr.nextIndex());
        		System.out.println("previous index"+itr.previousIndex());
        		itr.
        	}
        
        }
        
        
     
		

	}

}

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap hm= new HashMap<>();
		hm.put(1001, "tom");
		hm.put(1003, "bob");
		hm.put(1002,100 );
		hm.put("t001", null);
		hm.put(null, 'c');
		hm.put(1002,"Ajay");
		//
		hm.replace(1003,"bob","abc");
		
		//using entrySet
		
//		for(Map.Entry<Object,Object> eachEntry:hm.entrySet()) {
//			System.out.println(eachEntry.getKey()+"-001 "+eachEntry.getValue());
//		}
		
		// 2. keySet and valueSet
	
//		for(Object eachKey: hm.keySet()) {
//			System.out.println("Key="+eachKey+" value="+hm.get(eachKey));
//		}
//		
//		for(Object eachValue: hm.values()) {
//			System.out.println("value="+eachValue);
//		}
		
		// 3rd way 
		
		 Iterator itr=hm.entrySet().iterator();
		 
		 while(itr.hasNext()) {
			 Map.Entry eachEntry=(Entry) itr.next();
			 System.out.println(eachEntry.getKey()+" "+ eachEntry.getValue());
		 }
	
	}

}

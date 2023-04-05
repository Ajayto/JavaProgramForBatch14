import java.util.ArrayList;
import java.util.Vector;

public class vectorInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al= new ArrayList<>();
		al.add(100);
		al.add(200);
		al.add(300);
		
		
		
		Vector v= new Vector<>();
		v.addElement(10);
		v.addElement("tom");
		v.addElement('c');
		v.addElement(10);
		v.addElement(null);
		v.addElement(10.10f);
		v.addElement(true);
		v.addElement(200);
		v.addElement(300);
		v.addElement(200);
		System.out.println(v);
        v.removeAll(al);
        
//        for(Object obj:v) {
//        	System.out.println(obj);
//        }

        for(int i=0;i<v.size();i++) {
        	System.out.println(v.get(i));
        }
//		System.out.println(v);
//		System.out.println(al);
		

	}

}

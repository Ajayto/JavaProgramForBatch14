import java.util.ArrayList;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al1= new ArrayList<>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		
		System.out.println("al1="+al1);
		
		
		
		ArrayList al= new ArrayList<>();
		al.add("Tom");
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(10);
		al.add(20.30f);
		al.add('c');
		al.add(null);
		al.add("Tom");
		
        al.add(1, "bob");
        
        al.addAll(al1);
        
        
        //al.addAll(al1);
        //al.addAll(5, al1);
        
        //System.out.println(al.contains("Tom"));
        
        
        
       // System.out.println(al.containsAll(al1));
        
        //System.out.println(al.get(4));
        //System.out.println(al.lastIndexOf("Tom"));
//        al.remove(1);
//        al.remove(20.30f);
//        
//        al.remove(Integer.valueOf(10));
        System.out.println("al="+al);  
        al.removeAll(al1);
        System.out.println("al="+al);
        
        
        
       
        
        
        //al.clear();
        
		//System.out.println("al="+al);

	}

}

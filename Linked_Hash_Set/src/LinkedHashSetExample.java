import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		   LinkedHashSet<String> set = new LinkedHashSet<>();
	        set.add("Apple");
	        set.add("Banana");
	        set.add("Orange");
	        set.add("Apple"); 

	        System.out.println(set); 
	    }
}

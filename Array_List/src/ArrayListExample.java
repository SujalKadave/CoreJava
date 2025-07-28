import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

		  public static void main(String[] args) {
		        List<String> arrayList = new ArrayList<>();
		        
		 
		        arrayList.add("Apple");
		        arrayList.add("Banana");
		        arrayList.add("Cherry");

		        System.out.println("Element at index 1: " + arrayList.get(1));
		        System.out.println("ArrayList elements:");
		        for (String fruit : arrayList) {
		            System.out.println(fruit);
		        }

			Iterator<String> i= arrayList.iterator();
				while(i.hasNext()) {
					System.out.println(i.next());

				}
		  }	
	}
import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
     List<String> vector = new Vector<>();
        
       
        vector.add("Red");
        vector.add("Green");
        vector.add("Blue");


        System.out.println("Element at index 2: " + vector.get(2)); 

       
        System.out.println("Vector elements:");
        for (String color : vector) {
            System.out.println(color);
        }

      
        vector.add("Yellow");
        System.out.println("After adding Yellow: " + vector);
    }
}
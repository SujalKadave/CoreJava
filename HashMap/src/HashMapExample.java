import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);

        System.out.println(map); // Output: {Apple=1, Banana=2, Orange=3}
        System.out.println("Apple count: " + map.get("Apple")); // Output: Apple count: 1
        map.remove("Banana");
        System.out.println("After removal: " + map); // Output: {Apple=1, Orange=3}
    }
}
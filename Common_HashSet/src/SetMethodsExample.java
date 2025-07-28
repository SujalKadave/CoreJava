import java.util.HashSet;

public class SetMethodsExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        System.out.println("Set contains Banana: " + set.contains("Banana")); // true
        System.out.println("Set size: " + set.size()); // 3
        set.remove("Apple");
        System.out.println("Set after removing Apple: " + set); // [Banana, Orange]
        set.clear();
        System.out.println("Is set empty: " + set.isEmpty()); // true
    }
}


package collections;
import java.util.ArrayList;
import java.util.Collections;

public class Arraylistdemo2 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");
        System.out.println("Fruits list: " + fruits);
        System.out.println("Size: " + fruits.size());

        System.out.println("First fruit: " + fruits.get(0));
        System.out.println("Last fruit: " + fruits.get(fruits.size() - 1));

        fruits.add(1, "Mango");
        System.out.println("After inserting Mango: " + fruits);

        fruits.remove("Apple");
        fruits.remove(2);
        System.out.println("After removing: " + fruits);

        if (fruits.contains("Banana")) {
            System.out.println("Banana is in the list!");
        }
        System.out.println("\nIterating through fruits:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }
        Collections.sort(fruits);
        System.out.println("Sorted fruits: " + fruits);
        fruits.clear();
        System.out.println("After clearing: " + fruits);
        System.out.println("Is empty? " + fruits.isEmpty());
    }
}
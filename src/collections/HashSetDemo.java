package collections;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> num = new HashSet<>();
        num.add(5);
        num.add(10);
        num.add(5); // duplicate
        num.add(15);
        System.out.println("my numbers: " + num);
        System.out.println("size: " + num.size());
        if(num.contains(10)) {
            System.out.println("found 10!");
        }
        num.remove(5);
        System.out.println("after removing 5: " + num);
    }
}
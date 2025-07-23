package java_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sortingwithlambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob", "David");
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
        System.out.println(names);
    }
}

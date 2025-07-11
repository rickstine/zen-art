package collections;
import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> idSet = new HashSet<>();
        idSet.add("ID001");
        idSet.add("ID002");
        idSet.add("ID001");
        System.out.println("ID Set: " + idSet);
    }
}
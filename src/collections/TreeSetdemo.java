package collections;
import java.util.TreeSet;

public class TreeSetdemo {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(85);
        scores.add(92);
        scores.add(78);
        scores.add(95);
        scores.add(85);

        System.out.println("my scores (sorted): " + scores);
        System.out.println("total scores: " + scores.size());

        System.out.println("highest score: " + scores.last());
        System.out.println("lowest score: " + scores.first());

        scores.add(88);
        scores.add(90);

        System.out.println("after adding more: " + scores);

        scores.remove(scores.first());
        System.out.println("after removing lowest: " + scores);
        if(scores.contains(90)) {
            System.out.println("yes, i got 90!");
        }
    }
}
import java.util.Arrays;


public class Arraysort{
public static void main(String[] args) {
    String[] arr = {"apple", "banana", "pear", "grape", "watermelon"};

    Arrays.sort(arr, (a, b) -> b.length() - a.length());

    for (String s : arr) {
        System.out.println(s);
        }
    }
}

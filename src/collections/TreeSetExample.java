package collections;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args){
    TreeSet t = new TreeSet();
        t.add(new StringBuffer("B"));
        t.add(new StringBuffer("D"));
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("C"));
    System.out.println(t);
}
}
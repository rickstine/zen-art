package collections;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueueDemo {
    public static void main(String[] args) {
        Queue<String> Participent = new LinkedList<>();
        Participent.offer("arun");
        Participent.offer("varun");
        Participent.offer("tarun");
        Participent.offer("george");

        System.out.println("Participents : " + Participent);
        System.out.println("Number of Participents  : " + Participent.size());


        System.out.println("first Participent: " + Participent.peek());

        System.out.println("removing first Participent: " + Participent.poll());

        System.out.println("remaining Participents: " + Participent);

        Participent.offer("mika");
        Participent.offer("govardhan");

        System.out.println("after more people joined: " + Participent);
        while(!Participent.isEmpty()) {
            System.out.println("serving: " + Participent.poll());
        }

        System.out.println("list  is now empty: " + Participent.isEmpty());


    }
}
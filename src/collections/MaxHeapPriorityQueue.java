package collections;

import java.util.*;

public class MaxHeapPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);

        System.out.println("Priority Queue (Max-Heap): " + pq);

        while (!pq.isEmpty()) {
            System.out.println("Removed: " + pq.poll());
        }
    }
}


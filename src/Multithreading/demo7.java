package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable {
    private int id;
    public MyTask(int id) {
        this.id = id;
    }
    public void run() {
        System.out.println("Task " + id + " is being executed by " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class demo7 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3); // 3 worker threads
        for (int i = 1; i <= 6; i++) {
            executor.execute(new MyTask(i));
        }
        executor.shutdown();
    }
}

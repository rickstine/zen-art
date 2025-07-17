package Multithreading;

class Resource {
    public synchronized void use(Resource other) {
        System.out.println(Thread.currentThread().getName() + " locked " + this);
        try { Thread.sleep(100); } catch (Exception e) {}
        System.out.println(Thread.currentThread().getName() + " trying to lock " + other);
        synchronized (other) {
            System.out.println(Thread.currentThread().getName() + " locked both resources");
        }
    }
}
public class demo8 {
    public static void main(String[] args) {
        Resource r1 = new Resource();
        Resource r2 = new Resource();

        Thread t1 = new Thread(() -> r1.use(r2), "Thread-1");
        Thread t2 = new Thread(() -> r2.use(r1), "Thread-2");

        t1.start();
        t2.start();
    }
}
